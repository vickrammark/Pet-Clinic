package com.Project.PetClinic.PetClinic.Model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{

	public Vet(String firstname, String lastname) {
		super(firstname, lastname);
	}

	public Vet() {
		// TODO Auto-generated constructor stub
	}
	
	private Set<Speciality> specialities=new HashSet<>();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	

}
