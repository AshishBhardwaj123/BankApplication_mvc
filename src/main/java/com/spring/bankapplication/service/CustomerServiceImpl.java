package com.spring.bankapplication.service;

import java.util.List;

import com.spring.bankapplication.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	HibernateTemplate hiber;

	@Override
	public List<Customer> getAllCustomers() {
		return hiber.loadAll(Customer.class);
	}
	
	
}
