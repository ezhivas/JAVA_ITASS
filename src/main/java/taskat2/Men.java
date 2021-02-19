package taskat2;

public class Men extends Human{

    private int cash;

    public Men(String name, String eyeColor, int age, int height, int cash) {
        super(name, eyeColor, age, height);
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
