package taskat3;

import java.util.ArrayList;

public class Chief {
    ArrayList<Vegetable> salad = new ArrayList<>();

    public void add(String Name, String Color, double Weight, int Calories) {
        Vegetable vegetable = new Vegetable(Name, Color, Weight, Calories);
        salad.add(vegetable);
    }

    public boolean compareVegetables(Vegetable vegetable1, Vegetable vegetable2) {
        return vegetable1.equals(vegetable2);
    }

    public ArrayList<Vegetable> getSalad() {
        return salad;
    }

    public int getSaladCalories() {
        return CaloriesCalculation.caloriesCalculation(salad);
    }

    public void DeleteAllVegetables() {
        salad.clear();
    }

    public void DeleteByName(String deleteByName) {
        salad.removeIf(str1 -> str1.getName().equals(deleteByName));
    }

    public void DeleteByColor(String deleteByColor) {
        salad.removeIf(str1 -> str1.getColor().equals(deleteByColor));
    }

    public void View() {
        for (Object object : salad) {
            System.out.println(object.toString());
        }
    }
}