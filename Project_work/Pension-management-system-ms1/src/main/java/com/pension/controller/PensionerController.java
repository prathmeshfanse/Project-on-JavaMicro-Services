package com.pension.controller;

import java.util.List;



import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pension.entity.Bank;
import com.pension.entity.Pensioner;
import com.pension.repo.IPensionerRepository;
import com.pension.sevice.IPensionerService;
import com.pension.sevice.IPensionerServiceImpl;

@RestController
@RequestMapping("/pensioner")
public class PensionerController {
//	@Autowired
//	RestTemplate restTemplate;
	
	@Autowired
	IPensionerRepository iPensionerRepository;
	
	@Autowired
	IPensionerServiceImpl iPensionerServiceImpl;
	
	@PostMapping("/add")
	public ResponseEntity<?> createPensioner(@RequestBody Pensioner pensioner)
	{
		ResponseEntity<?> pension = iPensionerServiceImpl.saveall(pensioner);
				return ResponseEntity.ok(pensioner);

	}
	
	@GetMapping("/{addharNo}")
	public ResponseEntity<?> getPensioner(@PathVariable("addharNo") Long addharNo){
				
	      ResponseEntity<?> pensioner = iPensionerServiceImpl.getByAadhar(addharNo);

	      //  List<Bank> bank = restTemplate.getForObject("http://localhost:9091/bank/pensioner/"+ addharNo, List.class);
//	        employee.setRecords(records);
	       return this.iPensionerServiceImpl.getByAadhar(addharNo);
		
		
	}
}
