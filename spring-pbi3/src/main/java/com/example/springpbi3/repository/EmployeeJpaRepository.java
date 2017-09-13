package com.example.springpbi3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.example.springpbi3.model.Employee;

@Component
public interface EmployeeJpaRepository extends 
		JpaRepository<Employee, Integer>
		//PagingAndSortingRepository<Employee,Integer>
		{ 
	
	Employee findByFirstname(String firstname);

	public final static String findIdQuery = "SELECT e FROM Employee e WHERE e.id IN (:id)";

	@Query(findIdQuery)
	public Employee findById(@Param("id") Integer id);
	
	public final static String sortIdQuery = "SELECT e FROM Employee e ORDER BY e.firstname ASC";
	
	@Query(sortIdQuery)
	public List<Employee> sortByName();

}