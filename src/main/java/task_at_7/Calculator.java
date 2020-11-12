package task_at_7;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public int mathOperationAdd(int value1, int value2) {
        return (value1 + value2);
    }
    public int mathOperationSubtraction(int value1, int value2) {
        return (value1 - value2);
    }
    public int mathOperationMultiply(int value1, int value2) {
        return (value1 * value2);
    }
    public int mathOperationDivide(int value1, int value2) {
        int result;
        try {
            result = (value1 / value2);
        } catch (ArithmeticException exception) {
            System.out.println("Division by Zero!");

            return 0;
        }
        return result;
    }
    public String inputFromConsole() {
        try {
            return scanner.next();
        } catch (NumberFormatException exception) {
            System.out.println("Wrong number format");
        }
        return null;
    }
}
