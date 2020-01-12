package com.training.demoorganisation.controller;

import com.training.demoorganisation.dto.DepartmentDTO;
import com.training.demoorganisation.entity.Department;
import com.training.demoorganisation.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addOrUpdate")
    public ResponseEntity<Integer> addOrUpdateDepartment(@RequestBody DepartmentDTO departmentDTO) {
        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO, department);
        Department departmentCreated = departmentService.add(department);

        return new ResponseEntity<Integer>(departmentCreated.getId(),HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<DepartmentDTO>> getAllEmployees() {
        Iterable<Department> departmentIterable = departmentService.findAll();
        List<DepartmentDTO> departmentDTOList = new ArrayList<>();

        for(Department department: departmentIterable) {
            DepartmentDTO departmentDTO = new DepartmentDTO();
            BeanUtils.copyProperties(department, departmentDTO);
            departmentDTOList.add(departmentDTO);
        }
        return new ResponseEntity<List<DepartmentDTO>>(departmentDTOList, HttpStatus.OK);
    }

    @GetMapping("/find/childDepartmentOf/{parentId}")
    public ResponseEntity<List<DepartmentDTO>> getAllChildDepatrments(@PathVariable("parentId") Integer parentId) {
        Iterable<Department> departmentIterable = departmentService.findAll();
        List<DepartmentDTO> departmentDTOList = new ArrayList<>();

        for(Department department: departmentIterable) {
            DepartmentDTO departmentDTO = new DepartmentDTO();
            BeanUtils.copyProperties(department, departmentDTO);
            if(department.getParentDepartment() == parentId) {
                departmentDTOList.add(departmentDTO);
            }
        }
        return new ResponseEntity<List<DepartmentDTO>>(departmentDTOList, HttpStatus.OK);
    }

    


}
