package com.spring.bankapplication.service;

import java.util.List;

import com.spring.bankapplication.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	HibernateTemplate hiber;


	@Override
	public List<Account> getAllAccounts() {
		return hiber.loadAll(Account.class);
	}
	
	
}
