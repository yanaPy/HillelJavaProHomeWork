package HW15;

import static HW15.Hand.*;

public class WhoWin {

    public static void getWinner(Hand handPlayer, Hand handComp) {

        if (handComp == handPlayer) {
            System.out.println("Draw");
        } else if (handPlayer == SCISSORS && handComp == STONE
                || handPlayer == PAPER && handComp == SCISSORS || handPlayer == STONE && handComp == PAPER) {
            System.out.println("Win computer");
            Game.setCompWins(Game.getCompWins()+1);
        } else {
            System.out.println("Win player");
            Game.setPlayerWins(Game.getPlayerWins()+1);
        }

    }
}
