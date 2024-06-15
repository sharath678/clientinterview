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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Guest")
public class GuestController {

	@Autowired
	private GuestRepo cr;
	@PostMapping("/addd")
	public <S extends Guest> S save(@RequestBody S entity) {
		return cr.save(entity);
	}

	@GetMapping("/add/sort")
	public List<Guest> findAll(Sort sort) {
		return cr.findAll(sort);
	}

	@GetMapping("/add/page")
	public Page<Guest> findAll(Pageable pageable) {
		return cr.findAll(pageable);
	}

	@GetMapping("/add")
	public List<Guest> findAll() {
		return cr.findAll();
	}

	@GetMapping("/addd/{id}")
	public Optional<Guest> findById(@PathVariable Integer id) {
		return cr.findById(id);
	}

	@DeleteMapping("/add/{id}")
	public void deleteById(@PathVariable Integer id) {
		cr.deleteById(id);
	}
	
	@GetMapping("/add/{id}")
	public Guest updateById(@PathVariable Integer id,@RequestBody Guest c) {
		return cr.save(c);
	}
}
