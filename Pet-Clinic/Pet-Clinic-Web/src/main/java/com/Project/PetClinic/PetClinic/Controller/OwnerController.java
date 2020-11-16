package com.Project.PetClinic.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners() {
		
		return "Owners/index";
	}
}
