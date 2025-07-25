package com.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.staff.model.Staff;
import com.staff.repo.Staffrepo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class Staffctrl {

	@Autowired
	private Staffrepo repo;
	
	@GetMapping("/staff")
	public List<Staff> getstaff() {
		
		return repo.findAll();
	}
	
	@PostMapping("/savestaff")
	public Staff savestaff(@RequestBody Staff s) {
		//TODO: process POST request
		return repo.save(s);
	}
	
	  @PutMapping("/staff/{id}")
	    public Staff updatestaff(@PathVariable Integer id, @RequestBody Staff s) {
	        s.setId(id);
	        return repo.save(s);
	    }
	  
	  @DeleteMapping("/id")
	  public String  deletestudent(@PathVariable int id) {
		  
		  return "delete Staff"+id;
		  
	  }
	
	
}
