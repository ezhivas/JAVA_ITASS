package taskat3;


import java.util.ArrayList;

public abstract class Vegetable {

    String [] vegetablesNames = {"potato" ,"carrot" ,"tomato" , "cucumber"};
    String [] colors = {"grey", "red", "red", "green"};
    int[] weight = {10,20,15,12};
    int[] calories = {100, 120,15, 23};

    public Vegetable(String[] vegetablesNames, String[] colors, int[] weight, int[] calories) {
        this.vegetablesNames = vegetablesNames;
        this.colors = colors;
        this.weight = weight;
        this.calories = calories;
    }
    Vegetable veg1 = new Vegetable(vegetablesNames[1],colors[1],) {
    }
}