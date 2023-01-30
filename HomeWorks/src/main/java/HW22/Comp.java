package HW22;

import java.util.Random;

public class Comp {
    private static final Random forHand = new Random();

    public static Hand randomHand() {
        return Hand.values()[forHand.nextInt(Hand.values().length)];
    }
}
