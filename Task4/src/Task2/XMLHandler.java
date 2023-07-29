package Task2;

public class XMLHandler extends AbstractHandler {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Override
    public void open() {
        System.out.println(ANSI_PURPLE + "Document XML is opened" + ANSI_RESET);
    }

    @Override
    public void create() {
        System.out.println(ANSI_PURPLE + "Document XML is created " + ANSI_RESET);
    }

    @Override
    public void change() {
        System.out.println(ANSI_PURPLE + "Document XML is changed" + ANSI_RESET);
    }

    @Override
    public void save() {
        System.out.println(ANSI_PURPLE + "Document XML is saved" + ANSI_RESET);
    }
}
