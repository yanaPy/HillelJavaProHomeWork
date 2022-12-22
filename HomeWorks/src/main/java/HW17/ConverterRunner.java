package HW17;

import HW17.FilleWork.FileValidator;
import HW17.FilleWork.ShowFilePath;
import org.apache.commons.lang3.time.StopWatch;

import java.nio.file.*;
import java.util.Scanner;

import static java.lang.String.*;

public class ConverterRunner {

    public static void main(String[] args) {

        Converter converter = new Converter();
        String isContinue;
        Path path;

        if (args.length == 0) {
            path = FileSystems.getDefault().getPath("").toAbsolutePath();
        } else {
            path = Path.of(String.valueOf(args[0]));
        }

        do {
            ShowFilePath.getFilePath(path);
            FileValidator.getFileValidPath(ShowFilePath.getFilePath(path));
            System.out.println("Chose path to file for convert");
            Scanner i = new Scanner(System.in);
            String value = i.nextLine();
            StopWatch watch = new StopWatch();
            watch.start();
            converter.fileConvert(Path.of(value));
            watch.stop();
            converter.setTimeConvert(watch.getTime());

            System.out.println("Do you want to convert another file. Enter y/n.");
            Scanner scanner1 = new Scanner(System.in);
            isContinue = scanner1.nextLine();
        } while (!isContinue.equals("n"));
    }

}