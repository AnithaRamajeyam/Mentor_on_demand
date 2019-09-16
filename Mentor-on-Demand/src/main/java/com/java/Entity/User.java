package com.java.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "contact_no")
	private String contact_no;
	
	@Column(name = "reg_datetime")
	private Date reg_datetime;
	
	@Column(name = "reg_code")
	private String reg_code ;
	
	@Column(name = "active")
	private String active ;

	public User() {
	}
	
	public User( String email, String password, String first_name, String last_name, String contact_no,
			Date reg_datetime, String reg_code, String active) {
		super();
		
		this.email = email;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.contact_no = contact_no;
		this.reg_datetime = reg_datetime;
		this.reg_code = reg_code;
		this.active = active;
	}

	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public Date getReg_datetime() {
		return reg_datetime;
	}
	public void setReg_datetime(Date reg_datetime) {
		this.reg_datetime = reg_datetime;
	}
	public String getReg_code() {
		return reg_code;
	}
	public void setReg_code(String reg_code) {
		this.reg_code = reg_code;
	}
	

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", contact_no=" + contact_no + ", reg_datetime=" + reg_datetime
				+ ", reg_code=" + reg_code + ", active=" + active + "]";
	}
	 
	
	
}
