package HW17;

import org.apache.commons.lang3.time.StopWatch;

import java.nio.file.*;
import java.util.Scanner;

public class ConverterRunner {

    public static void main(String[] args) {

        Converter converter = new Converter();


        while (true) {
            System.out.println("Choose number for operations :");
            System.out.println("1 - display all files from current dir. " +
                    "And display files for conversion.");
            System.out.println("2 - display all files from your dir. " +
                    "And display files for conversion.");
            System.out.println("3 - convert the file");
            System.out.println("4 - exit.");


            Scanner i = new Scanner(System.in);
            int choice = i.nextInt();
            Scanner input = new Scanner(System.in);

            if (choice == 1) {
                converter.getFilePath();
                converter.getFileValidPath(converter.getFilePath());
            } else if (choice == 2) {
                System.out.println("Enter path ");
                String value = input.nextLine();
                converter.getFilePath(Path.of(value));
                converter.getFileValidPath(converter.getFilePath());
            } else if (choice == 3) {
                System.out.println("Enter path to file for convert");
                String value = input.nextLine();
                StopWatch watch = new StopWatch();
                watch.start();
                converter.fileConvert(Path.of(value));
                watch.stop();
                converter.setTimeConvert(watch.getTime());
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

    }

}