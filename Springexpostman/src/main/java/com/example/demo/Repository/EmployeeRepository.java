package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
   
}