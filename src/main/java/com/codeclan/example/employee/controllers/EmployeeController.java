package com.codeclan.example.employee.controllers;

import com.codeclan.example.employee.models.Employee;
import com.codeclan.example.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    //INDEX
    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
