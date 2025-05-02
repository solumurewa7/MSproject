package com.example.msproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

    // Database credentials
    private static final String DB_URL = "jdbc:mysql://tramway.proxy.rlwy.net:50944/railway";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "UZgNvgdRBJsyFtShwlrldLEclQrURJZb";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
