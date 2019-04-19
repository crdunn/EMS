package com.collabera.jump.models;

import java.util.ArrayList;

public class Manager extends Employee {
	
	private ArrayList<String> reportsFrom;

	public ArrayList<String> getReportsFrom() {
		return reportsFrom;
	}

	public void setReportsFrom(ArrayList<String> reportsFrom) {
		this.reportsFrom = reportsFrom;
	}
	
	public void addReportsFrom(String id) {
		this.reportsFrom.add(id);
	}

}
