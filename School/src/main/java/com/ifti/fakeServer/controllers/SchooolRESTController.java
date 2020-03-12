package com.ifti.fakeServer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ifti.fakeServer.entity.School;
import com.ifti.fakeServer.repo.SchoolRepository;

@RestController
@RequestMapping("/School")
public class SchooolRESTController {
	
	@Autowired
	SchoolRepository repo;
	
	@PostMapping
	public School saveSchool(@RequestBody School school)
	{
		return repo.save(school);	
	}
	
/*public Admin saveAdmin(@RequestBody Admin admin)
{
return _ret.save(admin);
}*/
}
