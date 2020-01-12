package com.training.demoorganisation.service;

import com.training.demoorganisation.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    Iterable<Employee> findAll();
}
