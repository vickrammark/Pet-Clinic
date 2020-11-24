package com.Project.PetClinic.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Project.PetClinic.PetClinic.Model.Services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listVets(Model modal)
	{
		modal.addAttribute("vets",vetService.findAll());
		System.out.println(vetService.findAll());
		return "Vets/index";
	}

}
