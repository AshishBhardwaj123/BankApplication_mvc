package com.spring.bankapplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cust_id")
	private int id;
	
	@Column(name="cust_name")
	private String name;
	
	@Column(name="cust_phone")
	private long phone;
	
	@Column(name = "cust_address")
	private String address;
	
	@Column(name = "loan_id")
	private int loanId;
	
	@Column(name = "acc_id")
	private int accId;
	
	public Customer() {
		
	}
	
}
