package com.db.hack.wise.service;

import java.util.List;

import com.db.hack.wise.model.SchoolInformationBean;

public interface SchoolInformationService {
	
	SchoolInformationBean saveNewSchoolInformation(SchoolInformationBean schoolInformationBean);
	
	List<String>findSchool(String keyword);

}
