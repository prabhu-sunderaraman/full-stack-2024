package com.indium.labs.lab11;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Lab11 {
    static DatabaseMapper databaseMapper = new DatabaseMapper();

    public static void main(String[] args) throws SQLException {
//      Will sanitize this SQL query to avoid Injection
        List<Object> users = loadAll("select * from users", User.class);
        users.forEach(System.out::println);

        List<Object> accounts = loadAll("select * from accounts", Account.class);
        accounts.forEach(System.out::println);
    }


    private static List<Object> loadAll(String sql, Class resultClass) throws SQLException {
        Connection conn = null;
        List<Object> records = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            records = databaseMapper.mapResultSetToObjects(rs, resultClass);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return records;
    }


}
