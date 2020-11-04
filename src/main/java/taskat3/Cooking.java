package taskat3;

public class Cooking extends Vegetable {
    public Cooking(String name, int weight) {
        super(name, weight);
    }

    public String cooking() {
        return "Chief added this vegetable to salad\n";
    }

}