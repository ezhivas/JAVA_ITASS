package taskat3;

import java.util.Comparator;

public class DemoClass {
    public static void main(String[] args) {

        Chief mySalad = new Chief();

        mySalad.add("Carrot", "orange", 100, 60);
        mySalad.add("Potato", "yellow", 500, 40);
        mySalad.add("Tomato", "red", 50, 100);
        mySalad.add("Ononi", "white", 10, 3);

        System.out.println("Vegetables equals : " + mySalad.compareVegetables(mySalad.getSalad().get(2), mySalad.getSalad().get(3)));
        System.out.println("Getting salad components:");
        mySalad.View();
        System.out.println("Calories in Salad at the moment: " + mySalad.getSaladCalories());
        System.out.println("Deleting Onion from salad");
        mySalad.DeleteByName("Onion");
        mySalad.View();
        System.out.println("Calories in Salad at the moment: " + mySalad.getSaladCalories());
        System.out.println("Deleting yellow vegetable from salad");
        mySalad.DeleteByColor("yellow");
        mySalad.View();
        System.out.println("Calories in Salad at the moment: " + mySalad.getSaladCalories());
        System.out.println("Sorting salad by calories from bigger to smaller");
        mySalad.salad.sort(Comparator.comparing(Vegetable::getCalories).reversed());
        mySalad.View();
        System.out.println("Calories in Salad at the moment: " + mySalad.getSaladCalories());
        System.out.println("Delete all from Salad");
        mySalad.DeleteAllVegetables();
        mySalad.View();
        System.out.println("Calories in Salad at the moment: " + mySalad.getSaladCalories());


    }
}
