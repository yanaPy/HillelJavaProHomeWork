package HW20;

import java.util.List;

public interface StudentService {

    void addStudent();

    void deleteStudent();

    List<Student> getAll();

    List<Student> getByName(String name);

    List<Student> getByIds(List<Integer> ids);

}
