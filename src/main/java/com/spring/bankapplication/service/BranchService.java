package com.spring.bankapplication.service;

import com.spring.bankapplication.entity.Branch;

import java.util.List;


public interface BranchService {

	List<Branch> getAllBranches();
	Branch getBranchById(int id);
	void saveBranch(Branch branch);
	void deleteBranchById(int id);
}
