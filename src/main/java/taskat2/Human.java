package taskat2;

public class Human {
    private String name;
    private String eyeColor;
    private int age;
    private int height;

    public Human(String name, String eyeColor, int age, int height) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
        this.height = height;
    }

    public Human() {
        this.name = "Gregory";
        this.eyeColor = "Dark";
        this.age = 50;
        this.height = 190;

    }

    public void greeting(){
        System.out.println("My name`s " + name + "!" + "I`m " + age + " years old" + ".My eyes color  is " + eyeColor +
                ".My height is " + height + ".");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
