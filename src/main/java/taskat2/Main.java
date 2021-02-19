package taskat2;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        Men men = new Men("Sergey","brown", 38, 178, 17);
        Women women = new Women("Natasha","gold", 33, 165, 50);
        System.out.println("Instances for parent <Human> and extending it <Men> and <Women> was created.");
        System.out.println("<Human> has a <greeting> method:");
        human.greeting();
        System.out.println("Method <Greeting> from parent class <Human> is available" +
                " both for <Men> and <Women>");
        men.greeting();
        women.greeting();
        System.out.println("Men has cash: " + men.getCash());
        System.out.println("Women has " + women.getShoesAmount() + " pairs of shoes");
        System.out.println("Women has own function <shopping>. Let`s call it.");
        women.shopping();
        System.out.println("<Human> hasn't <cash> from <Men>, <shoes> from <Women> and can`t <shopping> like a <Women>.");
    }
}
