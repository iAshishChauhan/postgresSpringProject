package com.training.demoorganisation.service.impl;

import com.training.demoorganisation.entity.Department;
import com.training.demoorganisation.repository.DepartmentRepository;
import com.training.demoorganisation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department add(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }
}
