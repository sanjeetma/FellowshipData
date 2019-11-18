package com.springboot.crud.model;


import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Employee {
	
	@GeneratedValue
	@Id
	private Long Id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private boolean status;
	@Column
	private String password;
	
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
}
