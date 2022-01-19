package com.lavanya.gudimella.SpringBootCassandraDBDemo.service; 

import java.util.List;
import java.util.Optional;
import com.lavanya.gudimella.SpringBootCassandraDBDemo.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	public Optional<Employee> getEmployee(int employee_id);

	public List<Employee> getAllEmployees();

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

	public void deleteEmployeeById(int employee_id);
}
