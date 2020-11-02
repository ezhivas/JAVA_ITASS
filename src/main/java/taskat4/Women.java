package taskat4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Women extends Human {
    public Women(String name, String surname, float height, float weight) {
        super(false, name, surname, height, weight);
    }

    public boolean canTalk(boolean bo) {
        return true;
    }

    public boolean canTolerate(boolean bo) {
        if ((!bo) && (Math.random() < 0.05))
            return true;
        else if ((bo) && (Math.random() < 0.7))
            return true;
        return false;
    }

    protected Women birth(Men men, Women women) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (Math.random() < 0.5) {
            System.out.println("Please enter the name for your daughter:");
            String name = reader.readLine();
            String surname = men.getSurname();
            float height = (float) ((women.getHeight()) + 0.1 * (men.getHeight() - women.getHeight()));
            float weight = (float) ((women.getWeight()) + 0.1 * (men.getWeight() - women.getWeight()));
            Women women2 = new Women(name, surname, height, weight);
            System.out.println(women2.toString(false));
            return women2;
        }
        return null;
    }
}




