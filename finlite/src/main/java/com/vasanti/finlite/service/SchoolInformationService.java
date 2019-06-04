package com.vasanti.finlite.service;

import java.util.List;

import com.vasanti.finlite.model.SchoolInformationBean;

public interface SchoolInformationService {
	
	SchoolInformationBean saveNewSchoolInformation(SchoolInformationBean schoolInformationBean);
	
	List<String>findSchool(String keyword);

}
