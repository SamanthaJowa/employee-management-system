package com.jowa.employeemanagementsystem.repository;

import com.jowa.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
