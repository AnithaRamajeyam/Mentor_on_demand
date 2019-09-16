package com.java.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "trainings")
public class Trainings {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tid;
	@Column(name = "user_id")
	private long user_id;
	@Column(name = "mentor_id")
	private long mentor_id;
	@Column(name = "skill_id")
	private long skill_id;
	@Column(name = "status")
	private String status;
	@Column(name = "progress")
	private double progress;
	@Column(name = "rating")
	private int rating;
	@JsonFormat(pattern="HH:mm:ss")
	@Column(name = "start_time")
	private String start_time;
	@JsonFormat(pattern="HH:mm:ss")
	@Column(name = "end_time")
	private String end_time;
	@Column(name = "start_date")
	private Date start_date;
	@Column(name = "end_date")
	private Date end_date;
	@Column(name = "amount_received")
	private double amount_received;
	@Column(name = "fees")
	private float fees;
	
	public Trainings() {
		
	}
	
	

	public Trainings(long tid, long user_id, long mentor_id, long skill_id, String status, double progress, int rating,
			String start_time, String end_time, Date start_date, Date end_date, double amount_received, float fees) {
		super();
		this.tid = tid;
		this.user_id = user_id;
		this.mentor_id = mentor_id;
		this.skill_id = skill_id;
		this.status = status;
		this.progress = progress;
		this.rating = rating;
		this.start_time = start_time;
		this.end_time = end_time;
		this.start_date = start_date;
		this.end_date = end_date;
		this.amount_received = amount_received;
		this.fees = fees;
	}



	public long getTid() {
		return tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(long mentor_id) {
		this.mentor_id = mentor_id;
	}

	public long getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(long skill_id) {
		this.skill_id = skill_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
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

	public double getAmount_received() {
		return amount_received;
	}

	public void setAmount_received(double amount_received) {
		this.amount_received = amount_received;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}



	@Override
	public String toString() {
		return "Trainings [tid=" + tid + ", user_id=" + user_id + ", mentor_id=" + mentor_id + ", skill_id=" + skill_id
				+ ", status=" + status + ", progress=" + progress + ", rating=" + rating + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", amount_received=" + amount_received + ", fees=" + fees + "]";
	}
	
	
	
	
}
