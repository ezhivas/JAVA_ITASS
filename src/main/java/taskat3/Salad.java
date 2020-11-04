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

    ;

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

    public Salad setComponent(Vegetable v) {
        this.salad.add(v);
        return this;
    }

    private int foodValue() {
        int value = 0;
        for (Vegetable c : salad) {
            value += Math.round((double) c.getWght() * c.getCalories() / 100);
        }
        return value;
    }

    @Override
    public String toString() {
        salad.sort(new TypeComparator());
        String smin = "";
        String smax = "";
        int salcalor = this.foodValue();
        String s = "Salad " + this.getName() + (char) 13 + "-------------------" + (char) 13;
        for (Vegetable v : salad) {
            long c = Math.round((double) v.getWght() * v.getCalories() / 100);
            if (c < .1 * salcalor) smin += v.getName() + "  ";
            if (c > .5 * salcalor) smax += v.getName() + "  ";
            s = s + v.getName() + "  " + v.getWght() + " г  " + v.cooking() + (char) 13;
        }

        return s + "Calories " + salcalor + " Cal" + (char) 13
                + "___________________" + (char) 13
                + "Maximum calories: "
                + smax + (char) 13
                + "Minimum calories: " + (char) 13
                + smin;

    }

    private static class TypeComparator implements Comparator<Vegetable> {
        @Override
        public int compare(Vegetable vegetable1, Vegetable vegetable2) {
            if (vegetable1.getClass() == vegetable2.getClass()) {
                System.out.println("This vegetables are equal");
                return 0;
            } else if (vegetable1.getClass().hashCode() > vegetable2.getClass().hashCode()) {
                System.out.println("The first vegetable greater");
                return 1;
            } else if (vegetable1.getClass().hashCode() < vegetable2.getClass().hashCode()) {
                System.out.println("The second vegetable is greater");
                return -1;
            }
            return 0;
        }

    }

}
