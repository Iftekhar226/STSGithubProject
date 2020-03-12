package com.ifti.fakeServer.service;

import java.util.List;

import com.ifti.fakeServer.entity.School;

public interface SchoolService {

	School saveSchool(School school);
	School updateSchool(School school);
	void deleteSchool(School school);
	List<School> saveSchool();
}
