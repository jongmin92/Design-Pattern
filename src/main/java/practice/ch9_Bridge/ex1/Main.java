package practice.ch9_Bridge.ex1;

public class Main {
    public static void main(String[] args) {
        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hell, Korea."));
        d.randomDisplay(10);
    }
}
