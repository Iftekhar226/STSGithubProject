package com.ifti.fakeServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifti.fakeServer.entity.School;
import com.ifti.fakeServer.repo.SchoolRepository;
@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository rep;
	@Override
	public School saveSchool(School school) {
		return rep.save(school);
	}

	@Override
	public School updateSchool(School school) {
		// TODO Auto-generated method stub
		return rep.save(school);
	}

	@Override
	public void deleteSchool(School school) {
		// TODO Auto-generated method stub
		rep.delete(school);
	}

	@Override
	public List<School> saveSchool() {
		// TODO Auto-generated method stub
		return (List<School>) rep.findAll();
	}

}
