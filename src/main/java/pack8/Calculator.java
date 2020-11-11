package pack8;

import java.util.logging.*;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());


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
            result =  (value1 / value2);
        } catch (ArithmeticException exception) {
            System.out.println("Division by Zero!");
            return 0;
        }
        return result;
    }
    public String inputFromConsole() {
        return scanner.next();

    }
}



