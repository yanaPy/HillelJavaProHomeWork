package HW17;

import HW17.FilleWork.FileSize;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import lombok.SneakyThrows;

import java.nio.file.Path;

public class Converter {
    private static Path userPath;
    private static Path userFilePath;
    private static String oldName;
    private static String newName;
    private long timeConvert;
    static String errorMassage = "No files to convert.";

    @SneakyThrows
    void fileConvert(Path path) {

        setUserPath(path.getParent());
        setUserFilePath(path);
        System.out.println(getUserPath());

        setOldName(path.toFile().getName());

        if (getOldName().endsWith("json")) {
            setNewName(getOldName().split("\\.")[0] + ".yaml");

            ObjectMapper jsonReader = new ObjectMapper();
            Object obj = jsonReader.readValue(path.toFile(), Object.class);

            ObjectMapper yamlWriter = new YAMLMapper();

            String content = String.valueOf(yamlWriter.writeValueAsString(obj));
            System.out.println(content);

            SaveResult.saveResult(content);

            Log log = new Log(getOldName(), getNewName(), getTimeConvert(),
                    FileSize.getSize(path.toString()), FileSize.getSize(getNewName()));
            log.log(getUserPath());

        } else if (getOldName().endsWith("yaml")) {
            setNewName(getOldName().split("\\.")[0] + ".json");

            ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
            Object obj = yamlReader.readValue(path.toFile(), Object.class);

            ObjectMapper jsonWriter = new ObjectMapper();
            System.out.println(jsonWriter.writeValueAsString(obj));

            String content = String.valueOf(jsonWriter.writeValueAsString(obj));
            SaveResult.saveResult(content);

            Log log = new Log(getOldName(), getNewName(), getTimeConvert(),
                    FileSize.getSize(path.toString()), FileSize.getSize(getNewName()));
            log.log(getUserPath());
        } else {
            Log log = new Log();
            log.log(getUserPath(), errorMassage);
            System.out.println(errorMassage);
        }
    }


    public static String getOldName() {
        return oldName;
    }

    public static void setOldName(String oldName) {
        Converter.oldName = oldName;
    }

    public static String getNewName() {
        return newName;
    }

    public static void setNewName(String newName) {
        Converter.newName = newName;
    }

    public static Path getUserPath() {
        return userPath;
    }

    public static void setUserPath(Path userPath) {
        Converter.userPath = userPath;
    }


    public long getTimeConvert() {
        return timeConvert;
    }

    public void setTimeConvert(long timeConvert) {
        this.timeConvert = timeConvert;
    }

    public static Path getUserFilePath() {
        return userFilePath;
    }

    public static void setUserFilePath(Path userFilePath) {
        Converter.userFilePath = userFilePath;
    }

}