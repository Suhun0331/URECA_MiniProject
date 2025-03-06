package org.example.m1jdbc.general;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC7DAOMain {

	public static void main(String[] args) {

		JDBC7DAO dao = null;

		try{
			dao = new JDBC7DAO();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try{
			ResultSet rs = dao.selectAll();

			dao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // main

} // class
