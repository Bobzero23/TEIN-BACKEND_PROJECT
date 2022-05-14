package com.example.TeinProject.repository;

import com.example.TeinProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEmployee extends JpaRepository<Employee, Long> {

    Employee getEmployeeByNameAndPassword(String name, String password);

}