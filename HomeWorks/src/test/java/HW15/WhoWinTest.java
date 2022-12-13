package HW15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static HW15.Hand.*;

class WhoWinTest extends WhoWin {

    @Test
    void WhoWin(){
        WhoWin.getWinner(PAPER,PAPER);
        Assertions.assertEquals(0,Game.getCompWins());
        Assertions.assertEquals(0,Game.getPlayerWins());

        WhoWin.getWinner(SCISSORS,STONE);
        Assertions.assertEquals(1,Game.getCompWins());
        Assertions.assertEquals(0,Game.getPlayerWins());

        Game.setCompWins(0);

        WhoWin.getWinner(PAPER,STONE);
        Assertions.assertEquals(0,Game.getCompWins());
        Assertions.assertEquals(1,Game.getPlayerWins());
    }
}