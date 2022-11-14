package com.ankita.ncd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankita.ncd.dao.PatientDao;
import com.ankita.ncd.entity.Patient;

@Service
public class PatientService {
	
	@Autowired
	PatientDao pd;
	
	public List<Patient> getPatientByFirstname(String firstname)
	{
		return pd.findByFirstname(firstname);
	}

}
