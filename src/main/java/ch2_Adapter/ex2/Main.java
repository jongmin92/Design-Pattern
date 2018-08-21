package ch2_Adapter.ex2;

import ch2_Adapter.ex1.Print;
import ch2_Adapter.ex1.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
