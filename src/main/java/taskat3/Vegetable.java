package taskat3;

import java.util.Objects;

public class Vegetable extends Chief {
    private final String name;
    private final String color;
    private final double weight;
    private final double calories;

    public Vegetable(String Name, String Color, double Weight, int Calories) {
        this.name = Name;
        this.color = Color;
        this.weight = Weight;
        this.calories = Calories;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Vegetable vegetable = (Vegetable) object;
        return Double.compare(vegetable.getWeight(), getWeight()) == 0 &&
                Double.compare(vegetable.getCalories(), getCalories()) == 0 &&
                Objects.equals(getName(), vegetable.getName()) &&
                Objects.equals(getColor(), vegetable.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getWeight(), getCalories());
    }

    @Override
    public String toString() {
        return "[ Vegetable : " + getName() + ", Color - " + getColor()
                + ", Weight - " + getWeight() + " Calories - " + getCalories() + " ]";
    }
}
