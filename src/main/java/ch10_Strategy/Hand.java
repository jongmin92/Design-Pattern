package ch10_Strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0; // 주먹을 표시하는 값
    public static final int HANDVALUE_CHO = 1; // 가위를 표시하는 값
    public static final int HANDVALUE_PAA = 2; // 보를 표시하는 값
    // 가위바위보의 손을 표시하는 3개의 인스턴스
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };
    // 가위바위보의 손의 문자열 표현
    private static final String[] name = {
            "주먹", "가위", "보"
    };
    // 가위바위보의 손의 값
    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    // 값에서 인스턴스를 얻는다.
    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    // this가 h를 이길 경우 true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h에게 질 경우 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 무승부는 0, this의 승이면 1, h의 승이면 -1
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
