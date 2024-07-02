package com.spring.bankapplication.service;

import com.spring.bankapplication.entity.Bank;

import java.util.List;

public interface BankService {

	List<Bank> getAllBanks();
	int deleteBank(int id);
	void saveBank(Bank bank);
    Bank getBankById(int id);
	//void updateBank(Bank bank);
    //Optional<Bank> getBankByName(String name);
}
