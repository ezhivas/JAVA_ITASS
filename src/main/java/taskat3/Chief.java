package taskat3;

import java.util.ArrayList;
import java.util.List;

public class Chief {
    public static void main(String[] args) {
        Salad salad1 = new Salad("The First", new Smash("CARROT", 100),
                new Cutting("POTATO", 2), new Cutting("CUCUMBER", 100),
                new Smash("TOMATO", 50));
        System.out.println(salad1.toString());
        System.out.println();
        System.out.println();


        List<Salad> salad2 = new ArrayList<>();
        salad2.add(new Salad()
                .setName("The Second")
                .setComponent(new Smash("CARROT", 100))
                .setComponent(new Cutting("TOMATO", 25))
                .setComponent(new Smash("POTATO", 48))
        );

        System.out.println(salad2);
    }

}
