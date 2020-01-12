package com.training.demoorganisation.service;

import com.training.demoorganisation.entity.Department;
import com.training.demoorganisation.entity.Employee;

public interface DepartmentService {
    Department add(Department department);
    Iterable<Department> findAll();
}
