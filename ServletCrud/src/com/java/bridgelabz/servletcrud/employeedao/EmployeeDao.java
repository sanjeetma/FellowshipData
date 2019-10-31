package com.java.bridgelabz.servletcrud.employeedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.bridgelabz.servletcrud.model.Employee;

public class EmployeeDao {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee";
			connection = DriverManager.getConnection(url, "root", "root");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;

	}

	public static void create(Employee employee) {
		Connection connection = getConnection();
		String sql = "insert into emp (firstname,lastname,age,mobile) values(?,?,?,?)";
		try {
			PreparedStatement insertstmt = connection.prepareStatement(sql);
			insertstmt.setString(1, employee.getFirst_name());
			insertstmt.setString(2, employee.getLast_name());
			insertstmt.setInt(3, employee.getAge());
			insertstmt.setInt(4, employee.getMobile());
			insertstmt.executeUpdate();
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static ArrayList<Employee> read() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Connection con = getConnection();
		String sql = "select * from emp";
		try {
			PreparedStatement readstmt = con.prepareStatement(sql);
			ResultSet resultset = readstmt.executeQuery();
			while (resultset.next()) {
				Employee employee = new Employee();
				employee.setId(resultset.getInt(1));
				employee.setFirst_name(resultset.getString(2));
				employee.setLast_name(resultset.getString(3));
				employee.setAge(resultset.getInt(4));
				employee.setMobile(resultset.getInt(5));
				list.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	public static ArrayList<Employee> readById(int id) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Connection connection = getConnection();
		String sql = "select * from emp where id=?";
		try {
			PreparedStatement readstmt = connection.prepareStatement(sql);
			readstmt.setInt(1, id);
			ResultSet rs = readstmt.executeQuery();
			if (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setFirst_name(rs.getString(2));
				employee.setLast_name(rs.getString(3));
				employee.setAge(rs.getInt(4));
				employee.setMobile(rs.getInt(5));
				list.add(employee);
				connection.close();

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	public static boolean check(String name, String password) {
		boolean bool = false;
		Connection connection = getConnection();
		String sql = "Select * from users";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String username = rs.getString(1);
				String pass = rs.getString(2);
				if (username.compareToIgnoreCase(name) == 0 && password.compareToIgnoreCase(pass) == 0) {
					bool = true;
					break;
				}
			}
		}

		catch (SQLException e) {

			System.out.println("syntax Error");
		}

		return bool;
	}
}
