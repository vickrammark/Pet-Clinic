package com.Project.PetClinic.PetClinic.Bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Project.PetClinic.PetClinic.Model.Owner;
import com.Project.PetClinic.PetClinic.Model.Pet;
import com.Project.PetClinic.PetClinic.Model.PetType;
import com.Project.PetClinic.PetClinic.Model.Vet;
import com.Project.PetClinic.PetClinic.Model.Services.OwnerService;
import com.Project.PetClinic.PetClinic.Model.Services.PetTypeService;
import com.Project.PetClinic.PetClinic.Model.Services.VetService;

@Component
public class DataLoader  implements CommandLineRunner{

	private final OwnerService ownerService; 
	
	private final VetService vetService; 
	
	private final PetTypeService petTypeService;
	
	public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		PetType dog=new PetType();
		dog.setName("Dog");
		PetType savedDogPetType=petTypeService.save(dog);
		
		PetType cat=new PetType();
		cat.setName("cat");
		PetType savedCatType=petTypeService.save(cat);
		
		Owner owner=new Owner();
		owner.setFirstname("Vickram");
		owner.setLastname("Santhosh");
		owner.setAddress("123 Brickets");
		owner.setCity("Dindugul");
		owner.setTelephone("9080955701"); 
		ownerService.save(owner);
		
		Pet mikesPet=new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner);
		mikesPet.setName("");
		mikesPet.setBirthdate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner.getPets().add(mikesPet);
		
		System.out.println("Owner ==>"+owner);
		Owner owner1=new Owner();
		owner1.setFirstname("Amirta");
		owner1.setLastname("Sumathi");
		owner1.setAddress("123 Brickets");
		owner1.setCity("Miami");
		owner1.setTelephone("9788930840");
		ownerService.save(owner1);
		
		Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner1);
        fionasCat.setBirthdate(LocalDate.now());
        fionasCat.setPetType(savedCatType);
        owner1.getPets().add(fionasCat);


		Vet vet=new Vet();
		vet.setFirstname("Andy");
		vet.setLastname("max");
		
		vetService.save(vet);

		Vet vet1=new Vet();
		vet1.setFirstname("David");
		vet1.setLastname("max");
		
		vetService.save(vet1);
     
		Vet vet2=new Vet();
		vet2.setFirstname("Santy");
		vet2.setLastname("max");
		
		vetService.save(vet2);

	}

}
