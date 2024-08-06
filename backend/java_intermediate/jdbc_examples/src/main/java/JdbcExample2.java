import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample2 {
    public static void main(String[] args) throws SQLException {
//        insertAccountBadStyle(12345, "Jowy", 30000.50, "Savings");
//        insertAccountBadStyle(12346, "Jowy", 30000.50, "Savings'); Drop table accounts; --");
//        insertAccount(12345, "Jowy", 30000.50, "Savings");
//        insertAccount(12346, "Jowy", 30000.50, "Savings'); Drop table accounts; --");
//        printAllAccounts();

//        ERROR

//        ResultSet rs = getAllAccounts();
//        while (rs.next()) {
//            int id = rs.getInt("account_id");
//            String owner = rs.getString("account_holder");
//            double balance = rs.getDouble("balance");
//            String type = rs.getString("account_type");
//            System.out.println(id + ": " + owner + ", " + balance + ", " + type);
//        }
        getAllAccountRecords().forEach(System.out::println);
    }

    private static List<String> getAllAccountRecords() throws SQLException {
        Connection conn = null;
        List<String> records = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "select * from accounts";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("account_id");
                String owner = rs.getString("account_holder");
                double balance = rs.getDouble("balance");
                String type = rs.getString("account_type");
                records.add(id + ": " + owner + ", " + balance + ", " + type);
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return records;
    }


    // CANNOT return a ResultSet because the connection may have been closed
    private static ResultSet getAllAccounts() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "select * from accounts";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            statement.close();
            return rs;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return null; //NOT Recommended
    }

    private static void printAllAccounts() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "select * from accounts";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("account_id");
                String owner = rs.getString("account_holder");
                double balance = rs.getDouble("balance");
                String type = rs.getString("account_type");
                System.out.println(id + ": " + owner + ", " + balance + ", " + type);
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
    }

    private static void insertAccount(int id, String name, double balance, String type) throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "insert into accounts(account_id, account_holder, balance, account_type) values(?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setDouble(3, balance);
            preparedStatement.setString(4, type);
            preparedStatement.execute();
            preparedStatement.close();
            System.out.println("Inserted account " + id + " successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
    }

    private static void insertAccountBadStyle(int id, String name, double balance, String type) throws SQLException {
        Connection conn = null;
        try {
            // This is not how you will talk to DB in professionally built applications
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Ideally all these details like DB credentials
            // will move to something like .env files in React; .yaml or .properties file
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            // Danger is it's prone to SQL injection attacks
            // NEVER construct a SQL query like this
//            String sql = "insert into accounts (account_id, account_holder, balance, account_type) " +
//                    "values (" + id + ", '" + name + "', " + balance + ", '" + type + "')";
            String sql = "insert into accounts values(%s, '%s', %s, '%s')"
                    .formatted(id, name, balance, type);
            System.out.println(sql);
            Statement statement = conn.createStatement();
            statement.execute(sql);
            statement.close();
            System.out.println("Inserted account " + id + " successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
    }

}
