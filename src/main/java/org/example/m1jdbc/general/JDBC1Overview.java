package org.example.m1jdbc.general;

import java.sql.*;

/**
 * JDBC 5 Step
 * 1 - Driver loading
 *  - Driver : DBMS 제조사가 제공하는 클라이언트 모듈
 *
 */

public class JDBC1Overview {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/ureca";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);

        String query = "SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno"
                + ", d.dname, d.loc"
                + " FROM emp e, dept d"
                + " WHERE e.deptno = d.deptno";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

    }
}
