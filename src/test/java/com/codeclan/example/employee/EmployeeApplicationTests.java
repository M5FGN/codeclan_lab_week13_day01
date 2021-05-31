package com.codeclan.example.employee;

import com.codeclan.example.employee.models.Employee;
import com.codeclan.example.employee.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee mary = new Employee("EMPL01", "Mary", 40, "mary@me.com");
		employeeRepository.save(mary);
	}
}
