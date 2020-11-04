package taskat3;

public abstract class Vegetable {
    private int calorie;
    private int weight;
    private String name;
    private VgtblList list = VgtblList.Vgtbl;

    private enum VgtblList {Vgtbl, CARROT, POTATO, CUCUMBER, TOMATO}

    Vegetable(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    abstract String cooking();

    int getCalories() {
        switch (list.valueOf(name)) {
            case CARROT:
                calorie = 33;
                break;
            case POTATO:
                calorie = 43;
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

    int getWght() {
        return weight;
    }

    String getName() {
        return name;
    }

}