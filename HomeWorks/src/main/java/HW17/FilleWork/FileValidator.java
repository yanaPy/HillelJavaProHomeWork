package HW17.FilleWork;

import HW17.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileValidator {

    static Path path;
    static String errorMassage = "No files to convert.";

    @SneakyThrows
    public static List<String> getFileValidPath(List<File> filesPath) {
        List<String> validFilesPaths = new ArrayList<>();

        setPath(filesPath.get(0).toPath());
        for (File file : filesPath) {
            if (file.getPath().matches("([\\S]+(?=\\.(yaml|json))\\.\\2)")) {
                if (isJson(file)) {
                    validFilesPaths.add(file.getPath());
                } else if (isYaml(file)) {
                    validFilesPaths.add(file.getPath());
                } else {
                    Log log = new Log();
                    log.log(path, errorMassage);
                    System.out.println(filesPath + " not valid.");
                }
            }
        }
        System.out.println("Valid files: \n");
        for (String s : validFilesPaths) {
            System.out.println(s);
        }
        return validFilesPaths;
    }

    @SneakyThrows
    static boolean isJson(File json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @SneakyThrows
    static boolean isYaml(File yaml) {
        try {
            new ObjectMapper(new YAMLFactory()).readTree(yaml);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public static Path getPath() {
        return path;
    }

    public static void setPath(Path path) {
        FileValidator.path = path;
    }
}
