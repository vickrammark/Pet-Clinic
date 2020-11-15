package com.Project.PetClinic.PetClinic.Model.Services;

import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	
	
	Owner findByLastName(String lastName);
	
	

}
