package com.java.bridgelab.designpattern.facade;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class FacadePattern {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
         String tableName="Address";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = (Connection) MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlPDFReport(tableName, con);
		

	}

}
