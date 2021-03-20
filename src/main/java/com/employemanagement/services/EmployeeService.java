package com.employemanagement.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employemanagement.persistence.Employee;
import com.employemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		List<Employee> empList = new ArrayList<>();
		employeeRepository.findAll().forEach(empList::add);
		return empList;
	}

	public Optional<Employee> getEmployeeById(String email) {
		return employeeRepository.findById(email);
	}

	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}

	public void updateEmplyee(Employee emp) {
		employeeRepository.save(emp);
	}

	public void deletEmployee(String email) {
		employeeRepository.deleteById(email);
	}

}
