package com.java.bridgelabz.servletcrud.service.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.bridgelabz.servletcrud.employeedao.EmployeeDao;
import com.java.bridgelabz.servletcrud.model.Employee;
import com.java.bridgelabz.servletcrud.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void update(Employee employee) {
		Connection connection = EmployeeDao.getConnection();
		String sql = "update Emp set firstname=?,lastname=?,age=?,mobile=? where id=?";
		try {
			PreparedStatement updatestmt = connection.prepareStatement(sql);
			updatestmt.setString(1, employee.getFirst_name());
			updatestmt.setString(2, employee.getLast_name());
			updatestmt.setInt(3, employee.getAge());
			updatestmt.setInt(4, employee.getMobile());
			updatestmt.setInt(5, employee.getId());
			updatestmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int id) {
		Connection connection = EmployeeDao.getConnection();
		try {
			PreparedStatement updatestmt = connection.prepareStatement("Delete from emp where id=?");
			updatestmt.setInt(1, id);
			updatestmt.executeUpdate();
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
