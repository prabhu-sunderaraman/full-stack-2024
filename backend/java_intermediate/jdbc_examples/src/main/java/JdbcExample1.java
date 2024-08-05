import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample1 {
    public static void main(String[] args) throws Exception {
        // This syntax you will learn during Reflection
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/training";
        Connection connection = DriverManager.getConnection(url, "root", "root");
        String accountSql = "insert into accounts values(%s, '%s', %s, '%s')"
                .formatted(10, "Prabhu", 1000.34, "savings");
        Statement statement = connection.createStatement();
        statement.execute(accountSql);
        statement.close();
        connection.close();
        System.out.println("Account inserted");
    }
}
