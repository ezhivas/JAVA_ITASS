package task_at_7;

import java.io.IOException;

public class CalculatorRunner {

    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();
        Calculator calculator = new Calculator();
        int value1, value2, levelValue;
        manager.manager();
        System.out.println("Enter the first number:");
        value1 = Integer.parseInt(calculator.inputFromConsole());
        manager.makeLog();
        System.out.println("Enter the second number:");
        value2 = Integer.parseInt(calculator.inputFromConsole());
        manager.makeLog();
        while (true) {
            System.out.println("Enter the operation:\n" +
                    "1 - for Adding\n" +
                    "2 - for Subtraction\n" +
                    "3 - for Multiply\n" +
                    "4 - for Division\n" +
                    "0 - for Exit\n");
            int operation = Integer.parseInt(calculator.inputFromConsole());
            if (operation == 1) {
                System.out.println("The result of adding is: " + calculator.mathOperationAdd(value1, value2) + "\n");
                manager.makeLog();}
            else if (operation == 2) {
                System.out.println("The result of subtraction is: " + calculator.mathOperationSubtraction(value1, value2));
                manager.makeLog();
            }
            else if (operation == 3) {
                System.out.println("The result of multiply is: " + calculator.mathOperationMultiply(value1, value2));
                manager.makeLog();
            }
            else if (operation == 4) {
                System.out.println("The result of divide is: " + calculator.mathOperationDivide(value1, value2));
                manager.makeLog();
            }
            else if (operation == 0) {
                manager.makeLog();
                break;
            }
        }
    }
}
