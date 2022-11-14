package com.ex.projak.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.projak.model.Employee;
import com.ex.projak.repo.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List < Employee > getAllEmployees() {
    	System.out.println("Getting all EMP list...");
        return employeeRepository.findAll();
    }


    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
    	System.out.println("Adding new EMP...");
        return employeeRepository.save(employee);
    }


}
