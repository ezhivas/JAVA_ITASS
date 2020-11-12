package taskat4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*Two instances for quick testing
        For quick Test comment lines from 18 to 37 and uncomment 15 to 16*/
        //Women women1 = new Women("ANGEl", "Safo", 168, 59);
        //Men men1 = new Men("SERG", "Vasilets", 178, 74);

        System.out.println("Please enter Men`s name");
        String name = reader.readLine();
        System.out.println("Please enter first Human surname");
        String surname = reader.readLine();
        System.out.println("Please enter first Human height");
        float height = Float.parseFloat(reader.readLine());
        System.out.println("Please enter first Human weight");
        float weight = Float.parseFloat(reader.readLine());
        Men men1 = new Men(name, surname, height, weight);
        System.out.println("Please enter second Human name");
        name = reader.readLine();
        System.out.println("Please enter first Human surname");
        surname = reader.readLine();
        System.out.println("Please enter first Human height");
        height = Float.parseFloat(reader.readLine());
        System.out.println("Please enter first Human weight");
        weight = Float.parseFloat(reader.readLine());
        Women women1 = new Women(name, surname, height, weight);
        System.out.println(men1.toString());
        System.out.println(women1.toString());

        System.out.println("Man can communicate to women: " + men1.canTalk(women1.isGender()));
        System.out.println("Women can communicate to men: " + women1.canTalk(men1.isGender()));
        System.out.println("Man can tolerate to women: " + men1.canTolerate(women1.isGender()));
        System.out.println("Women can tolerate to men: " + women1.canTolerate(men1.isGender()));
        System.out.println("Women can be with men " + women1.beTogether(women1.getHeight(), men1.getHeight()));
        System.out.println("Men can be with women " + men1.beTogether(men1.getHeight(), women1.getHeight()));
        System.out.println("Trying to date women with men: ");
        women1.canDate(men1, women1);
    }catch (NumberFormatException exception){
        System.out.println("Invalid number entered. Program terminates");
        }
    }
}
