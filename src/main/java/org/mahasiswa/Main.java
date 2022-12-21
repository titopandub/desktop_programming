package org.mahasiswa;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mahasiswa_development";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "password123";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            stmt = conn.createStatement();
            while (!conn.isClosed()) {
                showMenu();
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void showMenu() {
        List<String> menuList = new ArrayList<>(Arrays.asList(
                "=========== MENU UTAMA ===========",
                "1. Input Data",
                "2. Tampil Data",
                "3. Update Data",
                "0. Keluar",
                ""
        ));
        for (String menu : menuList) System.out.println(menu);

        System.out.print("PILIHAN> ");
        Scanner scn = new Scanner(System.in);
        int pilihan = scn.nextInt();

        if (pilihan == 1) {
            insertMahasiswa(scn);
        } else if (pilihan == 2) {
            showMahasiswa();
        } else if (pilihan == 3) {
            updateMahasiswa(scn);
        } else if (pilihan == 0) {
            System.exit(0);
        }
    }

    private static void updateMahasiswa(Scanner scn) {
        System.out.println("=========== UPDATE DATA ===========");
        System.out.print("ID yang akan diedit: ");
        int id = scn.nextInt();
        System.out.print("Nama:   ");
        scn.nextLine();
        String nama = scn.nextLine();
        System.out.print("Alamat: ");
        String alamat = scn.nextLine();

        String updateSql = "UPDATE mahasiswa SET nama='%s', alamat='%s' WHERE id=%d";
        updateSql = String.format(updateSql, nama, alamat, id);

        try {
            stmt.execute(updateSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showMahasiswa() {
        System.out.println("=========== TAMPIL DATA ===========");
        String sql = "SELECT * FROM mahasiswa;";
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                System.out.println(
                        String.format("%d. %s -- %s", id, nama, alamat)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertMahasiswa(Scanner scn) {
        System.out.println("=========== INPUT DATA ===========");
        System.out.print("Nama:   ");
        scn.nextLine();
        String nama = scn.nextLine();
        System.out.print("Alamat: ");
        String alamat = scn.nextLine();
        String insertSql = "INSERT INTO mahasiswa (nama, alamat) VALUE ('%s', '%s');";
        insertSql = String.format(insertSql, nama, alamat);

        try {
            stmt.execute(insertSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
