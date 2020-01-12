package com.training.demoorganisation.service.impl;

import com.training.demoorganisation.entity.Employee;
import com.training.demoorganisation.repository.EmployeeRepository;
import com.training.demoorganisation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
