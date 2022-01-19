package com.lavanya.gudimella.SpringBootCassandraDBDemo.model;

import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.PrimaryKey; 

@Table("employee")
public class Employee {
	
	@PrimaryKey
	private Integer employee_id;
	private String employee_name;
	private String address;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(Integer employee_id, String employee_name, String address, int salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.address = address;
		this.salary = salary;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", address=" + address
				+ ", salary=" + salary + "]";
	}
}
