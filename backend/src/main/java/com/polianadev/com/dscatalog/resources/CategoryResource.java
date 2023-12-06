package com.polianadev.com.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polianadev.com.dscatalog.entities.Category;

@RestController//Indica que a classe é um controlador rest
@RequestMapping(value = "/categories")//Aqui dentro vai o nome da rota
public class CategoryResource {
//O resource implementa o controlador rest
//ResponseEntity é um objeto do spring que encapsula uma resposta http	
//findAll,busca todas as categorias	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category>list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2l,"Electonics"));
		return ResponseEntity.ok().body(list);
	}

}
