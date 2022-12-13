package HW15;

import java.util.Scanner;

public class GamePlayer {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Welcome to the game Rock Paper Scissors." + "\n"
                + "Enter your name: ");

        String nextLine = i.nextLine();
        Player player = new Player();
        player.setName(nextLine);

        System.out.println("Hello " + player.getName() + "\n" +
                "Enter number of games you want to play.");

        Scanner scanner = new Scanner(System.in);
        int numberOfGames = scanner.nextInt();


        while (Game.playedGames != numberOfGames) {
            Game.play();
            if (Game.playedGames == numberOfGames) {
                Game.stopPlay();
            } else {
                System.out.println(player.getName() + ", you played " + Game.getPlayedGames() + " game(s). " +
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
