package com.collabera.jump.controllers;

//import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.jump.models.Employee;
import com.collabera.jump.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService helper;
	
//	private Employee employee = new Employee();
//	private HashMap<String, Employee> employees = new HashMap<>();
	
	@GetMapping()
	public ResponseEntity<Iterable<Employee>> getEmployees(){
		return ResponseEntity.ok(helper.getEmployees());
	}
	
//	@GetMapping()
//	private HashMap<String, Employee> getEmployees() {
//		
//		if (employees != null) {
//			return employees;
//		} else {
//			throw new NullPointerException();
//		}
//	}
	
	@GetMapping("test")
	public ResponseEntity<?> getTestEmployees(){
		return ResponseEntity.ok(helper.createTestEmployee());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable(name = "id") String id){
		try {
			int intId = Integer.parseInt(id);
			return ResponseEntity.ok(helper.getEmployeeById(intId));
		} catch (Exception e){
			e.printStackTrace();
			return ResponseEntity.noContent().build();
		}
	}
	
//	@GetMapping("{id}")
//	private Employee getEmployee(@PathVariable(name = "id") String id) {
//		if (employee != null) {
//			return employees.get(id);
//		} else {
//			throw new NullPointerException();
//		}
//	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> addEmployee( @RequestBody Employee employee) {
		System.out.println(employee.toString());
		if (helper.createEmployee(employee)) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} else {
			return ResponseEntity.noContent().build();
		
		}
	}
	
//	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
//	private ResponseEntity<?> newEmployee(@RequestBody @Valid Employee emp) {
//		
//		this.employee = emp;
//		this.employees.put(employee.getEmpId(), employee);
//		
//		if(employee != null) {
//			return ResponseEntity.ok("Employee was created!");
//		} else {
//			return ResponseEntity.noContent().build();
//		}
//	}
	
	@PutMapping(path="{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> updateEmployee(@PathVariable(name = "id") int id, @RequestBody @Valid Employee employee) {
		
		if (helper.updateEmployee(id, employee)) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} else {
			return ResponseEntity.noContent().build();
		}
		
	}
	
//	@PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
//	private ResponseEntity<?> updateEmployee(@RequestBody @Valid Employee emp) {
//		if(emp != null) {
//			return ResponseEntity.ok("Employee was updated!");
//		} else {
//			return ResponseEntity.noContent().build();
//		}
//	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable(name = "id") int id) {	
		
		if (helper.deleteEmployee(id)) {
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.badRequest().build();
			}
		}
	
	
//	@DeleteMapping("{id}")
//	private ResponseEntity<?> deleteEmployee() {
//		employee = null;
//		if (employee == null) {
//			return ResponseEntity.noContent().build();
//		} else {
//			return ResponseEntity.badRequest().build();
//		}
//	}
	
}
