package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Produto;
import com.example.demo.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> findAll(){
		
		return repository.findAll();
	}
	
	public Optional<Produto> findById(Long id) {
		return repository.findById(id);
	}
	
	public Produto save(Produto produto) {
		return repository.save(produto);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
