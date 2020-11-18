package taskat6;

public class DemoClass {
    public static void main(String[] args) {
        System.out.println("Getting Enum elements");
        EnumDays.getElementsOfEnum();
        System.out.println("Getting days by day status (not bad):");
        EnumDays.getGoodDays();
        System.out.println("Getting day with status 'bad'");
        System.out.println(EnumDays.getDayByDayState("bad"));

    }
}
