package com.lavanya.gudimella.SpringBootCassandraDBDemo.service;

import java.util.List;   
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lavanya.gudimella.SpringBootCassandraDBDemo.model.Employee;
import com.lavanya.gudimella.SpringBootCassandraDBDemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.insert(employee);
	}

	@Override
	public Optional<Employee> getEmployee(int employee_id) {
		return employeeRepository.findById(employee_id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		Optional<Employee> employeeOptional = employeeRepository.findById(employee.getEmployee_id());
		if (employeeOptional.isPresent()) {
			employeeOptional.ifPresent(emp -> {
				emp.setAddress(employee.getAddress());
				emp.setSalary(employee.getSalary());
				employeeRepository.save(emp);
			});
		}
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

	@Override
	public void deleteEmployeeById(int employee_id) {
		employeeRepository.deleteById(employee_id);
	}
}
