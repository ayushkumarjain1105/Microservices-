package com.dailycodebuffer.DepartmentService.service;

import com.dailycodebuffer.DepartmentService.entity.Department;
import com.dailycodebuffer.DepartmentService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside save Department of Department Service");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findByDepartmentId of Department Service");
        return  departmentRepository.findByDepartmentId(departmentId);
    }

    public List<Department> findAllDepartment() {
        return departmentRepository.findAll();
    }
}
