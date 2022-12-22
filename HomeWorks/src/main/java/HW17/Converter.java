package HW17;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Converter {
    private File fileNew;
    private List<File> filesPath = new ArrayList<>();
    private List<String> fileValidPath = new ArrayList<>();

    private Path userPath;
    private Path userFilePath;

    private String oldName;

    private long timeConvert;

    private String nameJson;
    private String nameYaml;
    static String errorMassage = "No files to convert.";


    @SneakyThrows
    List<File> getFilePath() {

        setUserPath(FileSystems.getDefault().getPath("").toAbsolutePath());

        Files.walk(FileSystems.getDefault().getPath("").toAbsolutePath())
                .forEach(file -> {
                    if (file.toFile().canRead()&&file.toFile().isFile()) {
                        filesPath.add(file.toFile());
                    }
                });
        System.out.println("Files from current dir: \n");
        for (File s : filesPath) {
            System.out.println(s);
        }
        return filesPath;
    }

    List<File>getFilePath(Path path) {

        for (Path file : path.toAbsolutePath()) {
            if (file.toFile().canRead()&&file.toFile().isFile()) {
                filesPath.add(file.toFile());
            }
        }

        System.out.println("Files from : \n" + path + "\n");
        for (File s : filesPath) {
            System.out.println(s);
        }
        return filesPath;
    }

    @SneakyThrows
    List<String> getFileValidPath(List<File> filesPath) {
        System.out.println("Valid files: \n");


        for (File file : filesPath) {
            if (file.getPath().matches("([\\S]+(?=\\.(yaml|json))\\.\\2)")) {
                if (isJson(file)) {
                    fileValidPath.add(file.getPath());
                } else if (isYaml(file)) {
                    fileValidPath.add(file.getPath());
                } else {
                    System.out.println(filesPath + " not valid.");
                }
            }
        }
        for (String s : fileValidPath) {
            System.out.println(s);
        }
        return fileValidPath;
    }


    @SneakyThrows
    void fileConvert(Path path) {

        setUserPath(path.getParent());
        setUserFilePath(path);
        System.out.println(getUserPath());

        setOldName(path.toFile().getName());

        if (getOldName().endsWith("json")) {
            setNameJson(getOldName().split("\\.")[0] + ".yaml");

            ObjectMapper jsonReader = new ObjectMapper();
            Object obj = jsonReader.readValue(path.toFile(), Object.class);

            ObjectMapper yamlWriter = new YAMLMapper();

            System.out.println(yamlWriter.writeValueAsString(obj));

            String content = String.valueOf(yamlWriter.writeValueAsString(obj));
            saveResult(content);

        } else if (getOldName().endsWith("yaml") && isYaml(path.toFile())) {
            setNameYaml(getOldName().split("\\.")[0] + ".json");

            ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
            Object obj = yamlReader.readValue(path.toFile(), Object.class);

            ObjectMapper jsonWriter = new ObjectMapper();
            System.out.println(jsonWriter.writeValueAsString(obj));

            String content = String.valueOf(jsonWriter.writeValueAsString(obj));
            saveResult(content);

            Log log = new Log(getOldName(), getFileNew().getName(), getTimeConvert(), getSize(path.toFile()),
                    getSize(getFileNew()));

            log.log(getUserPath());
        } else {
            Log log = new Log();
            log.log(getUserPath(), errorMassage);
            System.out.println(errorMassage);
        }
    }


    @SneakyThrows
    void saveResult(String content) {

        File filePath = new File(getUserPath() + "/converted");
        filePath.mkdir();

        if (getUserFilePath().toString().endsWith("yaml")) {
            setFileNew(new File(filePath + "/" + getNameYaml()));
        } else if (getUserFilePath().toString().endsWith("json")) {
            setFileNew(new File(filePath + "/" + getNameJson()));
        }
        OutputStream outputStream = new FileOutputStream(getFileNew().getPath(), false);
        outputStream.write(content.getBytes());
    }

    @SneakyThrows
    public boolean isJson(File json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (IOException ex) {
            Log log = new Log();
            log.log(getUserPath(), errorMassage);
            return false;
        }
    }

    @SneakyThrows
    public boolean isYaml(File yaml) {
        try {
            new ObjectMapper(new YAMLFactory()).readTree(yaml);
            return true;
        } catch (IOException ex) {
            Log log = new Log();
            log.log(getUserPath(), errorMassage);
            return false;
        }
    }

    static long getSize(File file) {
        long len = file.length();

        return len;
    }

    public File getFileNew() {
        return fileNew;
    }

    public void setFileNew(File fileNew) {
        this.fileNew = fileNew;
    }

    public List<File> getFilesPath() {
        return filesPath;
    }

    public void setFilesPath(List<File> filesPath) {
        this.filesPath = filesPath;
    }

    public List<String> getFileValidPath() {
        return fileValidPath;
    }

    public void setFileValidPath(List<String> fileValidPath) {
        this.fileValidPath = fileValidPath;
    }

    public Path getUserPath() {
        return userPath;
    }

    public void setUserPath(Path userPath) {
        this.userPath = userPath;
    }

    public Path getUserFilePath() {
        return userFilePath;
    }

    public void setUserFilePath(Path userFilePath) {
        this.userFilePath = userFilePath;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public long getTimeConvert() {
        return timeConvert;
    }

    public void setTimeConvert(long timeConvert) {
        this.timeConvert = timeConvert;
    }

    public String getNameJson() {
        return nameJson;
    }

    public void setNameJson(String nameJson) {
        this.nameJson = nameJson;
    }

    public String getNameYaml() {
        return nameYaml;
    }

    public void setNameYaml(String nameYaml) {
        this.nameYaml = nameYaml;
    }
}