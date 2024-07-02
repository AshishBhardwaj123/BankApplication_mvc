package com.spring.bankapplication.controller;

import java.util.ArrayList;
import java.util.List;

import com.spring.bankapplication.entity.Branch;
import com.spring.bankapplication.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/branches")
public class BranchController {
	
	@Autowired
	BranchService branchService;
	
	@GetMapping
	public ModelAndView getAllBranches(Model m) {
		
		List<Branch> branch= new ArrayList<Branch>();
		
		try {
			branch = branchService.getAllBranches();
			m.addAttribute("branches",branch);
			
		} catch (Exception e) {
            throw new RuntimeException(e);
        }
		
		return new ModelAndView("branchDetails");
	}

	@GetMapping("/showaddbranch")
	public String showFormForAdd(Model model) {
		Branch branch = new Branch();
		model.addAttribute("branch", branch);
		return "addBranch";
	}

	@GetMapping("/updatebranch")
	public String showFormForUpdate(@RequestParam("branchId") int id, Model model) {
		Branch branch = branchService.getBranchById(id);
		model.addAttribute("branch", branch);
		return "addBranch";
	}

	@PostMapping("/save")
	public String saveBranch(@ModelAttribute("branch") Branch branch) {
		branchService.saveBranch(branch);
		return "redirect:/branches";
	}

	@RequestMapping("/delete")
	public String deleteBranch(@RequestParam("branchId") int id) {
		branchService.deleteBranchById(id);
		return "redirect:/branches";
	}

}
