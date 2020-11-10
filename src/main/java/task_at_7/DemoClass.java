package task_at_7;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;


public class DemoClass {

    private static final Logger logger = Logger.getLogger(DemoClass.class.getName());

    public static void main(String[] args) throws IOException {
        LogManager.getLogManager().readConfiguration();
        Handler fileHandler = new FileHandler("%h/myLog.log");
        Handler consoleHandler = new ConsoleHandler();
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);
        logger.addHandler(consoleHandler);
        logger.info("Program starts right from here");
        Scanner a = new Scanner(System.in);

        System.out.println(System.getProperty("java.util.logging.config.file"));
        System.out.println("Enter the level of logging:\n" +
                "1.Finer\n" +
                "2.Fine\n" +
                "3.Info\n" +
                "4.Config\n" +
                "5.Finest");
        int n = a.nextInt();
        switch (n) {
            case 1:
                logger.setLevel(Level.FINER);
                logger.info("Level set to FINER");
                break;
            case 2:
                logger.setLevel(Level.FINE);
                logger.info("Level set to FINE");
                break;
            case 3:
                logger.setLevel(Level.INFO);
                logger.info("Level set to INFO");
                break;
            case 4:
                logger.setLevel(Level.CONFIG);
                logger.info("Level set to CONFIG");
                break;
            case 5:
                logger.setLevel(Level.FINEST);
                logger.info("Level set to FINEST");
        }

        System.out.println("Enter two numbers to perform operations ");
        System.out.print("Enter the first number : ");
        int x = a.nextInt();
        logger.info("User entered the first number");
        System.out.print("Enter the second number : ");
        int y = a.nextInt();
        logger.info("User entered the second number");

        while (true) {
            try {
                System.out.println(" ");
                System.out.println("Choose the operation you want to perform ");
                System.out.println("Choose 1 for ADDITION");
                System.out.println("Choose 2 for SUBTRACTION");
                System.out.println("Choose 3 for MULTIPLICATION");
                System.out.println("Choose 4 for DIVISION");
                System.out.println("Choose 5 for EXIT");
                n = a.nextInt();
                logger.info("User entered the operation type");
                switch (n) {
                    case 1:
                        System.out.println("Result : " + (x + y));
                        logger.info("program calculated adding");
                        break;

                    case 2:
                        System.out.println("Result : " + (x - y));
                        logger.info("program calculated subtraction");
                        break;

                    case 3:
                        System.out.println("Result : " + (x * y));
                        logger.info("program calculated multiplication");
                        break;

                    case 4:
                        System.out.print("Result : " + (x / y));
                        logger.log(Level.WARNING, "Division by zero", new Throwable());
                        System.out.println("Division by Zero! ->");
                        try {
                            logger.info("Stack");
                        } catch (ArithmeticException exception) {
                            exception.printStackTrace();
                        }
                        break;

                    case 5:
                        System.out.println("Exit");
                        break;
                }
            } catch (ArithmeticException exception) {
                System.out.println("Division by zero");
                logger.info("Division BY ZERO Detected");
                getStack();
                break;
            }

        }

    }

 static void getStack() {
        String message="";
             for(StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
         message = message + stackTraceElement.toString();
     }
     logger.info(message);
 }
}

