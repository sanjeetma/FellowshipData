package com.java.brigelab.jdbc.crud.simplestatement.service.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.brigelab.jdbc.crud.simplestatement.service.CRUDService;
import com.java.brigelab.jdbc.crud.simplestatement.utility.ScannerUtil;

public class CRUDServiceImpl implements CRUDService {

	private Connection getConnection() {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/addressdatabase";
			String username = "root";
			String password = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void create() {
		Connection con = getConnection();
		System.out.println("Enter your name");
		String name = ScannerUtil.inputString();
		System.out.println("Enter city");
		String city = ScannerUtil.inputString();
		System.out.println("Enter state");
		String state = ScannerUtil.inputString();
		System.out.println("Enter zip");
		String zip = ScannerUtil.inputString();
		System.out.println("Enter mobile");
		String mobile = ScannerUtil.inputString();
        String sql="INSERT INTO addressbook " + 
		"VALUES ('"+name+"','"+city+"','"+state+"','"+zip+"','"+mobile+"')";
        		try {
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        finally {
        	System.out.println("value Inserted");
        }
        
		

	}

	@Override
	public void update() {
		Connection con = getConnection();
		System.out.println("Enter your name");
		String name = ScannerUtil.inputString();
		System.out.println("What you want to update");
		String columnName = ScannerUtil.inputString();
		System.out.println("Enter your value");
		String Newvalue = ScannerUtil.inputString();
		String sql = "update addressbook set"+" "+columnName+"='"+Newvalue+"' "+"where name='"+name+"'";
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Value Updated");
		}

	}

	@Override
	public void read() {

		Connection con = getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from addressbook");
			System.out.println("name" + " " + "city" + " " + "state" + " " + "zip" + " " + "mobile");
			while (result.next()) {
				System.out.print(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5));
				System.out.println();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
       System.out.println("ENter your name");
       String name=ScannerUtil.inputString();
       Connection con=getConnection();
       String sql="Delete from addressbook where name='"+name +"'";
    
       try {
		Statement stmt=con.createStatement();
		stmt.executeUpdate(sql);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		System.out.println("Value Deleted");
	}
	
}
}
