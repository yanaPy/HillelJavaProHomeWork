package HW21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Game {

    private static final Logger resultLog = LoggerFactory.getLogger("result");
    private static final Logger courseOfGameLog = LoggerFactory.getLogger("courseOfGame");

    static int playedGames = 0;

    private static int compWins = 0;
    private static int playerWins = 0;

    private static Hand compHand;
    private static Hand playerHand;


    public static void play() {

        compHand = Comp.randomHand();
        playerHand = Player.playerHand();

        courseOfGameLog.info("Your hand is " + playerHand);
        courseOfGameLog.info("Computer hand is " + compHand);

        WhoWin.getWinner(playerHand, compHand);
        playedGames++;
    }

    public static void stopPlay() {

        resultLog.info("You played "+playedGames+" game(s).");
        resultLog.info("Computer wins "+compWins+" game(s).");
        resultLog.info("You wins "+playerWins+" game(s).");

    }

    public static int getPlayedGames() {
        return playedGames;
    }

    public static void setPlayedGames(int playedGames) {
        Game.playedGames = playedGames;
    }

    public static int getCompWins() {
        return compWins;
    }

    public static void setCompWins(int compWins) {
        Game.compWins = compWins;
    }

    public static int getPlayerWins() {
        return playerWins;
    }

    public static void setPlayerWins(int playerWins) {
        Game.playerWins = playerWins;
    }
}
