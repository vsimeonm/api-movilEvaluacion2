package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.service.AutorService;
import com.redsocial.service.PaisService;
import com.redsocialentity.Autor;
import com.redsocialentity.Pais;


@RestController
@RequestMapping("/api/colegio/autor")

public class AutorController {

	@Autowired
	private AutorService service;
	
	@GetMapping
	public ResponseEntity<List<Autor>> lista(){
		return ResponseEntity.ok(service.listaAutor());
	}
	
	@PostMapping
	public ResponseEntity<Autor> insertaAutor(@RequestBody Autor objA){
		return ResponseEntity.ok(service.insertaAutor(objA));
	}
}

