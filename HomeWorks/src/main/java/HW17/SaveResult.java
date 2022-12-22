package HW17;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public class SaveResult {

    private static String oldName=Converter.getOldName();
    private static String newName=Converter.getNewName();;
    private static Path path=Converter.getUserPath();
    private static Path pathToFile=Converter.getUserPath();
    private static File fileNew;


    @SneakyThrows
    static void saveResult(String content) {

        File fileNew = new File( path+"/converted");
        fileNew.mkdir();
        setFileNew(new File(fileNew + "/" + newName).toPath().toFile());

        OutputStream outputStream = new FileOutputStream(getFileNew().getPath(), false);
        outputStream.write(content.getBytes());
    }


    public static File getFileNew() {
        return fileNew;
    }

    public static void setFileNew(File fileNew) {
        SaveResult.fileNew = fileNew;
    }
}
