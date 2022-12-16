package HW15;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Log {

    OutputStream outputStream;
    BufferedReader reader;

    // get a file from the resources folder, root of classpath in JAR
    private InputStream getFileFromResourceAsStream(String fileName) {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }

    @SneakyThrows
    public void saveResult(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        outputStream = new FileOutputStream(reader.readLine());

        while (true)
        {
            String data = reader.readLine();
            if(data.equals("n")){
                outputStream.write(data.getBytes());
                break;
            }
            else {
                outputStream.write((data +"\r\n").getBytes());
            }
        }
        outputStream.close();
        reader.close();
    }

    @SneakyThrows
    public void saveCourseOfGame(){
         reader = new BufferedReader(new InputStreamReader(System.in));
         outputStream = new FileOutputStream("saveCourseOfGame.txt");

        while (true)
        {
            String data = reader.readLine();
            if(data.equals("n")){
                outputStream.write(data.getBytes());
                break;
            }
            else {
                outputStream.write((data +"\r\n").getBytes());
            }
        }

    }

    @SneakyThrows
    public void logClose(){
        outputStream.close();
        reader.close();
    }

    public static void writeToFileFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter file content to write in the file:");

        try (OutputStream output = Files
                .newOutputStream(
                        Paths.get("saveCourseOfGame.txt"),
                        StandardOpenOption.APPEND,
                        StandardOpenOption.CREATE);
             BufferedOutputStream outputStream = new BufferedOutputStream(output)) {

            String line;
            while (!"rw".equalsIgnoreCase(line = reader.readLine())) {
                outputStream.write(System.lineSeparator().getBytes());
                outputStream.write(line.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
