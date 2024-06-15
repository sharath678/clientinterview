package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClerkController {

	@Autowired
	private ClerkRepo cr;

	@PostMapping("/addd")
	public <S extends Clerk> S save(@RequestBody S entity) {
		return cr.save(entity);
	}

	@GetMapping("/add/sort")
	public List<Clerk> findAll(Sort sort) {
		return cr.findAll(sort);
	}

	@GetMapping("/add/page")
	public Page<Clerk> findAll(Pageable pageable) {
		return cr.findAll(pageable);
	}

	@GetMapping("/add")
	public List<Clerk> findAll() {
		return cr.findAll();
	}

	@GetMapping("/addd/{id}")
	public Optional<Clerk> findById(@PathVariable Integer id) {
		return cr.findById(id);
	}

	@DeleteMapping("/add/{id}")
	public void deleteById(@PathVariable Integer id) {
		cr.deleteById(id);
	}
	
	@GetMapping("/add/{id}")
	public Clerk updateById(@PathVariable Integer id,@RequestBody Clerk c) {
		return cr.save(c);
	}
	
	
	
	
}
