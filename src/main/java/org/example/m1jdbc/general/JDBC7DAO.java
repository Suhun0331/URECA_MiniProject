package org.example.m1jdbc.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DAO : Data(Base) Access Object
 */
public class JDBC7DAO {

	private Connection con;
	private String url = "jdbc:mysql://127.0.0.1:3306/ureca";
	private String user = "root";
	private String password = "1234";
	private String sqlSelectAll = "select * from emp";

	public JDBC7DAO() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, user, password);
	}

	public void close() throws SQLException {
		con.close();
	} // close

	public ResultSet selectAll() throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sqlSelectAll);
		return rs;
	} // selectAll

} // class
