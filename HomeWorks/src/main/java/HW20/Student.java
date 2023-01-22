package HW20;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Student {

    private int studentId;
    private String group;
    private String fio;
    private String yearEntrance;

    public Student(int studentId, String group, String fio, String yearEntrance) {
        this.studentId = studentId;
        this.group = group;
        this.fio = fio;
        this.yearEntrance = yearEntrance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", group='" + group + '\'' +
                ", fio='" + fio + '\'' +
                ", yearEntrance='" + yearEntrance + '\'' +
                '}';
    }
}
