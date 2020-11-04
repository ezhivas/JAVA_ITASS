package taskat3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Salad {

    String name;
    List<Vegetable> salad;

    Salad() {
        salad = new ArrayList<Vegetable>();
    }
    Salad(String name, Vegetable... components) {
        this.name = name;
        salad = new ArrayList<Vegetable>();
        this.salad.addAll(Arrays.asList(components));
    }
    private String getName() {
        return name;
    }
    public Salad setName(String name) {
        this.name = name;
        return this;
    }
    public Salad setComponent(Vegetable vegetable) {
        this.salad.add(vegetable);
        return this;
    }
    private int saladValue() {
        int value = 0;
        for (Vegetable vegetable : salad) {
            value += Math.round((double) vegetable.getWeight() * vegetable.getCalories() / 100);
        }
        return value;
    }
    @Override
    public String toString() {
        salad.sort(new TypeComparator());
        String minVegetable="";
        String maxVegetable="";
        int saladCalories = this.saladValue();
        String str = "Salad #" + this.getName() + "#" + "\n-------------------\n";
        for (Vegetable vegetable : salad) {

            str += vegetable.getName() + " \n" + vegetable.getWeight() + " g\n" + vegetable.cooking();
            long caloriesVegetableInSalad = Math.round((double) vegetable.getWeight() * vegetable.getCalories() / 100);
            if (caloriesVegetableInSalad < 0.1 * saladCalories) minVegetable += vegetable.getName() + " \n";
            if (caloriesVegetableInSalad > 0.5 * saladCalories) maxVegetable += vegetable.getName() + " \n ";
        }

        return str + "\n___________________\n" +
                "Total salad calories: " + saladCalories + " Cal"
                + "\nMaximum calories:"
                + maxVegetable
                + "Minimum calories: "
                + minVegetable;

    }

    private static class TypeComparator implements Comparator<Vegetable> {
        @Override
        public int compare(Vegetable vegetable1, Vegetable vegetable2) {
            if (vegetable1.getClass().equals(vegetable2.getClass())) {

                return 0;
            } else if (vegetable1.getClass().hashCode() > vegetable2.getClass().hashCode()) {

                return 1;
            } else if (vegetable1.getClass().hashCode() < vegetable2.getClass().hashCode()) {

                return -1;
            }
            return 0;
        }

    }

}
