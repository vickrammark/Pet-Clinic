package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.Project.PetClinic.PetClinic.Model.Owner;
import com.Project.PetClinic.PetClinic.Model.Pet;
import com.Project.PetClinic.PetClinic.Model.Services.OwnerService;
import com.Project.PetClinic.PetClinic.Model.Services.PetService;
import com.Project.PetClinic.PetClinic.Model.Services.PetTypeService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{
	
	private final PetTypeService petTypeService;
	private final PetService petService;
	
	
	
	public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner save(Owner object) {
		
		if(object!=null)
		{
			if(object.getPets()!=null)
			{
				 object.getPets().forEach(pet->{
				if(pet.getPetType()!=null)
				{
					if(pet.getPetType().getId()==null)
					{
						pet.setPetType(petTypeService.save(pet.getPetType()));
					}
				}
				else
				{
					throw new RuntimeException("Pet Type is required");
				}
				if(pet.getId()==null)
				{
					Pet savedPet=petService.save(pet);
					pet.setId(savedPet.getId());
				}
			}); 
			}
		super.save(object);
		return object;
		}
		else
		{
			return null;
		}
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
