package com.java.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
public class TrainingsController {

	@Autowired
	private TrainingsRepository repository;
	
	@Autowired
	private MentorRepository mentor_repository;
	
	@Autowired
	private UserRepository user_repository;
	 
	@Autowired
	private SkillsRepository skills_repository;
	
	
	
	@PostMapping(value = "/trainings/create")
	public ResponseEntity<Void> postTrainings(@RequestBody Trainings trainings) {

		repository.save(new Trainings ( trainings.getTid(), trainings.getUser_id(), trainings.getMentor_id(), trainings.getSkill_id(), trainings.getStatus(),  trainings.getProgress(),trainings.getRating(),
				trainings.getStart_time(), trainings.getEnd_time(), trainings.getStart_date(), trainings.getEnd_date(), trainings.getAmount_received(), trainings.getFees()));
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	
	
	@GetMapping("/trainings/get/{tid}")
	public Optional<Trainings> getAllDetails(@PathVariable("tid") long tid) {
		System.out.println("Get all Trainings of id...");
		Optional<Trainings> trainings = repository.findById(tid);
		return trainings;
	}
	
	public List<TrainingsModel> trainings(List<Trainings> trainings_list)
	{
		List<TrainingsModel> traningsmodel_list = new ArrayList<TrainingsModel>();
		for(Trainings trainings:trainings_list)
		{
			long mentor_id = trainings.getMentor_id();
			Optional<Mentor> mentor = mentor_repository.findById( mentor_id);
			
			long user_id = trainings.getUser_id();
			Optional<User> user = user_repository.findById(user_id);
		
			long skill_id = trainings.getUser_id();
			Optional<Skills> skills = skills_repository.findById(skill_id);
		
			TrainingsModel tmodel = new TrainingsModel( trainings.getTid(), user.get().getEmail(), mentor.get().getUsername(), skills.get().getName() ,trainings.getRating(),trainings.getProgress(),trainings.getStatus(),trainings.getStart_date(),trainings.getEnd_date());		
			traningsmodel_list.add(tmodel);
		}
		
		return traningsmodel_list;
	}
	
	@GetMapping("/trainings/getFinalize/{tid}")
	public List<Trainings> getAllFinalize(@PathVariable("tid") long tid)
	{
			System.out.println("Get all Finalize  Trainings of id...");
			List<Trainings> trainings = repository.getAllFinalize(tid);
			return trainings;
	}
		
	@PutMapping("/trainings/getApproval/{tid}")
	public ResponseEntity<Trainings> getAllApprove(@PathVariable("tid") long tid) {
		
		Optional<Trainings> trainingsData = repository.findById(tid);

		if (trainingsData.isPresent()) {
			Trainings approve = trainingsData.get();
			approve.setStatus("approved");
			return new ResponseEntity<>(repository.save(approve), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/trainings/rejectProposal/{tid}")
	public ResponseEntity<Trainings> getAllRejected(@PathVariable("tid") long tid) {
		
		Optional<Trainings> trainingsData = repository.findById(tid);

		if (trainingsData.isPresent()) {
			Trainings reject = trainingsData.get();
			reject.setStatus("Rejected");
			return new ResponseEntity<>(repository.save(reject), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
