package com.indium.labs.lab11;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Lab11 {
    static DatabaseMapper databaseMapper = new DatabaseMapper();

    public static void main(String[] args) throws SQLException {
        List<Object> users = loadAllUsers();
        users.forEach(System.out::println);

        List<Object> accounts = loadAllAccounts();
        accounts.forEach(System.out::println);
    }

    private static List<Object> loadAllAccounts() throws SQLException {
        Connection conn = null;
        List<Object> records = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "select * from accounts";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            records = databaseMapper.mapResultSetToObjects(rs, Account.class);
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return records;
    }

    private static List<Object> loadAllUsers() throws SQLException {
        Connection conn = null;
        List<Object> records = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "select * from users";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            records = databaseMapper.mapResultSetToObjects(rs, User.class);
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return records;
    }
}
