package Task2;

import java.util.Scanner;

public class Main {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        sayHello();

    }

    private static void sayHello() {
        Scanner input = new Scanner(System.in);
        System.out.print("Chose the type of document: \n" +
                ANSI_PURPLE + "1 - XML \n" + ANSI_RESET +
                ANSI_CYAN + "2 - TXT \n" + ANSI_RESET +
                ANSI_BLUE + "3 - DOC \n" + ANSI_RESET +
                "Enter number: ");
        int number = input.nextInt();
        OpenHandler(number);
    }

    private static void OpenHandler(int number) {
        switch (number) {
            case 1:
                callXMLHandlerClass();
                break;
            case 2:
                callTXTHandlerClass();
                break;
            case 3:
                callDOCHandlerClass();
                break;
            default:
                System.out.println(ANSI_YELLOW + " Ooops! Something went wrong ..." + ANSI_RESET);
        }
    }

    private static void callDOCHandlerClass() {
        DOCHandler docHandler = new DOCHandler();
        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();
    }

    private static void callTXTHandlerClass() {
        TXTHandler txtHandler = new TXTHandler();
        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();
    }

    private static void callXMLHandlerClass() {
        XMLHandler xmlHandler = new XMLHandler();
        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();
    }
}
