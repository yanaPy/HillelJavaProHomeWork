package HW16;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.*;

public class Log {

    private static Path path = FileSystems.getDefault().getPath("logFile.txt").toAbsolutePath();
    private static File logFile;

    private static Path pathForResult = FileSystems.getDefault().getPath("logFileResult.txt").toAbsolutePath();
    private static File logFileForResult;


    static void isFileCreated() {
        if (!path.toFile().exists()) {
            logFile = new File(String.valueOf(path.toFile()));
        } else {
            logFile = path.toFile();
        }
    }

    static void isFileResultCreated() {
        if (!pathForResult.toFile().exists()) {
            logFileForResult = new File(String.valueOf(pathForResult.toFile()));
        } else {
            logFileForResult = pathForResult.toFile();
        }
    }
    static OutputStream outputStream;
    static {
        try {
            outputStream = new FileOutputStream(String.valueOf(path), false);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static OutputStream outputStreamResult;
    static {
        try {
            outputStreamResult = new FileOutputStream(String.valueOf(pathForResult), false);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SneakyThrows
    static void log(String line){
        outputStream.write((line + "\r\n").getBytes());
    }

    @SneakyThrows
    static void logResult(String line){
        outputStreamResult.write((line + "\r\n").getBytes());
    }

    @SneakyThrows
    static void close(){
        outputStream.close();
        outputStreamResult.close();
    }
}