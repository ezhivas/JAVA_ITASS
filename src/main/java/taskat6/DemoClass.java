package taskat6;

import java.util.Arrays;

public class DemoClass {
    public static void main(String[] args) {
        System.out.println("Starting test.");
        testClass();
    }
    static void testClass() {
        System.out.println("Printing all elements");
        System.out.println(Arrays.toString(EnumDays.values()));
        System.out.println("Printing bad days:");
        boolean b;
        for (EnumDays days : EnumDays.values()) {
            b = days.badDay();
            if (b) System.out.println("Day number: " + days.getNumber() + " name: " + days.getTitle());
        }
        System.out.println("Printing good states of the days");
        for (EnumDays days : EnumDays.values()) {
            b = days.badDay();
            if (!b) System.out.println("Good day status: " + days.getState());
        }
    }
}
