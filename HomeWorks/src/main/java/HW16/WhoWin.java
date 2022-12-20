package HW16;

public class WhoWin {

    public static void getWinner(Hand handPlayer, Hand handComp) {

        String result;

        if (handComp == handPlayer) {
            result="Draw";
            Log.log(result);
            System.out.println(result);
        } else if (handPlayer == Hand.SCISSORS && handComp == Hand.ROCK
                || handPlayer == Hand.PAPER && handComp == Hand.SCISSORS || handPlayer == Hand.ROCK && handComp == Hand.PAPER) {
            result="Win computer";
            Log.log(result);
            System.out.println(result);
            Game.setCompWins(Game.getCompWins()+1);
        } else {
            result="Win player";
            Log.log(result);
            System.out.println(result);
            Game.setPlayerWins(Game.getPlayerWins()+1);
        }

    }
}
