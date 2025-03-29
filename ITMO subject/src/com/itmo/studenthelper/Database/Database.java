package com.itmo.studenthelper.Database;

import java.sql.*;

public class Database {
    private static final String DB_URL = "jdbc:sqlite:pdf_database.db";

    // Инициализация БД
    public static void initialize() throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS pdf_files (" +
                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "file_name TEXT NOT NULL," +
                            "file_path TEXT NOT NULL," +
                            "created_at DATETIME DEFAULT CURRENT_TIMESTAMP)");
        }
    }

    // Добавление записи о PDF-файле
    public static void addPDF(String fileName, String filePath) throws SQLException {
        String sql = "INSERT INTO pdf_files (file_name, file_path) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fileName);
            pstmt.setString(2, filePath);
            pstmt.executeUpdate();
        }
    }

    // Получение списка всех PDF-файлов
    public static ResultSet getAllPDFs() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL);
        Statement stmt = conn.createStatement();
        return stmt.executeQuery("SELECT * FROM pdf_files");
    }
}