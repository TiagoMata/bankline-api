package com.dio.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;

@RestController
@RequestMapping ("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
	}
}
