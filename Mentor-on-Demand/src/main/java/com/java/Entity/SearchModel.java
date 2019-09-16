package com.java.Entity;


public class SearchModel {
	private long mentor_id;
	private String username;
	private long skill_id;
	private String skill_name;
	private float self_rating;
	private float years_of_exp;
	private String facilities_offered;
	public SearchModel()
	{
		
	}
	

	public SearchModel(long mentor_id, String username, long skill_id, String skill_name, float self_rating,
			float years_of_exp, String facilities_offered) {
		super();
		this.mentor_id = mentor_id;
		this.username = username;
		this.skill_id = skill_id;
		this.skill_name = skill_name;
		this.self_rating = self_rating;
		this.years_of_exp = years_of_exp;
		this.facilities_offered = facilities_offered;
	}
	public long getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(long mentor_id) {
		this.mentor_id = mentor_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(long skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
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
	public void setYears_of_exp(float years_of_exp) {
		this.years_of_exp = years_of_exp;
	}
	public String getFacilities_offered() {
		return facilities_offered;
	}
	public void setFacilities_offered(String facilities_offered) {
		this.facilities_offered = facilities_offered;
	}
	
	
	
}
