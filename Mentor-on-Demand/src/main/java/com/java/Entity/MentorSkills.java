package com.java.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_skills")
public class MentorSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long msid;
	
	@ManyToOne	
	@JoinColumn(name="mentor_id")
	private Mentor mentor;
	
	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
	@Column(name = "skill_id")
	private long skill_id;
	
	
	
	@Column(name = "self_rating")
	private float self_rating;
	
	@Column(name = "years_of_exp")
	private float years_of_exp;
	
	@Column(name = "trainings_delivered")
	private String trainings_delivered;
	
	@Column(name = "facilities_offered")
	private String facilities_offered;
	
	

	public MentorSkills() {
		
	}
	
	public MentorSkills(long msid,long skill_id, float self_rating, float years_of_exp,
			String trainings_delivered, String facilities_offered) {
		super();
		this.msid = msid;
		this.skill_id = skill_id;
		this.self_rating = self_rating;
		this.years_of_exp = years_of_exp;
		this.trainings_delivered = trainings_delivered;
		this.facilities_offered = facilities_offered;
	}

	public long getMsid() {
		return msid;
	}

	public void setMsid(long msid) {
		this.msid = msid;
	}

	
	public long getSkill_id() {
		return skill_id;
	}

	

	public void setSkill_id(long skill_id) {
		this.skill_id = skill_id;
	}

	public float getSelf_rating() {
		return self_rating;
	}

	public void setSelf_rating(float self_rating) {
		this.self_rating = self_rating;
	}

	public float getYears_of_exp() {
		return years_of_exp;
	}

	public void setYears_of_exp(int years_of_exp) {
		this.years_of_exp = years_of_exp;
	}

	public String getTrainings_delivered() {
		return trainings_delivered;
	}

	public void setTrainings_delivered(String trainings_delivered) {
		this.trainings_delivered = trainings_delivered;
	}

	public String getFacilities_offered() {
		return facilities_offered;
	}

	public void setFacilities_offered(String facilities_offered) {
		this.facilities_offered = facilities_offered;
	}

	@Override
	public String toString() {
		return "MentorSkills [msid=" + msid +  ", skill_id=" + skill_id + ", self_rating=" + self_rating
				+ ", years_of_exp=" + years_of_exp + ", trainings_delivered=" + trainings_delivered
				+ ", facilities_offered=" + facilities_offered + "]";
	}
	
	
	
}
