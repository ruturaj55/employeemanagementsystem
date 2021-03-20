package com.employemanagement.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.employemanagement.persistence.Employee;
import com.employemanagement.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@RequestMapping("/employees/{email}")
	public Optional<Employee> getEmployeeById(@PathVariable String email) {
		return employeeService.getEmployeeById(email);
	}

	@RequestMapping(method = RequestMethod.POST,value="/employees")
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}

	@RequestMapping(method = RequestMethod.PUT,value="/employee")
	public void updateEmplyee(@RequestBody Employee emp) {
		employeeService.updateEmplyee(emp);
	}

	@RequestMapping(method = RequestMethod.DELETE,value="/employees/{email}")
	public void deletEmployee(@PathVariable String email) {
		employeeService.deletEmployee(email);
	}

}
