package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.repository.AutorRepository;
import com.redsocialentity.Autor;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository repository;
	
	@Override
	public List<Autor> listaAutor(){
		return repository.findAll();
	}
	
	@Override
	public Autor insertaAutor(Autor objA) {
		return repository.save(objA);
	}
}
