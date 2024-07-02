package com.spring.bankapplication.service;

import java.util.List;
import java.util.Optional;

import com.spring.bankapplication.entity.Bank;
import com.spring.bankapplication.entity.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BranchServiceImpl implements BranchService{

	@Autowired
	HibernateTemplate hiber;

	@Autowired
	BankService bankService;

	@Override
	public List<Branch> getAllBranches() {
		return hiber.loadAll(Branch.class);
	}

	@Override
	public Branch getBranchById(int id) {
        return hiber.get(Branch.class,id);
	}

	@Override
	public void saveBranch(Branch branch) {
		//Bank b = bankService.getBankById(branch);
		hiber.saveOrUpdate(branch);
	}

	@Override
	public void deleteBranchById(int id) {
		Branch b= hiber.get(Branch.class,id);
        assert b != null;
        hiber.delete(b);
	}


}
