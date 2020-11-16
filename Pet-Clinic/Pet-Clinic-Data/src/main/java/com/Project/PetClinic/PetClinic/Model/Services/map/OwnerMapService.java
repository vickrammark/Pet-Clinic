package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.Owner;
import com.Project.PetClinic.PetClinic.Model.Services.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long>{
	
	@Override
	public Owner save(Owner object) {
		super.save(object.getId(),object);
		return object;
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

	@Override
	public Set<Owner>findAll()
	{
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id)
	{
		return super.findById(id);
	}
	
	@Override
	public void delete(Owner object)
	{
		super.delete(object);
	}

	
	
	

}
