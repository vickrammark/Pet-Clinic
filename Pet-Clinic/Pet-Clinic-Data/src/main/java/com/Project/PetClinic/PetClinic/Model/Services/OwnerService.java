package com.Project.PetClinic.PetClinic.Model.Services;

import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	
	Owner findByLastName(String lastName);
	
	Owner save(Owner owner);

	Set<Owner>findAll();

}
