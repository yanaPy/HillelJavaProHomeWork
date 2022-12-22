package HW17.FilleWork;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ShowFilePath {

    private static List<File> filesPath = new ArrayList<>();

    @SneakyThrows
    public static List<File> getFilePath(Path path) {
        System.out.println("Files from : \n" + path + "\n");

        Files.walk(path.toAbsolutePath())
                .forEach(file -> {
                    if (file.toFile().canRead()&&file.toFile().isFile()) {
                        filesPath.add(file.toFile());
                        System.out.println(file);
                    }
                });

        return filesPath;
    }
}
