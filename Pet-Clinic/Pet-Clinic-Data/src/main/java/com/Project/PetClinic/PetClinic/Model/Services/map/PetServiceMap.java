package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.Project.PetClinic.PetClinic.Model.Pet;
import com.Project.PetClinic.PetClinic.Model.Services.CrudService;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long>{

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}
	
	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id)
	{
		return super.findById(id);
	}
	
	@Override 
	public void delete(Pet object)
	{
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}

}
