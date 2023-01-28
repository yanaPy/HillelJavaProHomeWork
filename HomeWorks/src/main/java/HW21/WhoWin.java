package HW21;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static HW21.Hand.*;

public class WhoWin {

    private static final Logger courseOfGameLog = LoggerFactory.getLogger("courseOfGame");

    public static void getWinner(Hand handPlayer, Hand handComp) {

        if (handComp == handPlayer) {
            courseOfGameLog.info("Draw");
        } else if (handPlayer == SCISSORS && handComp == ROCK
                || handPlayer == PAPER && handComp == SCISSORS || handPlayer == ROCK && handComp == PAPER) {
            courseOfGameLog.info("Win computer");
            Game.setCompWins(Game.getCompWins()+1);
        } else {
            courseOfGameLog.info("Win player");
            Game.setPlayerWins(Game.getPlayerWins()+1);
        }

    }
}
