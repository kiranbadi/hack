package com.vasanti.finlite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasanti.finlite.dao.SchoolInformationRepository;
import com.vasanti.finlite.model.SchoolInformationBean;


@Service
public class SchoolInformationServiceImpl implements SchoolInformationService{

	@Autowired
	SchoolInformationRepository schoolInformationRespository;
	
	
	
	/*
	 * This one saves new school information to database.
	 */
	@Override
	public SchoolInformationBean saveNewSchoolInformation(SchoolInformationBean schoolInformationBean) {
		return schoolInformationRespository.save(schoolInformationBean);
	}


	/*
	 * Service is used to suugest schools based on school name and zipcode. Results
	 * are fetched based on keywords.
	 */
	
	@Override
	public List<String> findSchool(String keyword) {
		return schoolInformationRespository.search(keyword);
	}

}
