package HW20;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.Statement;

public class Main {
    public static final String serverTimeZone = "UTC";
    public static final String serverName = "localhost"; // ip address db
    public static final String databaseName ="Student"; // bd name
    public static final int portNumber = 3306; // db port
    public static final String user = "root"; // login
    public static final String password = "rootroot"; // password


    @SneakyThrows
    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setUseSSL( false );
        dataSource.setServerTimezone( serverTimeZone );
        dataSource.setServerName( serverName );
        dataSource.setDatabaseName( databaseName );
        dataSource.setPortNumber( portNumber );
        dataSource.setUser( user );
        dataSource.setPassword( password );


        Connection connection =  dataSource.getConnection();

        Statement statement = connection.createStatement();
    }
}
