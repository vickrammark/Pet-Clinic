package com.Project.PetClinic.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Project.PetClinic.PetClinic.Model.Services.OwnerService;

@Controller
public class OwnerController {

	private final OwnerService ownerService;
	
	
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}



	@RequestMapping({"owners","owners/index","owners/index.html"})
	public String listOwners(Model model) {
		System.out.print(ownerService.findAll());
		model.addAttribute("owners",ownerService.findAll());
		return "Owners/index";
	}
}
