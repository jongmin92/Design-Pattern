package ch2_adapter.ex2;

import ch2_adapter.ex1.Print;
import ch2_adapter.ex1.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
