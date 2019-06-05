package com.db.hack.wise.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.hack.wise.dao.SchoolRepository;
import com.db.hack.wise.model.School;
import com.db.hack.wise.service.SchoolService;

/**
 * Created by Balamurugan on 6/4/2019.
 */
@Component
public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public School get(int id) {
		Optional<School> result = schoolRepository.findById((long) id);
		if (result.isPresent()) {
			return result.get();
		}

		return new School();
	}

	@Override
	public List<School> getAll() {
		List<School> schoolList = new ArrayList<School>();
		Iterable<School> result = schoolRepository.findAll();
		if (result != null) {
			result.forEach(school -> schoolList.add(school));
		}
		return Arrays.asList(new School());
	}

	@Override
	public School update(School school) {
		School response = schoolRepository.save(school);
		return response;
	}

	@Override
	public void delete(int id) {
		schoolRepository.deleteById((long) id);
	}

	@Override
	public School save(School school) {
		School response = schoolRepository.save(school);
		return response;
	}
}
