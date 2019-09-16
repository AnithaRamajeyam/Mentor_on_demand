package com.java.Entity;

import java.sql.Date;

public class TrainingsModel {
	
	private long tid;
	private String username;
	private String mentor_name;
	private String skill_name;
	private int rating;
	private double progress;
	private String status;
	private Date start_date;
	private Date end_date;
	public TrainingsModel()
	{
	}
	
	public TrainingsModel(long tid, String username, String mentor_name, String skill_name, int rating, double progress,
			String status, Date start_date, Date end_date) {
		super();
		this.tid = tid;
		this.username = username;
		this.mentor_name = mentor_name;
		this.skill_name = skill_name;
		this.rating = rating;
		this.progress = progress;
		this.status = status;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMentor_name() {
		return mentor_name;
	}
	public void setMentor_name(String mentor_name) {
		this.mentor_name = mentor_name;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
}

