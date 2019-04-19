package com.collabera.jump.controllers;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.jump.models.DEPARTMENT;
import com.collabera.jump.models.GENDER;
import com.collabera.jump.models.STATE;

@RestController
@RequestMapping("enum")
public class EnumController {
	
	@GetMapping("departments")
	public ResponseEntity<DEPARTMENT []> getDepartments(){
		return ResponseEntity.ok(DEPARTMENT.values());
	}
	
	@GetMapping("gender")
	public ResponseEntity<GENDER []> getGender(){
		return ResponseEntity.ok(GENDER.values());
	}
	
	@GetMapping("state")
	public ResponseEntity<STATE []> getState(){
		return ResponseEntity.ok(STATE.values());
	}
	
	
	@GetMapping("all")
	public ResponseEntity<?> getAll(){
		HashMap<String, Object> all = new HashMap<>();
		all.put("departments", DEPARTMENT.values());
		all.put("gender", GENDER.values());
		all.put("state", STATE.values());
		
		return ResponseEntity.ok(all);
	}

}
