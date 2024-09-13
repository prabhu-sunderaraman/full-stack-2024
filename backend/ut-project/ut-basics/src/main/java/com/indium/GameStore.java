package com.indium;

import java.sql.Connection;
import java.sql.DriverManager;

public class GameStore {
    public boolean saveGameResults(int target, int attempts) {
        // Implement the saveGameResults method by connecting to a database and saving the target and attempts
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:game_results.db");
            conn.createStatement().execute("INSERT INTO game_results (target, attempts) VALUES (" + target + ", " + attempts + ")");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
