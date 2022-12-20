package HW17;

import java.io.File;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class Main {
     /*
    Написать приложение которое производит конвертаций форматов Json <--> Yaml:

1. на вход приложения в виде аргумента программы принимаем расположение директории
    где находятся файлы, если аргумент отсутствует то происходит анализ текущей папки
2. валидируем формат (YAML, JSON)
3. сохраняем полученный файл в папке converted (старое имя + новое расширение)
4. результаты конвертации сохраняем в файле result.log в формате
    имя_файла -> новое_имя_файла, длительность конвертации, старый размер -> новый размер
5. если конвертация не возможна надо записать что файл не сконвертировался


1. определяем какие файлы есть в директории
    List<String> getFilePath(Path path)

2. Валидация
    List<String> getFileValidPath(List<String> filesPath)

3. Конвертация
    void fileConvert(Path path)

4. Cохранение сконвертировано файла
    void saveResult(Sting content)

5. Логирование работы програмы

    file.json -> file.yaml; 10c; old_size -> new_size
    file1.yaml -> file1.json; 5c; old_size1 -> new_size1}
*/

    public static void main(String[] args) {

//        Converter.fileConvert(Path.of("/Users/yana/IdeaProjects/HillelJavaProHomeWork/file.yaml"));

        Converter2.fileConvert();

//
//        List<String> getFilePath(Path path);
//
//        List<String> getFileValidPath(List <String> filesPath);
    }


//    file.json -> file.yaml; 10c; old_size -> new_size
//    file1.yaml -> file1.json; 5c; old_size1 -> new_size1}




//    void saveResult(Sting content) {
//    }

    public static void currentDirectory() {
        String currentWorkingDirectory;
        System.out.println("--------------");

        File path = FileSystems.getDefault().getPath("")
                .toAbsolutePath().toFile();
        File[] arrFiles = path.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        File a=lst.stream().filter(value -> value.toString()
                .endsWith(".json")).findAny().get();

        System.out.println(a);
        currentWorkingDirectory=path.toString();
        System.out.println("Current working directory is : "+currentWorkingDirectory);
        System.out.println("--------------");
    }
}