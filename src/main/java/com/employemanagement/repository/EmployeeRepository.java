package com.employemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.employemanagement.persistence.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
