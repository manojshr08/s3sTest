package com.manojcompany.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manojcompany.demo.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
	
	

}
