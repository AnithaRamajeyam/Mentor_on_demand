package com.java.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long skill_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "TOC")
	private String TOC;
	
	@Column(name = "duration")
	private Date duration;
	
	@Column(name = "prerequites")
	private String prerequites;
	
	@Column(name = "mentor_id")
	private long mentor_id;
	
	public Skills()
	{
		
	}
	public Skills(long skill_id, String name, String tOC, Date duration, String prerequites,long mentor_id) {
		super();
		this.skill_id = skill_id;
		this.name = name;
		TOC = tOC;
		this.duration = duration;
		this.prerequites = prerequites;
		this.mentor_id=mentor_id;
	}

	public long getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(long skill_id) {
		this.skill_id = skill_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTOC() {
		return TOC;
	}

	public void setTOC(String tOC) {
		TOC = tOC;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public String getPrerequites() {
		return prerequites;
	}

	public void setPrerequites(String prerequites) {
		this.prerequites = prerequites;
	}

	public long getMentor_id() {
		return mentor_id;
	}
	public void setMentor_id(long mentor_id) {
		this.mentor_id = mentor_id;
	}
	@Override
	public String toString() {
		return "Skills [skill_id=" + skill_id + ", name=" + name + ", TOC=" + TOC + ", duration=" + duration
				+ ", prerequites=" + prerequites + ",mentor_id="+mentor_id+"]";
	}

	
	
}
