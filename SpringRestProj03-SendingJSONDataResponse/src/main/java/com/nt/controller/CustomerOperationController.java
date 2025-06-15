package com.nt.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;
import com.nt.model.Company;




@RestController
@RequestMapping("/customer-api")
public class CustomerOperationController {
	
	@GetMapping("/report2")
	public ResponseEntity<List<Customer>> showReport2(){
		
		Customer cust1=new Customer(1001,"raja","hyd",90.0f);
		Customer cust2=new Customer(1002,"mahesh","vizag",90.0f);
		Customer cust3=new Customer(1003,"ramana","blore",90.0f);
		System.out.println("kunal ...");
		System.out.println("new update  ...");
		return new ResponseEntity<List<Customer>>(List.of(cust1,cust2,cust3),HttpStatus.OK);
	}
	
	
	
	
	

}
	