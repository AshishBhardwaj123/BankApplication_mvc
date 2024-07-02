package com.spring.bankapplication.service;

import java.util.List;

import com.spring.bankapplication.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class LoanServiceImpl implements LoanService{

	@Autowired
	HibernateTemplate hiber;

	@Override
	public List<Loan> getAllLoans() {
		return hiber.loadAll(Loan.class);
	}
	
	
}
