package HW21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Player {

    private static final Logger logger = LoggerFactory.getLogger("stdout");

    private static Hand playerHand;
    private String name;

    public static Hand playerHand() {

        do {
            playerHand=null;

            Scanner i = new Scanner(System.in);
            logger.info("Enter first letter your hand: ROCK, SCISSORS or PAPER. ");
            String enteredValue = i.nextLine().toUpperCase();
            char firstLetter = enteredValue.charAt(0);


            try {
                playerHand=Arrays.stream(Hand.values()).filter(value -> value.toString()
                                .startsWith(String.valueOf(firstLetter))).findAny().get();

            } catch (NoSuchElementException e){
                logger.info("Wrong input. Try again. You can chose: " +
                        "ROCK, SCISSORS or PAPER (or first letter of chose).");
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

