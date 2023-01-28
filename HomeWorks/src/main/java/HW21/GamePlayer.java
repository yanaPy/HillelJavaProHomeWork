package HW21;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class GamePlayer {


    private static final Logger logger = LoggerFactory.getLogger("stdout");

    @SneakyThrows
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        logger.info("Welcome to the game Rock Paper Scissors." + "\n"
                + "Enter your name: ");

        String nextLine = i.nextLine();
        Player player = new Player();
        player.setName(nextLine);

        logger.info("Hello " + player.getName() + "\n" +
                "Enter number of games you want to play.");

        Scanner scanner = new Scanner(System.in);
        int numberOfGames = scanner.nextInt();


        while (Game.playedGames != numberOfGames) {
            Game.play();
            if (Game.playedGames == numberOfGames) {
                Game.stopPlay();
            } else {
                logger.info(player.getName() + ", you played " + Game.getPlayedGames() + " game(s). " +
                        "Continue? y/n");
                Scanner scanner1 = new Scanner(System.in);
                String isContinue = scanner1.nextLine();
                if (isContinue.equals("n")) {
                    Game.stopPlay();
                    break;
                }
            }
        }
    }
}