package com.java.servlet.crud.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.java.servlet.crud.model.Employee;

public class EmployeeDao {

	public Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/employee";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return con;
	}

	public void create(Employee emp) throws SQLException {
		Connection con = getConnection();
		String sql = "insert into Emp (first_name,last_name,age,mobile)values(?,?,?,?)";
		PreparedStatement insertstmt = con.prepareStatement(sql);
		insertstmt.setString(1, emp.getFirst_name());
		insertstmt.setString(2, emp.getLast_name());
		insertstmt.setInt(3, emp.getAge());
		insertstmt.setInt(4, emp.getMobile());

		insertstmt.executeUpdate();
		con.close();

	}

	public void update(Employee emp) {
		Connection con = getConnection();
		String sql = "update Emp set first_name=?,last_name=?,age=?,mobile=? where id=?";
		try {
			PreparedStatement updatestmt = con.prepareStatement(sql);
			updatestmt.setString(1, emp.getFirst_name());
			updatestmt.setString(2, emp.getLast_name());
			updatestmt.setInt(3, emp.getAge());
			updatestmt.setInt(4, emp.getMobile());
			updatestmt.setInt(5, emp.getId());
			updatestmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void delete(int id) {
		Connection con = getConnection();
		String sql = "delete from Emp where id=?";
		try {
			PreparedStatement deletestmt = con.prepareStatement(sql);
			deletestmt.setInt(1, id);
			deletestmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public Employee getEmployee(int id) {
		Employee emp = new Employee();
		Connection con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from Emp where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setFirst_name(rs.getString(2));
				emp.setLast_name(rs.getString(3));
				emp.setAge(rs.getInt(4));
				emp.setMobile(rs.getInt(5));

			}
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	public  List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		Connection con=getConnection();
		try {
			PreparedStatement stmt=con.prepareStatement("select * from Emp");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirst_name(rs.getString(2));
				emp.setLast_name(rs.getString(3));
				emp.setAge(rs.getInt(4));
				emp.setMobile(rs.getInt(5));
				list.add(emp);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
   return list;
	}
}
