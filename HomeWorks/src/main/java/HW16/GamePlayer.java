package HW16;

import lombok.SneakyThrows;
import java.util.Scanner;

public class GamePlayer {

    @SneakyThrows
    public static void main(String[] args) {
        Log.isFileCreated();
        Log.isFileResultCreated();

        Scanner i = new Scanner(System.in);

        String welcome = "Welcome to the game Rock Paper Scissors." + "\n"
                + "Enter your name: ";
        System.out.println(welcome);
        Log.log(welcome);

        String nextLine = i.nextLine();
        Player player = new Player();
        player.setName(nextLine);
        Log.log(player.getName());

        String question = "Hello " + player.getName() + "\n" +
                "Enter number of games you want to play.";
        System.out.println(question);
        Log.log(question);

        Scanner scanner = new Scanner(System.in);
        int numberOfGames = scanner.nextInt();
        Log.log(String.valueOf(numberOfGames));


        while (Game.playedGames != numberOfGames) {
            Game.play();

            if (Game.playedGames == numberOfGames) {
                Game.stopPlay();
                Log.close();
            } else {
                String questionNext = player.getName() + ", you played " + Game.getPlayedGames() + " game(s). " +
                        "Continue? y/n";
                System.out.println(questionNext);
                Log.log(questionNext);
                Scanner scanner1 = new Scanner(System.in);
                String isContinue = scanner1.nextLine();
                Log.log(isContinue);
                if (isContinue.equals("n")) {
                    Game.stopPlay();
                    Log.close();
                    break;
                }
            }
        }
    }
}
