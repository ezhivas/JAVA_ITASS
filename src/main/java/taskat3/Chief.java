package taskat3;

import java.util.ArrayList;
import java.util.List;

public class Chief {
    public static void main(String[] args) {
        Salad salad1 = new Salad("The First", new Cooking("CARROT", 100),
                new Cooking("POTATO", 400), new Cooking("CUCUMBER", 75),
                new Cooking("TOMATO", 50));
        System.out.println(salad1.toString());



        List<Salad> salad2 = new ArrayList<>();
        salad2.add(new Salad()
                .setName("The Second")
                .setComponent(new Cooking("CARROT", 100))
                .setComponent(new Cooking("TOMATO", 250))
                .setComponent(new Cooking("TOMATO", 480))
        );

        System.out.println(salad2.toString());
    }

}
