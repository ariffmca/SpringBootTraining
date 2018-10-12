package com.learn.models;

public class Project {
	
	private String projName;
	private int noOfDays;
	
	public Project() {}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "\nProject [projName=" + projName + ", noOfDays=" + noOfDays + "]";
	}
	
	

}
