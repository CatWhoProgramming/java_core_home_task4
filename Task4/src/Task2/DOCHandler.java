package Task2;

public class DOCHandler extends AbstractHandler {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    @Override
    public void open() {
        System.out.println(ANSI_BLUE + "Document DOC is opened" + ANSI_RESET);
    }

    @Override
    public void create() {
        System.out.println(ANSI_BLUE + "Document DOC is created " + ANSI_RESET);
    }

    @Override
    public void change() {
        System.out.println(ANSI_BLUE + "Document DOC is changed" + ANSI_RESET);
    }

    @Override
    public void save() {
        System.out.println(ANSI_BLUE + "Document DOC is saved" + ANSI_RESET);
    }
}
