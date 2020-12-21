package com.Project.PetClinic.PetClinic.Model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person{

	public Owner(String firstname, String lastname) {
		super(firstname, lastname);
		// TODO Auto-generated constructor stub
	}

	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String address;
	private String city;
	private String telephone;	
	private Set<Pet>Pets=new HashSet<Pet>();
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set<Pet> getPets() {
		return Pets;
	}

	public void setPets(Set<Pet> pets) {
		Pets = pets;
	}
	
	

}
