package HW24;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

    private List<Student> student;


    DBServise dbServise = new DBServise();

    public StudentServiceImpl() {
    }

    @Override
    public void addStudent() {
        System.out.println("Enter student group");
        Scanner scanner2 = new Scanner(System.in);

        String group = scanner2.nextLine();

        System.out.println("Enter student fio");
        String fio = scanner2.nextLine();

        System.out.println("Enter student year of entrance");

        String yearEntrance = scanner2.nextLine();

        try {
            dbServise.insertStudent(group, fio, yearEntrance);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> getAll() {
        student = dbServise.selectStudent();

        for (Student s : student)
            System.out.println(s);

        return student;
    }

    @Override
    public List<Student> getByName(String name) {
        try {
            student = dbServise.selectStudent(name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        for (Student s : student)
            System.out.println(s);

        return student;
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) {
        try {
            student = dbServise.selectStudent(ids);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        for (Student s : student)
            System.out.println(s);

        return student;
    }
}
