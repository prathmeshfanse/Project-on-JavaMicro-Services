package com.pension.sevice;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.pension.entity.Pensioner;

public interface IPensionerService {
	public ResponseEntity<?> saveall(Pensioner pensioner);
	
	ResponseEntity<?> getByAadhar(Long no);
	

}
