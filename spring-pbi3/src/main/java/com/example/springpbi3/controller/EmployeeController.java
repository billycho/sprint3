package com.example.springpbi3.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springpbi3.model.Employee;
import com.example.springpbi3.repository.EmployeeJpaRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired 
	private EmployeeJpaRepository employeeJpaRepository;
	
	@GetMapping(value = "/all") 
	public List<Employee> sortByName(){
		return employeeJpaRepository.sortByName();
	}
	
	public Employee findByFirstname (String firstname){
		return null;
	}
	
	@GetMapping(value ="/{id}")
	public Employee findById(@PathVariable(value="id") Integer id) {
		return employeeJpaRepository.findById(id);
	}
	
	@GetMapping(value = "/{id}/score")
	@ResponseBody
	public Integer getScore(@PathVariable(value="id") Integer id) {
		if (findById(id)!=null) {
			Random rand = new Random();
			return (Integer)rand.nextInt(100) + 1;
		}
		else {
			return null;
		}
		//return employeeJpaRepository.getScore(id);
	}
	
	@PostMapping(value = "/load") 
	public Employee load(@RequestBody final Employee employee){
		employeeJpaRepository.save(employee);
		return employeeJpaRepository.findByFirstname(employee.getFirstname());
	}
}
