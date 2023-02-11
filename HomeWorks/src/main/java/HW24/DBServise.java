package HW24;

import lombok.SneakyThrows;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;


public class DBServise {
    @SneakyThrows
    public List<Student> selectStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Student> student = session.createQuery("from Student").list();

        HibernateUtil.shutdown();
        return student;
    }


    public List<Student> selectStudent(String name) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Student> student = session.createQuery("from Student where fio like'%" + name + "%'").list();

        HibernateUtil.shutdown();
        return student;
    }

    public List<Student> selectStudent(List<Integer> ids) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from Student s where s.studentId in (:list)")
                .setParameterList("list", ids).list();

        HibernateUtil.shutdown();
        return students;
    }


    public void insertStudent( String group, String fio, String yearEntrance) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = new Student(group, fio, yearEntrance);

        session.beginTransaction();

        session.save(student);
        session.getTransaction().commit();

        HibernateUtil.shutdown();
    }

}
