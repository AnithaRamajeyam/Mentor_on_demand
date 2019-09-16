package com.java.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mentor_id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "linkedin_url")
	private String linkedin_url;
	
	@Column(name = "reg_datetime")
	private Date reg_datetime;
	
	@Column(name = "reg_code")
	private String reg_code ;
	
	@Column(name = "active")
	private String active ;
	
	@Column(name = "year_of_experience")
	private float year_of_experience ;
	
	@OneToMany
	private List<MentorSkills> mentor_skills;
	
	public Mentor() {
		
	}
	public Mentor(String email,String password,String username, String linkedin_url, Date reg_datetime, String reg_code, String active,
			float year_of_experience) {
		super();
		this.email=email;
		this.password=password;
		this.username = username;
		this.linkedin_url = linkedin_url;
		this.reg_datetime = reg_datetime;
		this.reg_code = reg_code;
		this.active = active;
		this.year_of_experience = year_of_experience;
	}


	public long getMentor_id() {
		return mentor_id;
	}


	public void setMentor_id(long mentor_id) {
		this.mentor_id = mentor_id;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLinkedin_url() {
		return linkedin_url;
	}
	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
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
	public float getYear_of_experience() {
		return year_of_experience;
	}
	public void setYear_of_experience(float year_of_experience) {
		this.year_of_experience = year_of_experience;
	}
	@Override
	public String toString() {
		return "Mentor [mentor_id=" + mentor_id + ", email=" + email + ", password=" + password + ", username="
				+ username + ", linkedin_url=" + linkedin_url + ", reg_datetime=" + reg_datetime + ", reg_code="
				+ reg_code + ", active=" + active + ", year_of_experience=" + year_of_experience + ", mentor_skills="
				+ mentor_skills + "]";
	}


	
	
}
