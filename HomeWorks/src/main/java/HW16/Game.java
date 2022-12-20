package HW16;

public class Game {
    static int playedGames = 0;

    private static int compWins = 0;
    private static int playerWins = 0;

    private static Hand compHand;
    private static Hand playerHand;

    public static void play() {

        compHand = Comp.randomHand();
        playerHand = Player.playerHand();

        String yourHang="Your hand is "+playerHand;
        String computerHand="Computer hand is "+compHand;

        System.out.println(yourHang);
        Log.log(yourHang);

        System.out.println(computerHand);
        Log.log(computerHand);
        WhoWin.getWinner(playerHand, compHand);
        playedGames++;
    }

    public static void stopPlay() {
        String gameResult="You played "+playedGames+" game(s).\n" +
                "Computer wins "+compWins+" game(s).\n" +
                "You wins "+playerWins+" game(s).";
        System.out.println(gameResult);
        Log.logResult(gameResult);

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
