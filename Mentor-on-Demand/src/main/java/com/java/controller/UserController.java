package com.java.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Entity.Mentor;
import com.java.Entity.Skills;
import com.java.Entity.Trainings;
import com.java.Entity.TrainingsModel;
import com.java.Entity.User;
import com.java.repo.MentorRepository;
import com.java.repo.SkillsRepository;
import com.java.repo.TrainingsRepository;
import com.java.repo.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository user_repository;
	
	@Autowired
	private TrainingsRepository repository;
	
	@Autowired
	private MentorRepository mentor_repository;
	
	@Autowired
	private SkillsRepository skills_repository;
	
	@GetMapping("/login/get/User")
	public Iterable<User> getAllDetails() {
		
		Iterable<User> credentials = user_repository.findAll();
		return credentials;
	}
	
	@PostMapping(value = "/user/detail/create")
	public User postUsers(@RequestBody User user) {
		User insert_user=user_repository.save(new User (user.getEmail() , user.getPassword(),user.getFirst_name(),user.getLast_name(),user.getContact_no(),user.getReg_datetime(),user.getReg_code(),user.getActive()));
		return insert_user;
	}

	
	@GetMapping("/user/viewResponses/{user_id}")
	public List<TrainingsModel> getAllResponse(@PathVariable("user_id") long user_id) {
		
		List<Trainings> trainings_list = repository.getAllResponse(user_id);	
		if(trainings_list!=null)
		{
			System.out.println(trainings_list+"success");
		}	
		else
		{
			System.out.println("not success");
		}
		List<TrainingsModel> trainingsm_list=trainings(trainings_list);
		return trainingsm_list;
	}
	
	@GetMapping("/user/getallCompleted/{user_id}")
	public List<TrainingsModel> getAllCompletedTraining(@PathVariable("user_id") long user_id)
	{
		List<Trainings> trainings_list = repository.getAllUserCompletedTraining(user_id);
		
		List<TrainingsModel> traningsm_list=trainings(trainings_list);
		return traningsm_list;
	}
	
	@GetMapping("/user/getOnProgress/{user_id}")
	public List<TrainingsModel> getAllOnProgress(@PathVariable("user_id") long user_id)
	{
		
		 List<Trainings> tranings_list = repository.getAllOnProgress(user_id);
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
			Optional<Mentor> mentor = mentor_repository.findById( mentor_id);
//			System.out.println(mentor_id);
			//System.out.println(mentor);
			long user_id = trainings.getUser_id();
			Optional<User> user = user_repository.findById(user_id);
			//System.out.println(user_id);
			long skill_id = trainings.getSkill_id();
			Optional<Skills> skills = skills_repository.findById(skill_id);
			//              System.out.println(skill_id);
			//System.out.println(trainings.getStatus());
		
			TrainingsModel tmodel = new TrainingsModel( trainings.getTid(), user.get().getFirst_name(), mentor.get().getUsername(), skills.get().getName() ,trainings.getRating(),trainings.getProgress(),trainings.getStatus(),trainings.getStart_date(),trainings.getEnd_date());
			traningsmodel_list.add(tmodel);
		}
		System.out.println(traningsmodel_list);
		return traningsmodel_list;
	}

	
	

}
