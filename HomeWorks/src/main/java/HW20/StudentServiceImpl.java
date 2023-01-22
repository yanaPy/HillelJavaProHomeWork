package HW20;

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
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter student id");
        int studentId = scanner1.nextInt();

        System.out.println("Enter student group");
        Scanner scanner2 = new Scanner(System.in);

        String group = scanner2.nextLine();

        System.out.println("Enter student fio");
        String fio = scanner2.nextLine();

        System.out.println("Enter student year of entrance");

        String yearEntrance = scanner2.nextLine();

        try {
            dbServise.connectionSettings();
            dbServise.insertStudent(studentId, group, fio, yearEntrance);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteStudent() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter student id for delete");
        int studentId = scanner1.nextInt();

        try {
            dbServise.connectionSettings();
            dbServise.deleteStudent(studentId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> getAll() {
        try {
            dbServise.connectionSettings();
            student = dbServise.selectStudent();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (Student s : student)
            System.out.println(s);

        return student;
    }

    @Override
    public List<Student> getByName(String name) {
        try {
            dbServise.connectionSettings();
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
            dbServise.connectionSettings();
            student = dbServise.selectStudent(ids);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (Student s : student)
            System.out.println(s);

        return student;
    }
}
