package HW26;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

public class Game {

    private static final Logger resultLog = LoggerFactory.getLogger("result");
    private static final Logger courseOfGameLog = LoggerFactory.getLogger("courseOfGame");

    static int playedGames = 0;

    private static int compWins = 0;
    private static int playerWins = 0;

    private static Hand compHand;
    private static Hand playerHand;

    private static ResourceBundle resourceBundle;

    public static void play() {

        resourceBundle = ResourceBundle.getBundle("message", GamePlayer.getLocale());

        compHand = Comp.randomHand();
        playerHand = Player.playerHand();


        courseOfGameLog.info(resourceBundle.getString("your_hand") + playerHand);
        courseOfGameLog.info(resourceBundle.getString("comp_hand")  + compHand);

        WhoWin.getWinner(playerHand, compHand);
        playedGames++;
    }


    public static void stopPlay() {

        resultLog.info(resourceBundle.getString("you_played")+playedGames);
        resultLog.info(resourceBundle.getString("comp_played")+compWins);
        resultLog.info(resourceBundle.getString("you_wins")+playerWins);

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
