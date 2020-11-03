package taskat2;

public class Women extends Human{

    private int shoesAmount;

    public Women(String name, String eyeColor, int age, int height, int shoesAmount) {
        super(name, eyeColor, age, height);
        this.shoesAmount = shoesAmount;
    }

    protected void shopping(){
        System.out.println("Only women can go shopping!");
    }

    public int getShoesAmount() {
        return shoesAmount;
    }

    public void setShoesAmount(int shoesAmount) {
        this.shoesAmount = shoesAmount;
    }
}
