package com.lavanya.gudimella.SpringBootCassandraDBDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lavanya.gudimella.SpringBootCassandraDBDemo.model.Employee;
import com.lavanya.gudimella.SpringBootCassandraDBDemo.service.EmployeeService;


@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(path = "/addEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

	@GetMapping(path = "/findEmployee/{employee_id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Employee> getEmployee(@PathVariable int employee_id) {
		return employeeService.getEmployee(employee_id);
	}

	@GetMapping(path = "/findEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@PutMapping(path = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}

	@DeleteMapping(path = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
	}

	@DeleteMapping(path = "/deleteEmployee/{employee_id}")
	public void deleteEmployeeById(@PathVariable int employee_id) {
		employeeService.deleteEmployeeById(employee_id);
	}
}
