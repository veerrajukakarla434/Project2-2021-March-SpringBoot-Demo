package com.march.batch.springboot.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	@GetMapping("/employee")
	public ResponseEntity<Object> getEmployeeDetails() {

		ResponseEntity<Object> response = null;

		Employee employee = new Employee();
		employee.setEmpId("100");
		employee.setName("Veera");
		employee.setAddr("Hyderabad");
		employee.setPhone("98966554046");

		response = new ResponseEntity<Object>(employee, HttpStatus.OK);

		return response;
	}
	
	

}
