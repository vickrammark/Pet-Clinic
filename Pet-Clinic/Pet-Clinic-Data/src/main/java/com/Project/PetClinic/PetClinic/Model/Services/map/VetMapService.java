package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.Vet;
import com.Project.PetClinic.PetClinic.Model.Services.CrudService;


public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet,Long>{

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return null;
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
