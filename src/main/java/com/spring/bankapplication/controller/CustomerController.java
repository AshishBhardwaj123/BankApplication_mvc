package com.spring.bankapplication.controller;

import java.util.ArrayList;
import java.util.List;

import com.spring.bankapplication.entity.Customer;
import com.spring.bankapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public ModelAndView getAllCustomers(Model m) {
		
		List<Customer> custList= new ArrayList<Customer>();
		
		try {
			custList = customerService.getAllCustomers();
			m.addAttribute("customer",custList);	
		} catch (Exception e) {
		}
		
		return new ModelAndView("customerDetails");
	}
}
