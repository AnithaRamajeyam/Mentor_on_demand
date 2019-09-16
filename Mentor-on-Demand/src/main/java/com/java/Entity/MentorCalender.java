package com.java.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorCalender")
public class MentorCalender {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mcid;
	
	@Column(name = "mid")
	private long mid;
	
	@Column(name = "start_time")
	private String start_time;
	
	@Column(name = "end_time")
	private String end_time;
	
	@Column(name = "start_date")
	private Date start_date;
	
	@Column(name = "end_date")
	private Date end_date;

	public MentorCalender(long mcid, long mid, String start_time, String end_time, Date start_date, Date end_date) {
		super();
		this.mcid = mcid;
		this.mid = mid;
		this.start_time = start_time;
		this.end_time = end_time;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public long getMcid() {
		return mcid;
	}

	public void setMcid(long mcid) {
		this.mcid = mcid;
	}

	public long getMid() {
		return mid;
	}

	public void setMid(long mid) {
		this.mid = mid;
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

	@Override
	public String toString() {
		return "MentorCalender [mcid=" + mcid + ", mid=" + mid + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	

}
