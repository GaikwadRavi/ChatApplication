package com.backend.mode;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table
@Component
public class UserDetails {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String password;
	private String contact;
	private String address;
	/*private String role;
	
	@Column(name = "admin")
	private boolean isAdmin;
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*public boolean isAdmin()
	{
		return isAdmin;
	}*/

}
