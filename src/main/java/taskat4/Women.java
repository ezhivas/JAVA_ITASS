package taskat4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Women extends Human {
    public Women(String name, String surname, float height, float weight) {
        super(false, name, surname, height, weight);
    }

    public boolean canTalk(boolean bo) {
        // It always returns true because female can talk to both male and female in every case
        bo = true;
        return bo;
    }

    public boolean canTolerate(boolean bo) {
        if ((!bo) && (Math.random() < 0.05))
            return true;
        else return (bo) && (Math.random() < 0.7);
    }

    public Human birth(Human human1, Human human2) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (Math.random() < 0.5) {
            System.out.println("Please enter the name for your daughter:");
            String name = reader.readLine();
            String surname = human1.getSurname();
            float height = (float) ((human2.getHeight()) + 0.1 * (human1.getHeight() - human2.getHeight()));
            float weight = (float) ((human2.getWeight()) + 0.1 * (human1.getWeight() - human2.getWeight()));
            Women women2 = new Women(name, surname, height, weight);
            System.out.println(women2.toString());
            return women2;
        }
        else {
            System.out.println("Please enter the name for your daughter:");
            String name = reader.readLine();
            String surname = human1.getSurname();
            float height = (float) ((human2.getHeight()) + 0.1 * (human1.getHeight() - human2.getHeight()));
            float weight = (float) ((human2.getWeight()) + 0.1 * (human1.getWeight() - human2.getWeight()));
            Men men2 = new Men(name, surname, height, weight);
            System.out.println(men2.toString());
            return men2;
        }
    }
}




