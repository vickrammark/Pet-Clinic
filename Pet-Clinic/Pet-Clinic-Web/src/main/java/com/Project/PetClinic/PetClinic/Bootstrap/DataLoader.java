package com.Project.PetClinic.PetClinic.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Project.PetClinic.PetClinic.Model.Owner;
import com.Project.PetClinic.PetClinic.Model.Vet;
import com.Project.PetClinic.PetClinic.Model.Services.OwnerService;
import com.Project.PetClinic.PetClinic.Model.Services.VetService;
import com.Project.PetClinic.PetClinic.Model.Services.map.OwnerMapService;
import com.Project.PetClinic.PetClinic.Model.Services.map.VetMapService;

@Component
public class DataLoader  implements CommandLineRunner{

	private final OwnerService ownerService; 
	
	private final VetService vetService; 
	
	public DataLoader() {
	
		ownerService=new OwnerMapService();
		vetService=new VetMapService();
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Owner owner=new Owner();
		owner.setId(1L);
		owner.setFirstname("Vickram");
		owner.setLastname("Santhosh");
		
		ownerService.save(owner);
		
		Owner owner1=new Owner();
		owner1.setId(2L);
		owner1.setFirstname("Amirta");
		owner1.setLastname("Sumathi");

		ownerService.save(owner1);

		Owner owner2=new Owner();
		owner2.setId(3L);
		owner2.setFirstname("Thangavel");
		owner2.setLastname("Sankar");

		ownerService.save(owner2);

		Vet vet=new Vet();
		
		vet.setId(1L);
		vet.setFirstname("Andy");
		vet.setLastname("max");
		
		vetService.save(vet);

		Vet vet1=new Vet();
		
		vet1.setId(1L);
		vet1.setFirstname("David");
		vet1.setLastname("max");
		
		vetService.save(vet1);
     
		Vet vet2=new Vet();
		
		vet2.setId(1L);
		vet2.setFirstname("Santy");
		vet2.setLastname("max");
		
		vetService.save(vet2);

	}

}
