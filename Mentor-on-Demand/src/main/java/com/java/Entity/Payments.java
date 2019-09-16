package com.java.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	@Column(name = "mentor_id")
	private long mentor_id;
	@Column(name = "training_id")
	private long training_id;
	@Column(name = "txn_type")
	private String txn_type;
	@Column(name = "amount")
	private double amount;
	@Column(name = "datetime")
	private Date datetime;
	@Column(name = "remarks")
	private String remarks;
	
	
	public Payments(long pid, long mentor_id, long training_id, String txn_type, double amount, Date datetime,
			String remarks) {
		super();
		this.pid = pid;
		this.mentor_id = mentor_id;
		this.training_id = training_id;
		this.txn_type = txn_type;
		this.amount = amount;
		this.datetime = datetime;
		this.remarks = remarks;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public long getMentor_id() {
		return mentor_id;
	}
	public void setMentor_id(long mentor_id) {
		this.mentor_id = mentor_id;
	}
	public long getTraining_id() {
		return training_id;
	}
	public void setTraining_id(long training_id) {
		this.training_id = training_id;
	}
	public String getTxn_type() {
		return txn_type;
	}
	public void setTxn_type(String txn_type) {
		this.txn_type = txn_type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Payments [pid=" + pid + ", mentor_id=" + mentor_id + ", training_id=" + training_id + ", txn_type="
				+ txn_type + ", amount=" + amount + ", datetime=" + datetime + ", remarks=" + remarks + "]";
	}
   
	
	

}
