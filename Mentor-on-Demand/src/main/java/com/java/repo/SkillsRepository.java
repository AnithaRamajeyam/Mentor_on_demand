package com.java.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.Entity.Skills;
@Repository
public interface SkillsRepository extends  JpaRepository<Skills, Long>
{
	@Query(value="SELECT * FROM skills s Where s.name LIKE %?% ", nativeQuery=true)
	public List<Skills> getSkillsBYName(String name);
	
	@Query(value="SELECT s.name FROM skills s  ", nativeQuery=true)
	public List<String> getAllSkillsDetails();
	
}

