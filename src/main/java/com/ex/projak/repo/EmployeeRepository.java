package com.ex.projak.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.projak.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}