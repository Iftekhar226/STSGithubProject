package com.ifti.fakeServer.repo;

import org.springframework.data.repository.CrudRepository;

import com.ifti.fakeServer.entity.School;

public interface SchoolRepository extends CrudRepository<School, Integer> {

}
