package task_at_7;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Manager extends LogManager {

    private static final Logger logger = Logger.getLogger(CalculatorRunner.class.getName());

    public void manager() throws IOException {
        Manager.getLogManager().readConfiguration();
        Handler fileHandler = new FileHandler("%h/myLog.log");
        Handler consoleHandler = new ConsoleHandler();
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);
        logger.addHandler(consoleHandler);
        logger.config("Program starts right from here");
        int value1, value2, levelValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the level of logging:\n" +
                "1.Finer\n" +
                "2.Fine\n" +
                "3.Info\n" +
                "4.Config\n" +
                "5.Finest");
        levelValue = scanner.nextInt();
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
    }
    public void makeLog() {
        logger.info("INFO LEVEL");

        logger.severe("SEVERE level");
        logger.config("CONFIG level");
        logger.fine("FINE");
        logger.finer("FINER");
        logger.finest("FINEST");
    }

}
