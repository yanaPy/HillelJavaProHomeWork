package HW26;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

@Setter
@Getter
public class GamePlayer {

    private static final Logger logger = LoggerFactory.getLogger("stdout");

    private static Locale locale;

    @SneakyThrows
    public static void main(String[] args) {

        locale = Locale.getDefault();

        if (args.length != 0) {
            locale = new Locale(args[0]);
        }
        System.out.println("test test test test test test test test");

//        String val = bundle.getString(key);
//        I solved my Japanese display problem by:
//
//        return new String(val.getBytes("ISO-8859-1"), "UTF-8");

        ResourceBundle
                resourceBundle = ResourceBundle.getBundle("message", locale);

        Scanner i = new Scanner(System.in);

        logger.info(resourceBundle.getString("enter_name"));

        String nextLine = i.nextLine();
        Player player = new Player();
        player.setName(nextLine);

        logger.info(player.getName() + resourceBundle.getString("number_of_games"));
        Scanner scanner = new Scanner(System.in);
        int numberOfGames = scanner.nextInt();


        while (Game.playedGames != numberOfGames) {
            Game.play();
            if (Game.playedGames == numberOfGames) {
                Game.stopPlay();
            } else {
                logger.info(player.getName() + resourceBundle.getString("played_games") + Game.getPlayedGames() +
                      "\n"+  resourceBundle.getString("continue"));
                Scanner scanner1 = new Scanner(System.in);
                String isContinue = scanner1.nextLine();
                if (isContinue.equals("n")) {
                    Game.stopPlay();
                    break;
                }
            }
        }
    }

    public static Locale getLocale() {
        return locale;
    }

    public static void setLocale(Locale locale) {
        GamePlayer.locale = locale;
    }
}