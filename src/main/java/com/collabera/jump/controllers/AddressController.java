package com.collabera.jump.controllers;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.jump.models.Address;

@RestController
@RequestMapping("/address")
public class AddressController {
	
//	private Address address = new Address();
//	private HashMap<String, Address> addresses = new HashMap<>();
	
//	@GetMapping()
//	private HashMap<String, Address> getAddresses() {
//		
//		if (addresses != null) {
//			return addresses;
//		} else {
//			throw new NullPointerException();
//		}
//	}
	
//	@GetMapping("{id}")
//	private Address getAddress(@PathVariable(name = "id") String id) {
//		
//		if (addresses != null) {
//			return addresses.get(id);
//		} else {
//			throw new NullPointerException();
//		}
//	}

	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> newAddress(@RequestBody @Valid Address address) {
		
		return null;
	}
	
//	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
//	private ResponseEntity<?> newAddress(@RequestBody @Valid Address emp) {
//		
//		this.address = emp;
//		this.addresses.put(address.getAddId(), address);
//		
//		if(address != null) {
//			return ResponseEntity.ok("address was created!");
//		} else {
//			return ResponseEntity.noContent().build();
//		}
//	}
	
//	@PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
//	private ResponseEntity<?> updateAddress(@RequestBody @Valid Address emp){
//		
//		this.address = emp;
//		this.addresses.put(address.getAddId(), address);
//		
//		if(address != null) {
//			return ResponseEntity.ok("address was created!");
//		} else {
//			return ResponseEntity.noContent().build();
//		}
//	}
}
