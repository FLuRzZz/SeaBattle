package DAO.connectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static Connection getConnect() throws SQLException {
        String DB_URL = "jdbc:postgresql://localhost:5432/SeaBattle";
        String USER = "postgres";
        String PASS = "6991";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
