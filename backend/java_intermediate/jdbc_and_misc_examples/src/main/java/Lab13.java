import java.sql.*;
import java.time.LocalTime;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        startTimer();
        startEvenOddGame();
        pollDatabase();
    }

    private static void pollDatabase() {
        Thread dbThread = new Thread(() -> {
            while(true) {
                try {
                    System.out.println("======== Fetching all accounts ========");
                    displayAllAccountRecords();
                } catch (SQLException e) {
                    System.out.println("Error while fetching accounts: " + e.getMessage());
                }
                MyThreadUtil.sleep(10);
            }
        });
        dbThread.setPriority(1);
        dbThread.setName("db-thread");
        dbThread.start();
    }

    private static void displayAllAccountRecords() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "select * from accounts";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int accountNumber = rs.getInt("account_number");
                String owner = rs.getString("account_holder");
                double balance = rs.getDouble("balance");
                String type = rs.getString("account_type");
                System.out.println(accountNumber + ", " + owner + ", " + balance + ", " + type);
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
    }

    private static void startEvenOddGame() {
        Thread gameThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("****** Enter a number ******");
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    System.out.println("%s is Even".formatted(number));
                } else {
                    System.out.println("%s is Odd".formatted(number));
                }
            }
        });
        gameThread.setName("game-thread");
        gameThread.start();
    }

    private static void startTimer() {
        Thread timerThread = new Thread(() -> {
            while (true) {
                System.out.println("Time: %s".formatted(LocalTime.now()));
                MyThreadUtil.sleep(1);
            }
        });
        timerThread.setName("timer-thread");
        timerThread.start();
    }


}
