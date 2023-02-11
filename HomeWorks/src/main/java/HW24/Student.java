package HW24;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false, columnDefinition = "varchar(64)", insertable = true)
    private Integer studentId;

    @Column(name = "groupp")
    private String group;

    @Column(name = "fio")
    private String fio;
    @Column(name = "year_entrance")
    private String yearEntrance;

    public Student(String group, String fio, String yearEntrance) {
        this.group = group;
        this.fio = fio;
        this.yearEntrance = yearEntrance;
    }


    public Student() {

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
