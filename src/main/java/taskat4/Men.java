package taskat4;

public class Men extends Human {

    final boolean gender = true;
    public Men(String name, String surname, float height, float weight) {
        super(true, name, surname, height, weight);
    }
    public boolean canTalk(boolean bo) {
        if ((bo) && (Math.random() > 0.5))
            return true;
        else return !bo;
    }
    public boolean canTolerate(boolean bo) {
        if ((!bo) && (Math.random() < 0.7))
            return true;
        else return (bo) && (Math.random() < 0.056);
    }
}



