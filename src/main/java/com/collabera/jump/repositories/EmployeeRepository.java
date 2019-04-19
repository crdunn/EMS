package com.collabera.jump.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.collabera.jump.models.Employee;


@Component
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
