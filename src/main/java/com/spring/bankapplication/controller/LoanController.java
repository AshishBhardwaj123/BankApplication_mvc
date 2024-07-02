package com.spring.bankapplication.controller;

import java.util.ArrayList;
import java.util.List;

import com.spring.bankapplication.entity.Loan;
import com.spring.bankapplication.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/loans")
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@GetMapping
	public ModelAndView getAllLoans(Model m) {
		
		List<Loan> loanList= new ArrayList<Loan>();
		
		try {
			loanList = loanService.getAllLoans();
			m.addAttribute("loan",loanList);	
		} catch (Exception e) {
		}
		
		return new ModelAndView("loanDetails");
	}

}
