package org.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDAO {
    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "7809";

    public static Connection connect() throws SQLException {
        try{
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
