package ch3_template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("ByeBye.");
        d1.display();
        d2.display();
        d3.display();
    }
}
