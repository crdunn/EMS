package com.collabera.jump.models;


import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@MappedSuperclass
public class Person {
	
	
	//@Size(min=2,max=30,message="Name Must be between 2 and 30 Characters")
	private String personalName;
	
	//@Size(min=2,max=30,message="Name Must be between 2 and 30 Characters")
	private String familyName;
	
	private int age;
	
	private GENDER gender; 
	
	//@Pattern(regexp="[0-9]{10}", message="A phone number must be 10 digits")
	private String phone;
	
	@OneToOne(cascade=CascadeType.ALL, orphanRemoval=true, targetEntity=Address.class)
	private Address address;
	
	//@Pattern(regexp="[0-9]{9}", message="A social security number must be 9 digits")
	private String ssn;
	
	//@Email(message="please enter a valid email")
	private String email;


	public String getPersonalName() {
		return personalName;
	}

	public void setPersonalName(String personalName) {
		this.personalName = personalName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [personalName=" + personalName + ", familyName=" + familyName + ", age=" + age + ", gender="
				+ gender + ", phone=" + phone + ", address=" + address + ", ssn=" + ssn + ", email=" + email + "]";
	}
	
}
