package com.db.hack.wise.service;

import java.util.List;

import com.db.hack.wise.model.School;

/**
 * Created by Balamurugan on 6/4/2019.
 */

public interface SchoolService {
	public School get(int id);
	public List<School> getAll();
	public School update(int id, School school);
	public void delete(int id);
	public School save(School school);
}
