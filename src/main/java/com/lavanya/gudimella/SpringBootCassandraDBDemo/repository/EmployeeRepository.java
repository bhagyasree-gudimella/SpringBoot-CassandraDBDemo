package com.lavanya.gudimella.SpringBootCassandraDBDemo.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import com.lavanya.gudimella.SpringBootCassandraDBDemo.model.Employee;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {

}
