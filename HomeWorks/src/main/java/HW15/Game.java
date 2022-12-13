package HW15;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Game {
    static int playedGames = 0;

    private static int compWins = 0;
    private static int playerWins = 0;

    private static Hand compHand;
    private static Hand playerHand;

    public static void play() {

        compHand = Comp.randomHand();
        playerHand = Player.playerHand();

        System.out.println("Your hand is "+playerHand);
        System.out.println("Computer hand is "+compHand);

        WhoWin.getWinner(playerHand, compHand);
        playedGames++;
    }

    public static void playStop() {

        System.out.println("You played "+playedGames+" game(s).");
        System.out.println("Computer wins "+compWins+" game(s).");
        System.out.println("You wins "+playerWins+" game(s).");

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
