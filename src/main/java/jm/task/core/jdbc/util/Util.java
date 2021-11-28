package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Util {

    private final String USER = "root";
    private final String PASS = "L;tn<hfqyc123";
    private final String URL = "jdbc:mysql://localhost1:3306/new_schema?autoReconnect=true&useSSL=false";
    private Connection connection;

    public Util () {
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            System.err.println("Ошибка соединения : " + ex);
        }
    }

    public Connection getConnection () {
        return connection;
    }

}
