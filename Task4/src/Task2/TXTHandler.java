package Task2;

public class TXTHandler extends AbstractHandler {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void open() {
        System.out.println(ANSI_CYAN + "Document TXT is opened" + ANSI_RESET);
    }

    @Override
    public void create() {
        System.out.println(ANSI_CYAN + "Document TXT is created " + ANSI_RESET);
    }

    @Override
    public void change() {
        System.out.println(ANSI_CYAN + "Document TXT is changed" + ANSI_RESET);
    }

    @Override
    public void save() {
        System.out.println(ANSI_CYAN + "Document TXT is saved" + ANSI_RESET);
    }
}
