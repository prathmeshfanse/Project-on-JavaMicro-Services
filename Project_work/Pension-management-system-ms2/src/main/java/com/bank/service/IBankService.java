package com.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.bamk.entity.Bank;

public interface IBankService {
	public ResponseEntity<?> savebank(Bank bank);
	public ResponseEntity<?> getBankofPensioner(Long aadharNo);
}
