package com.spring.bankapplication.controller;

import java.util.ArrayList;
import java.util.List;

import com.spring.bankapplication.entity.Account;
import com.spring.bankapplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	AccountService accService;
	
	@GetMapping
	public ModelAndView getAllAccounts(Model m) {
		
		List<Account> accList= new ArrayList<Account>();
		
		try {
			accList = accService.getAllAccounts();
			m.addAttribute("account",accList);	
			
		} catch (Exception e) {
		}
		
		return new ModelAndView("accountDetails");
	}
}
