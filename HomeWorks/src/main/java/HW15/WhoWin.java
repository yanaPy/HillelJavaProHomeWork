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

//    public  String[][] result(String[][] result){
//public static String[][] result=new String[3][3];

//        //P : C
//        result[0][0]="Draw"; //STONE:STONE
//        result[1][0]="Win computer"; //SCISSORS:STONE
//        result[2][0]="Win player"; //STONE:PAPER
//
//        result[0][1]="Win player"; //SCISSORS:STONE
//        result[1][1]="Draw"; //SCISSORS:SCISSORS
//        result[2][1]="Win computer"; //PAPER:SCISSORS
//
//        result[0][2]="Win computer"; //STONE:PAPER
//        result[1][2]="Win player"; //SCISSORS:PAPER
//        result[2][2]="Draw"; //PAPER:PAPER
//        return result;
//    }


}
