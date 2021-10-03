package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Produto;
import com.example.demo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> listar(){
		return new ResponseEntity<List<Produto>>(service.findAll(),HttpStatus.OK);
	}
	@GetMapping("produto/{id}")
	public ResponseEntity<Produto> getCategoriaById(@PathVariable Long id){
		return new ResponseEntity<Produto>(service.findById(id).get(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Produto> salvar(@RequestBody Produto produto ){
		return new ResponseEntity<Produto>(service.save(produto), HttpStatus.CREATED);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping
	public ResponseEntity<Produto> update(@RequestBody Produto produto){
		return new ResponseEntity<Produto>(service.save(produto), HttpStatus.CREATED);
	}
	
	
}






