package HW15;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private static Hand playerHand=null;
    private String name;

    public static Hand playerHand() {

        do {
            Scanner i = new Scanner(System.in);
            System.out.println("Enter your hand: STONE, SCISSORS or PAPER.");
            String enteredValue = i.nextLine().toUpperCase();

            try {
                Arrays.stream(Hand.values()).anyMatch(value -> value.equals(enteredValue));
                playerHand = Hand.valueOf(enteredValue);

            } catch (IllegalArgumentException e){
                System.out.println("Wrong input. Try again. You can chose: " +
                        "STONE, SCISSORS or PAPER.");
            }

        } while (playerHand==null);

        return playerHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

