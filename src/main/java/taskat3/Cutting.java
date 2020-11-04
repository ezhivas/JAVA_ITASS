package taskat3;

public class Cutting extends Vegetable {
    public Cutting(String name, int weight) {
        super(name, weight);
    }

    public String cooking() {
        return "Cutted";
    }

}