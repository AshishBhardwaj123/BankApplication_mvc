package com.spring.bankapplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bank_id")
	private int id;
	
	@Column(name="bank_name")
	private String name;
	
	@Column(name="bank_address")
	private String address;
	
	public Bank() {
		
	}

}
