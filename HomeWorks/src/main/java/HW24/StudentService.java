package HW24;

import java.util.List;

public interface StudentService {

    void addStudent();

    List<Student> getAll();

    List<Student> getByName(String name);

    List<Student> getByIds(List<Integer> ids);
}
