package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Categoria;
import com.example.demo.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> findAll(){
		
		return repository.findAll();
	}
	
	public Optional<Categoria> findById(Long id) {
		return repository.findById(id);
	}
	
	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
}
