package taskat6;

import java.util.Arrays;

public enum EnumDays {

    ONE("Monday", 1, "very bad"),
    TWO("Tuesday", 2, "bad"),
    THREE("Wednesday", 3, "middle of the week"),
    FOUR("Thursday", 4, "about nothing"),
    FIVE("Friday", 5, "soon be better"),
    SIX("Saturday", 6, "The Best"),
    SEVEN("Sunday", 7, "good");

    private final String dayValue;
    private final int dayNumber;
    private final String dayState;

    EnumDays(String dayValue, int dayNumber, String dayState) {
        this.dayValue = dayValue;
        this.dayNumber = dayNumber;
        this.dayState = dayState;
    }

    public String getTitle() {
        return dayValue;
    }

    public String getState() {
        return dayState;
    }

    public int getNumber() {
        return dayNumber;
    }

    public boolean badDay() {
        return dayState.contains("bad");
    }

    @Override
    public String toString() {

        return "DayOfWeek ---" +
                "name='" + dayValue + " day mood: " + dayState + '\n';
    }

    public static void getElementsOfEnum() {
        System.out.println("Printing all elements");
        System.out.println(Arrays.toString(EnumDays.values()));
        System.out.println("Printing bad days:");
        boolean b;
        for (EnumDays days : EnumDays.values()) {
            b = days.badDay();
            if (b) System.out.println("Day number: " + days.getNumber() + " name: " + days.getTitle());
        }
    }

    public static void getGoodDays() {
        System.out.println("Printing good states of the days");
        boolean b;
        for (EnumDays days : EnumDays.values()) {
            b = days.badDay();
            if (!b) System.out.println("Good day status: " + days.getState());
        }
    }

    public static String getDayByDayState(String state) {
        for (EnumDays days : EnumDays.values()) {
            if (days.dayState.equals(state))
                return days.dayValue;
        }
        return "Nothing found";
    }
}
