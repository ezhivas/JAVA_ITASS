package taskat6;

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
}

