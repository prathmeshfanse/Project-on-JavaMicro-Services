package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bamk.entity.Bank;
import com.bank.service.BankServiceImpl;

@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
	BankServiceImpl bankServiceImpl;
	
	
	@PostMapping("/add")
	public ResponseEntity<?> addBankDetails(@RequestBody Bank b){
		ResponseEntity<?> Bank = bankServiceImpl.savebank(b);
			return ResponseEntity.ok(Bank);
	}
	
	@GetMapping("/{aadharNo}")
	public ResponseEntity<?> getbank(@PathVariable("aadharNo") Long aadharNo){
		return this.bankServiceImpl.getBankofPensioner(aadharNo);
	}
	
	

}
