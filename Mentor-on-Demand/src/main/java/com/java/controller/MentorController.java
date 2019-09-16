package com.java.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Entity.Login;
import com.java.Entity.Mentor;
import com.java.Entity.MentorSkills;
import com.java.Entity.Skills;
import com.java.Entity.Trainings;
import com.java.Entity.TrainingsModel;
import com.java.Entity.User;
import com.java.repo.MentorRepository;
import com.java.repo.MentorSkillsRepository;
import com.java.repo.SkillsRepository;
import com.java.repo.TrainingsRepository;
import com.java.repo.UserRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MentorController  {
	@Autowired
	private MentorRepository mentor_repository;
	@Autowired
	private TrainingsRepository repository;
	@Autowired
	private UserRepository user_repository;
	 
	@Autowired
	private SkillsRepository skills_repository;
	@Autowired
	private MentorSkillsRepository mentorSkillsrepository;

	
	@GetMapping("/login/get/Mentor")
	public Iterable<Mentor> getAllDetails() {
		
		Iterable<Mentor> credentials = mentor_repository.findAll();
		return credentials;
	}
	
	//String email,String password,String username, String linkedin_url, Date reg_datetime, String reg_code, String active,
	//float year_of_experience
	
	@PostMapping(value = "/mentor/detail/create")
	public Mentor postMentors(@RequestBody Mentor mentor) {
		Mentor insert_mentor=mentor_repository.save(new Mentor (mentor.getEmail() , mentor.getPassword(),mentor.getUsername(),mentor.getLinkedin_url() ,mentor.getReg_datetime() ,mentor.getReg_code() ,mentor.getActive(),mentor.getYear_of_experience()));
		return insert_mentor;
	}

	@GetMapping("/mentor/getDetails/{mid}")
	public Optional<Mentor> getAllDetails(@PathVariable("mid") long mid) {
		System.out.println("Get all Trainings of id...");
		Optional<Mentor> mentorSkills = mentor_repository.findById(mid);
		return mentorSkills;
	}
	
	@GetMapping("/mentor/viewProposals/{mentor_id}")
public List<TrainingsModel> getProposal(@PathVariable("mentor_id") long mentor_id) {
		
		System.out.println("ud"+mentor_id);
		List<Trainings> trainings = repository.getAllProposals(mentor_id);
		if(trainings!=null) {
			System.out.println(trainings);
		}
		List<TrainingsModel> traningsm_list=trainings(trainings);
		return traningsm_list;		
	}
	
	@GetMapping("/mentor/getCompleted/{mentor_id}")
	public List<TrainingsModel> getAllCompletedTraining(@PathVariable("mentor_id") long mentor_id)
	{
		List<Trainings> trainings_list = repository.getAllCompletedTraining(mentor_id);
		List<TrainingsModel> traningsm_list=trainings(trainings_list);
		return traningsm_list;
	}
	
	@GetMapping("/mentor/getOnProgress/{mentor_id}")
	public List<TrainingsModel> getAllOnProgress(@PathVariable("mentor_id") long mentor_id)
	{
		
		 List<Trainings> tranings_list = repository.getAllOnProgress(mentor_id);
			System.out.println("Get all On Progress Trainings of id...");
			List<TrainingsModel> traningsm_list=trainings(tranings_list);
			return traningsm_list;
	}
	
	public List<TrainingsModel> trainings(List<Trainings> trainings_list)
	{
		List<TrainingsModel> traningsmodel_list = new ArrayList<TrainingsModel>();
		for(Trainings trainings:trainings_list)
		{
			long mentor_id = trainings.getMentor_id();
			System.out.println(mentor_id);
			Optional<Mentor> mentor = mentor_repository.findById( mentor_id);
			
			long user_id = trainings.getUser_id();
			System.out.println(user_id);

			Optional<User> user = user_repository.findById(user_id);
		
			long skill_id = trainings.getSkill_id();
			System.out.println(skill_id);

			Optional<Skills> skills = skills_repository.findById(skill_id);
		
			TrainingsModel tmodel = new TrainingsModel( trainings.getTid(), user.get().getFirst_name(), mentor.get().getUsername(), skills.get().getName() ,trainings.getRating(),trainings.getProgress(),trainings.getStatus(),trainings.getStart_date(),trainings.getEnd_date());
			
			traningsmodel_list.add(tmodel);
		}
		System.out.println(traningsmodel_list);
		
		return traningsmodel_list;
	}
	
	

}
