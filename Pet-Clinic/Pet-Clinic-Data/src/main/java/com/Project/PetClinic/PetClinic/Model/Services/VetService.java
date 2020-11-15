package com.Project.PetClinic.PetClinic.Model.Services;

import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.Vet;


public interface VetService {
	
Vet findById(Long id);
	
	Vet findByLastName(String lastName);
	
	Vet save(Vet Vet);

	Set<Vet>findAll();

}
