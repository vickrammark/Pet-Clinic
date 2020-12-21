package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.Project.PetClinic.PetClinic.Model.Speciality;
import com.Project.PetClinic.PetClinic.Model.Speciality;
import com.Project.PetClinic.PetClinic.Model.Services.SpecialitiesService;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService{
	
	@Override
	public Set<Speciality> findAll()
	{
		return super.findAll();
	}
	
	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Speciality object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}


}
