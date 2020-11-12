package task_at_7;

import java.io.IOException;
import java.util.logging.*;


public class CalculatorRunner {

    private static final Logger logger = Logger.getLogger(CalculatorRunner.class.getName());

    public static void main(String[] args) throws IOException {

        LogManager.getLogManager().readConfiguration();
        Handler fileHandler = new FileHandler("%h/myLog.log");
        Handler consoleHandler = new ConsoleHandler();
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);
        logger.addHandler(consoleHandler);
        logger.config("Program starts right from here");
        Calculator calculator = new Calculator();
        int value1, value2, levelValue;
        System.out.println("Enter the level of logging:\n" +
                "1.Finer\n" +
                "2.Fine\n" +
                "3.Info\n" +
                "4.Config\n" +
                "5.Finest");
        levelValue = Integer.parseInt(calculator.inputFromConsole());
        switch (levelValue) {
            case 1:
                logger.setLevel(Level.FINER);
                logger.info("Level set to: " + logger.getLevel());
                break;
            case 2:
                logger.setLevel(Level.FINE);
                logger.info("Level set to: " + logger.getLevel());
                break;
            case 3:
                logger.setLevel(Level.INFO);
                logger.info("Level set to: " + logger.getLevel());
                break;
            case 4:
                logger.setLevel(Level.CONFIG);
                logger.info("Level set to: " + logger.getLevel());
                break;
            case 5:
                logger.setLevel(Level.FINEST);
                logger.info("Level set to: " + logger.getLevel());
        }
        System.out.println("Enter the first number:");
        value1 = Integer.parseInt(calculator.inputFromConsole());
        SomeLogger();
        System.out.println("Enter the first number:");
        value2 = Integer.parseInt(calculator.inputFromConsole());
        logger.info("Second number");
        SomeLogger();
        while (true) {

            System.out.println("Enter the operation:\n" +
                    "1 - for Adding\n" +
                    "2 - for Subtraction\n" +
                    "3 - for Multiply\n" +
                    "4 - for Division\n" +
                    "0 - for Exit\n");
            int operation = Integer.parseInt(calculator.inputFromConsole());

            if (operation == 1)
                System.out.println("The result of adding is: " + calculator.mathOperationAdd(value1, value2) + "\n");
            else if (operation == 2)
                System.out.println("The result of subtraction is: " + calculator.mathOperationSubtraction(value1, value2));
            else if (operation == 3)
                System.out.println("The result of multiply is: " + calculator.mathOperationMultiply(value1, value2));
            else if (operation == 4)
                System.out.println("The result of divide is: " + calculator.mathOperationDivide(value1, value2));
            else if (operation == 0) break;
        }
        logger.info("Operation chosen");
        SomeLogger();


    }

    static void SomeLogger() {

        logger.severe("Severe");
        logger.warning("Warning");
        logger.finest("Really not important");
        logger.config("Config");
    }
}
