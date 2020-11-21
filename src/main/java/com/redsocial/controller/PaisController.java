package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.service.PaisService;
import com.redsocialentity.Pais;


@RestController
@RequestMapping("/api/colegio/pais")

public class PaisController {

	@Autowired
	private PaisService service;
	
	@GetMapping
	public ResponseEntity<List<Pais>> lista(){
		return ResponseEntity.ok(service.listaPais());
	}
}
