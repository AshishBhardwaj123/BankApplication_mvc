package com.spring.bankapplication.controller;

import java.util.ArrayList;
import java.util.List;

import com.spring.bankapplication.entity.Bank;
import com.spring.bankapplication.service.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	
	@GetMapping("/allbanks")
	public ModelAndView getAllBanks(Model m) {
		
		List<Bank> bankList= new ArrayList<Bank>();
		
		try {
			bankList = bankService.getAllBanks();
			m.addAttribute("bank",bankList);	
			
		} catch (Exception e) {
		}
		
		return new ModelAndView("bankDetails");
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView deleteBank(@PathVariable("id") int id, HttpServletRequest request) {
		this.bankService.deleteBank(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/bank/allbanks");
		//model.addAttribute("msg","Bank Added Successfully");
		return redirectView;
	}
	
	@GetMapping("/add")
	public ModelAndView addBank(Model model) {
		
		model.addAttribute("bank", new Bank());
		return new ModelAndView("saveBank");
	}

	@PostMapping("/savebank")
	public RedirectView saveBank(@ModelAttribute("bank") Bank bank, HttpServletRequest request) {
		//try {
			bankService.saveBank(bank);

		//} catch (Exception e) {
		//	e.printStackTrace();
		//}
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/bank/allbanks");
		//model.addAttribute("msg","Bank Added Successfully");
		return redirectView;
	}
	
	@GetMapping("/{id}")
	public String updateCourse(@PathVariable("id") int id,Model m) {
		
		Bank bank=bankService.getBankById(id);
		m.addAttribute("bank", bank);
		return "updateBank";
	}

	@PostMapping("/updatebank")
	public String updateBank(@ModelAttribute("bank") Bank bank) {

		try {
			bankService.saveBank(bank);
		} catch (Exception e) {
		}
		return "redirect:/bank/allbanks";
	}

	/*@GetMapping("/search")
	public ModelAndView search(@RequestParam String name, Model m) {
		Optional<Bank> result = bankService.getBankByName(name);
//		ModelAndView mav = new ModelAndView("search");
		//mav.addA("bank", result);
		List<Bank> bankList = new ArrayList<>();
		bankList.add(result.get());
		m.addAttribute("bank",bankList);	
		return new ModelAndView("bankDetails");		
	}	*/
}
