package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.Project.PetClinic.PetClinic.Model.Vet;
import com.Project.PetClinic.PetClinic.Model.Services.VetService;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		 super.save(object);
		 return object;
	}
	
	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id)
	{
		return super.findById(id);
	}
	
	@Override 
	public void delete(Vet object)
	{
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}

}
