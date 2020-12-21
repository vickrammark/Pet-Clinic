package com.Project.PetClinic.PetClinic.Model;

public class PetType  extends BaseEntity{
	
	private String name;

	public PetType(String name) {
		super();
		this.name = name;
	}

	public PetType() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
