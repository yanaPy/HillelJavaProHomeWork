package HW16;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Player {
    private static Hand playerHand;
    private String name;

    public static Hand playerHand() {

        do {
            playerHand=null;

            Scanner i = new Scanner(System.in);
            String question="Enter first letter your hand: ROCK, SCISSORS or PAPER. ";
            System.out.println(question);
            Log.log(question);
            String enteredValue = i.nextLine().toUpperCase();
            Log.log(enteredValue);
            char firstLetter = enteredValue.charAt(0);


            try {
                playerHand=Arrays.stream(Hand.values()).filter(value -> value.toString()
                                .startsWith(String.valueOf(firstLetter))).findAny().get();

            } catch (NoSuchElementException e){
                String massage="Wrong input. Try again. You can chose: " +
                        "ROCK, SCISSORS or PAPER (or first letter of chose).";
                System.out.println(massage);
                Log.log(massage);
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

