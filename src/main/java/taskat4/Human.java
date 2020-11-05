package taskat4;

import java.io.IOException;

public abstract class Human {

    private final boolean gender;
    private String name;
    private String surname;
    private float height;
    private float weight;

    public Human(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }
    public boolean beTogether(float ek1, float ek2) {
        if (ek1 > ek2) {
            if (((ek2 / ek1) < 0.9) && (Math.random() < 0.85))
                return true;
            else return ((ek2 / ek1) > 0.9) && (Math.random() < 0.95);
        }
        return false;
    }
    public Human canDate(Human human1, Human human2) throws IOException {
        if ((human1 instanceof Men) && (human2 instanceof Women)) {
            if ((((Men) human1).canTalk(human2.isGender())) && (((Men) human1).canTolerate(human2.isGender()))
                    && (human1.beTogether(human1.getHeight(), human2.getHeight()))) {
                System.out.println("Its OK");
                return (((Women) human2).birth(human1, human2));
            }
        } else if
        ((human1 instanceof Women) && (human2 instanceof Men)) {
            if ((((Women) human1).canTalk(human2.isGender())) && (((Women) human1).canTolerate(human2.isGender()))
                    && (human1.beTogether(human1.getHeight(), human2.getHeight()))) {
                System.out.println("It`s OK");
                return (((Women) human1).birth(human2, human1));
            }
        }
        System.out.println("They cannot be together. OOPS!");
        return null;
    }

    public boolean isGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("This human " + this.name + " and surname " + this.surname + "," +
                " is " + this.height + " cm tall and " + this.weight + "weigh");
    }
}



