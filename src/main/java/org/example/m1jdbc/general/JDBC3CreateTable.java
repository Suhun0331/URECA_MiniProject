package org.example.m1jdbc.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3CreateTable {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/ureca";
        String user = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement stmt = con.createStatement();

        String query = "CREATE TABLE test_board("
                + "brd_no INT PRIMARY KEY AUTO_INCREMENT"
                + ", brd_title VARCHAR(100) NOT NULL"
                + ", brd_writer VARCHAR(60)"
                + ", brd_cntns VARCHAR(3000) NOT NULL "
                + ", brd_date datetime NOT NULL "
                + ")";
        int successCount = stmt.executeUpdate(query);

        stmt.close();
        con.close();
    }
}
