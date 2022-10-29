package HW5;

import java.util.Arrays;

public class StudentsService {

    private Student[] students;


    public void setStudent(Student student) {
        students[student.getId() - 1] = student;
    }


    public void filterByFaculty(String faculty) {
        System.out.println("List of students of faculty " + faculty);
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
    }

    public void filterByFacultyAndCourse(String faculty, String course) {
        System.out.println("List of students of faculty " + faculty + " and course " + course);
        for (Student student : students) {
            if (student.getFaculty().equals(faculty) && student.getCourse().equals(course)) {
                System.out.println(student);
            }
        }
    }

    public void filterByYearBirth(String yearBirth) {
        System.out.println("List of students of yearBirth " + yearBirth);
        for (Student student : students) {
            if (student.getYearBirth().equals(yearBirth)) {
                System.out.println(student);
            }
        }
    }

    public void filterByGroup(String group) {
        System.out.println("List of students of group " + group);
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student);
            }
        }
    }

    public StudentsService() {
        students = new Student[10];
    }


    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentsService{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
