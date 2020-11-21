package com.redsocial.service;

import java.util.List;

import com.redsocialentity.Autor;

public interface AutorService {

	public abstract List<Autor> listaAutor();
	public abstract Autor insertaAutor(Autor objA);
}
