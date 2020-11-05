package taskat3;

import java.util.List;

public class CaloriesCalculation {
    public static int caloriesCalculation(List<Vegetable> vegetableList) {
        int calories = 0;
        for (Vegetable vegetable : vegetableList) {
            calories += vegetable.getCalories();
        }
        return calories;
    }
}