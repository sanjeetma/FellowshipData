package com.java.brigelab.jdbc.crud.preparedstatement.service.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.brigelab.jdbc.crud.preparedstatement.model.CRUD;
import com.java.brigelab.jdbc.crud.preparedstatement.service.CRUDService;
import com.java.brigelab.jdbc.crud.simplestatement.utility.ScannerUtil;

public class CRUDServiceImpl implements CRUDService {
	CRUD object = new CRUD();

	private Connection getConnection() {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/addressdatabase";
			String username = "root";
			String password = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception");
		} catch (SQLException e) {
			System.out.println("Check your syntax");
		}
		return con;
	}

	@Override
	public void create() {
		Connection con = getConnection();
		System.out.println("Enter your name");
		String name = ScannerUtil.inputString();
		object.setName(name);
		System.out.println("Enter city");
		String city = ScannerUtil.inputString();
		object.setCity(city);
		System.out.println("Enter state");
		String state = ScannerUtil.inputString();
		object.setState(state);
		System.out.println("Enter zip");
		String zip = ScannerUtil.inputString();
		object.setZip(zip);
		System.out.println("Enter mobile");
		String mobile = ScannerUtil.inputString();
		object.setMobile(mobile);
		try {
			PreparedStatement insertStmt = con.prepareStatement("insert into addressbook values(?,?,?,?,?)");
			insertStmt.setString(1, object.getName());
			insertStmt.setString(2, object.getCity());
			insertStmt.setString(3, object.getState());
			insertStmt.setString(4, object.getZip());
			insertStmt.setString(5, object.getMobile());
			insertStmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Null pointer Exception");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Null Pointer Exception");
			}
		}

	}

	@Override
	public void update() {
		System.out.println("Enter your name");
		String name = ScannerUtil.inputString();
		System.out.println("what you want to update");
		String columnName = ScannerUtil.inputString();
		System.out.println("Enter new value");
		String newValue = ScannerUtil.inputString();
		Connection con = getConnection();
		String sql = "update addressbook set "+columnName+"=?where name=?";

		try {
			PreparedStatement updateStmt = con.prepareStatement(sql);
			updateStmt.setString(1, newValue);
			updateStmt.setString(2, name);
			updateStmt.executeUpdate();
		} catch (SQLException e) {
			
		System.out.println("write syntax properly");
		}

	}

	@Override
	public void read() {
		Connection con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from addressbook");
			ResultSet result = stmt.executeQuery();
			System.out.println("name" + " " + "city" + " " + "state" + " " + "zip" + " " + "mobile");
			while (result.next()) {
				System.out.print(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5));
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Enter Proper syntax");
		}

	}

	@Override
	public void delete() {
		Connection con = getConnection();
		System.out.println("Enter name");
		String name = ScannerUtil.inputString();
		try {
			PreparedStatement deletestmt = con.prepareStatement("delete from addressbook where name= ?");
			deletestmt.setString(1, name);
			deletestmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Enter Proper Syntax");
		}

	}

}
