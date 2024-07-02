package com.spring.bankapplication.service;

import java.util.List;

import com.spring.bankapplication.entity.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BankServiceImpl implements BankService{

	@Autowired
	HibernateTemplate hiber;

	@Override
	public List<Bank> getAllBanks() {
		
//		List<Bank> newList= new ArrayList<Bank>();
//		Bank b1= new Bank();
//		Bank b2= new Bank();
//		Bank b3= new Bank();
//		
//		b1.setName("HDFC");
//		b1.setId(1);
//		b1.setAddress("Nagpur");
//		
//		b2.setName("IndudInd");
//		b2.setId(2);
//		b2.setAddress("Delhi");
//		
//		b3.setName("BOM");
//		b3.setId(3);
//		b3.setAddress("Mumbai");
//		
//		newList.add(b1);
//		newList.add(b2);
//		newList.add(b3);
		return hiber.loadAll(Bank.class);
	}

	@Override
	public int deleteBank(int id) {
		Bank b = hiber.get(Bank.class,id);
        assert b != null;
        hiber.delete(b);
		return 0;
		
	}

	@Override
	public void saveBank(Bank bank) {
		 this.hiber.saveOrUpdate(bank);
	}

	@Override
	public Bank getBankById(int id) {
		
		return hiber.get(Bank.class, id);
	}

	//@Override
	//public Optional<Bank> getBankByName(String name) {
	//	return bankRepo.findByName(name);
	//}


}
