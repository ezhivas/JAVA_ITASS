package task_at_7;

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {

        System.out.println("Enter the two numbers to perform operations ");
        System.out.print("Enter the first number : ");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.print("Enter the second number : ");
        int y = a.nextInt();

        while (true) {
            System.out.println(" ");
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for EXIT");
            int n = a.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Result : " + (x + y));
                    break;

                case 2:
                    System.out.println("Result : " + (x - y));
                    break;

                case 3:
                    System.out.println("Result : " + (x * y));
                    break;

                case 4:
                    try {
                        System.out.print("Result : " + (x / y));
                        break;
                    } catch (ArithmeticException exception) {
                        System.out.println("Division by Zero! ->");
                    }

                case 5:
                    System.out.println("'Exit' option selected.");
                    System.exit(0);
            }
        }
    }
}

