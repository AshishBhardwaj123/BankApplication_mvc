package com.spring.bankapplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="acc_id")
	private int id;
	
	@Column(name="acc_type")
	private String type;
	
	@Column(name="acc_bal")
	private String balance;
	
	@Column(name="branch_id")
	private int branchId;
	
	@Column(name="cust_id")
	private int customerId;
	
	public Account() {
		
	}


}
