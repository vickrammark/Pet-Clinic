package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.Project.PetClinic.PetClinic.Model.Owner;
import com.Project.PetClinic.PetClinic.Model.Services.OwnerService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{
	
	@Override
	public Owner save(Owner object) {
		super.save(object);
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

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
