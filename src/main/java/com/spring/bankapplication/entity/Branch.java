package com.spring.bankapplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="branch_id")
	private int id;
	
	@Column(name="branch_name")
	private String name;
	
	@Column(name="branch_address")
	private String address;
	
	@Column(name="bank_id")
	private String bankId;
	
	public Branch() {
		
	}
	
}
