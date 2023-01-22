package HW20;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBServise {

    MysqlDataSource dataSource = new MysqlDataSource();


    void connectionSettings() throws SQLException {
        dataSource.setUseSSL(false);
        dataSource.setServerTimezone(DB.serverTimeZone);
        dataSource.setServerName(DB.serverName);
        dataSource.setDatabaseName(DB.databaseName);
        dataSource.setPortNumber(DB.portNumber);
        dataSource.setUser(DB.user);
        dataSource.setPassword(DB.password);

    }


    @SneakyThrows
    public List<Student> selectStudent() {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from students");
        List<Student> student = new ArrayList<>();

        while (rs.next()) {
            int studentId = rs.getInt("student_id");
            String group = rs.getString("groupp");
            String fio = rs.getString("fio");
            String yearEntrance = rs.getString("year_entrance");

            student.add(new Student(studentId, group, fio, yearEntrance));
        }

        connection.close();

        return student;
    }


    public List<Student> selectStudent(String name) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("select * from students where fio like '%" + name + "%'");
        List<Student> student = new ArrayList<>();

        while (rs.next()) {
            int studentId = rs.getInt("student_id");
            String group = rs.getString("groupp");
            String fio = rs.getString("fio");
            String yearEntrance = rs.getString("year_entrance");

            student.add(new Student(studentId, group, fio, yearEntrance));
        }


        connection.close();
        return student;
    }

    public List<Student> selectStudent(List<Integer> ids) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        List<Student> student = new ArrayList<>();

        for (Integer id : ids){
            ResultSet rs = statement.executeQuery("select * from students where student_id = '" + id + "'");

            while (rs.next()) {
                int studentId = rs.getInt("student_id");
                String group = rs.getString("groupp");
                String fio = rs.getString("fio");
                String yearEntrance = rs.getString("year_entrance");

                student.add(new Student(studentId, group, fio, yearEntrance));
            }
        }

        connection.close();
        return student;
    }


    public void insertStudent(int studentId, String group, String fio, String yearEntrance) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        statement.executeUpdate("INSERT INTO students (student_id, groupp, fio, year_entrance) " +
                "VALUES('" + studentId + "', '" + group + "', '" + fio + "', '" + yearEntrance + "');");


    }


    public void deleteStudent(int studentId) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        statement.executeUpdate("DELETE FROM students WHERE student_id='"+studentId+"';");
    }

}
