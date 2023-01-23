package com.database.connection.springboot.studentservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "query_find_all_users", query = "select u from User u")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(Long id, String name, String role) {
		super();
//		this.id = id;
		this.name = name;
		this.role = role;
	}

	protected User() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected User(String string, String string2) {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
