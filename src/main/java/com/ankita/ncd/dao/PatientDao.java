package com.ankita.ncd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ankita.ncd.entity.Patient;


public interface PatientDao extends JpaRepository<Patient, Long>
{
	Patient findById(long patient_id);
	
	List<Patient> findAll();

	public List<Patient> findByFirstname(String firstname);
	
	/*@Transactional 
	@Modifying 
	@Query("update Patient set score = ?1, screening=?2 where patient_id = ?2") 
	int updateScoreAndScreenig(int total, String Screening, long patient_id);*/
}

