package com.spring.bankapplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private int id;

    @Column(name = "loan_type")
    private String type;

    @Column(name = "loan_amt")
    private long amount;

    @Column(name="branch_id")
    private int branchId;
    
    @Column(name="cust_id")
	private int customerId;
	
    public Loan() {
    	
    }
}
