package com.java.bridgelab.designpattern.facade;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class MySqlHelper {
	public static Connection getMySqlDBConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		// Class.forName("com.mysql.jdbc.Driver"); //register network
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "root");
		return con;
	}

	public void generateMySqlPDFReport(String tableName, Connection con) throws SQLException {
		// get data from table and generate pdf report

		String query = "select * from " + tableName;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
		}
		con.close();

	}

}
