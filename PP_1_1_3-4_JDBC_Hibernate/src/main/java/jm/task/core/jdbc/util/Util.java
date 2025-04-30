package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private  static  final String URL = "jdbc:mysql://localhost:3306/alex_star";
    private  static  final String USERNAME = "root";
    private  static  final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection conn = null;
        try {
          conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение есть!");
        }catch (SQLException e) {
            System.out.println("Нет соединения!");
            e.printStackTrace();
        }
        return conn;
    }
}
