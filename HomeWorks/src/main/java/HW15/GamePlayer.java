package HW15;

import lombok.SneakyThrows;

import java.io.*;
import java.util.Scanner;

public class GamePlayer {

    @SneakyThrows
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

//// Создаём поток для сохранения выводимых данных
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(baos);
//
//// Сохраняем оригинальный поток вывода
//        PrintStream originalStdOut = System.out;
//
//// Заменяем поток вывода на наш буфер
//        System.setOut(ps);
//        Log.writeToFileFromConsole();

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        BufferedWriter writer = new BufferedWriter(new FileWriter("saveCourseOfGame.txt", true));
        String line;

        while (Game.playedGames != numberOfGames) {
//            Log log =new Log();
//            log.saveCourseOfGame();
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
//            log.logClose();
            // Восстанавливаем оригинальный поток вывода
//            System.out.flush();
//            System.setOut(originalStdOut);

//        // Сохраняем в файл перехваченные данные
//        try (OutputStream fos = new FileOutputStream("some_file.txt")) {
//            baos.writeTo(fos);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
        do {
            line = br.readLine();
            writer.append("\n");
            writer.append(line);
        } while (!"wr".equals(line));

}}
