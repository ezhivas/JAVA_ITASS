package taskat3;

public abstract class Vegetable {
    private int calorie;
    private final int weight;
    private final String name;
    private final VegetableCalList list = VegetableCalList.Vegetable;

   private enum VegetableCalList {Vegetable, CARROT, POTATO, CUCUMBER, TOMATO}

    Vegetable(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }
    abstract String cooking();
    int getCalories() {
        switch (VegetableCalList.valueOf(name)) {
            case CARROT:
                calorie = 66;
                break;
            case POTATO:
                calorie = 97;
                break;
            case CUCUMBER:
                calorie = 106;
                break;
            case TOMATO:
                calorie = 25;
                break;
            default:
                calorie = 0;
                System.out.println("No calories");
        }

        return calorie;
    }
    int getWeight() {
        return weight;
    }
    String getName() {
        return name;
    }

}