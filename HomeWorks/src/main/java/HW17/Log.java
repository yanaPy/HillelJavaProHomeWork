package HW17;

import java.io.*;
import java.nio.file.Path;

public class Log {
    String oldName;
    String newName;
    long timeConvert;
    long oldSize;
    long newSize;

    public Log(String oldName, String newName, long timeConvert, long oldSize, long newSize) {
        this.oldName = oldName;
        this.newName = newName;
        this.timeConvert = timeConvert;
        this.oldSize = oldSize;
        this.newSize = newSize;
    }

    public Log() {
    }

    void log(Path path) throws FileNotFoundException {
        String log = oldName + " -> " + newName + "; " + timeConvert + "c; " + oldSize + " -> " + newSize;
        File file = new File(path + "/result.log");

        try {
            OutputStream outputStream = new FileOutputStream(file.getPath(), false);
            outputStream.write(log.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void log(Path path, String result){
        File file = new File(path + "/result.log");

        try {
            OutputStream outputStream = new FileOutputStream(file.getPath(), false);
            outputStream.write(result.getBytes());
        } catch (IOException e) {
            System.out.println("Path not found");
        }
    }
}
