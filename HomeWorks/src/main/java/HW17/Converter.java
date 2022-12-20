package HW17;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Converter {

    static Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
    static File pathJson = null;
    static File pathYaml = null;

    static String nameJson = null;
    static String nameYaml = null;

    @SneakyThrows
    static void fileConvert(Path path) {

        ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
        Object obj = yamlReader.readValue(path.toFile(), Object.class);

        ObjectMapper jsonWriter = new ObjectMapper();
        System.out.println(jsonWriter.writeValueAsString(obj));
//        return jsonWriter.writeValueAsString(obj);
    }

    @SneakyThrows
    static void fileConvert() {



        if (pathJson != null) {

            System.out.println("pathJson!=null");
            ObjectMapper jsonReader = new ObjectMapper();
            Object obj = jsonReader.readValue(pathJson, Object.class);

            ObjectMapper yamlWriter = new YAMLMapper();

            File file = new File(nameJson + ".yaml");

            OutputStream outputStream = new FileOutputStream(file.getPath(), false);
            outputStream.write(yamlWriter.writeValueAsString(obj).getBytes(StandardCharsets.UTF_8));

        } else if (pathYaml != null) {
//            System.out.println("pathYaml!=null");
//
//            ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
//            Object obj = yamlReader.readValue(pathYaml, Object.class);
//
//            ObjectMapper jsonWriter = new ObjectMapper();
//            System.out.println(jsonWriter.writeValueAsString(obj));
//
//            File file = new File(nameYaml + ".json");
//            System.out.println(file.getName());
//
//
//            OutputStream outputStream =
//                    new FileOutputStream(file.getPath(), false);
//
//            outputStream.write(jsonWriter.writeValueAsString(obj).getBytes(StandardCharsets.UTF_8));

        } else {
            System.out.println("No files to convert in the current directory.");
        }

    }
//    File filePath = new File("Logs");
//
//        filePath.mkdir();
    static List<File> getFilePath() {
        File path = FileSystems.getDefault().getPath("")
                .toAbsolutePath().toFile();
        File[] arrFiles = path.listFiles();
        List<File> filesPath = Arrays.asList(arrFiles);

        return filesPath;
    }

    static List<String> getFileValidPath(List<String> filesPath){

        try {
            pathJson = getFilePath().stream().filter(value -> value.toString()
                    .endsWith(".json")).findAny().get();
            nameJson = pathJson.getName().split("\\.")[0];

        } catch (NoSuchElementException e) {
            System.out.println("No files .json to convert in the current directory.");
        }

        try {
            pathYaml = getFilePath().stream().filter(value -> value.toString()
                    .endsWith(".yaml")).findAny().get();
            nameYaml = pathYaml.getName().split("\\.")[0];
        } catch (NoSuchElementException e) {
            System.out.println("No .yaml files to convert in the current directory.");
        }
        return null;
    }


    static void fileNameGenerator(String name) {
        String fileName = name + ".json";
    }

    static long getSize(File file) {
        long len = file.length();

        return len;
    }
}