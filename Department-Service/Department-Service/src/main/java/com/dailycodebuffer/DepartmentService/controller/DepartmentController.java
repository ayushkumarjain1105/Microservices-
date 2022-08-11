package com.dailycodebuffer.DepartmentService.controller;

import com.dailycodebuffer.DepartmentService.entity.Department;
import com.dailycodebuffer.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside Save Department of Department Service");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findByDepartmentId (@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method of Department Controller");
        return departmentService.findByDepartmentId(departmentId);
    }
    @GetMapping("/")
    public List<Department> findAllDepartment(){return departmentService.findAllDepartment();}
}
