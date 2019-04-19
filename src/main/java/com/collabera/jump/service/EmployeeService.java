package com.collabera.jump.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.jump.models.Address;
import com.collabera.jump.models.DEPARTMENT;
import com.collabera.jump.models.Employee;
import com.collabera.jump.models.GENDER;
import com.collabera.jump.models.STATE;
import com.collabera.jump.repositories.AddressRepository;
import com.collabera.jump.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Autowired
	private AddressRepository adRepo;
	
	public Iterable<Employee> getEmployees(){
		return repo.findAll();
	}
	
	public Optional<Employee> getEmployeeById (int id){
		try{
			return repo.findById(id);
		} catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean createEmployee(Employee employee) {
		Employee newEmployee;
		
		try {
			//Address address = adRepo.save(employee.getAddress());
			newEmployee = repo.save(employee);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		if(newEmployee != null) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean updateEmployee(int id, Employee employee) {
		
		if (repo.existsById(id)) {
			repo.deleteById(id);
			Employee newEmployee = repo.save(employee);
			
			if (newEmployee != null) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}

	}
	
	public boolean deleteEmployee(int id) {
		
		repo.deleteById(id);
		try{
			repo.findById(id);
			return false;
		} catch (Exception e){
			//e.printStackTrace();
			return true;
		}
	}
	
	public boolean createTestEmployee() {
		Employee employee = new Employee();
		Address address = new Address();
		
		Employee newEmployee;
		
		address.setCity("Basking Ridge");
		address.setNum("1");
		address.setState(STATE.NJ);
		address.setStreet("Allen Road");
		address.setZip("12345");
		
		employee.setAddress(address);
		employee.setAge(50);
		employee.setDepartment(DEPARTMENT.IT);
		employee.setEmail("hi@hi.com");
		employee.setEmployeeId("12345");
		employee.setFamilyName("server");
		employee.setPersonalName("test");
		employee.setGender(GENDER.FEMALE);
		employee.setJobTitle("Overlord");
		employee.setPhone("123456789");
		employee.setReportsTo("Manager");
		employee.setSalary(300);
		employee.setSsn("987654321");
		
		
		try {
			//Address newAddress = adRepo.save(employee.getAddress());
			newEmployee = repo.save(employee);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		if(newEmployee != null) {
			return true;
		} else {
			return false;
		}
		
	}

}
