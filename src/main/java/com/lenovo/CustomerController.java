package com.lenovo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("/")
	public String showForm(Model theModel) {

		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processFrom")
	public String procesFrom(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {

		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}

		return "customer-confirmation";
	}

	// removing white Spaces
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor); 
	}

}
