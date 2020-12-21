package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.Project.PetClinic.PetClinic.Model.PetType;
import com.Project.PetClinic.PetClinic.Model.Services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

	@Override
	public Set<PetType> findAll()
	{
		return super.findAll();
	}
	
	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}

	
}
