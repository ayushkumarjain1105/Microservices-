package com.dailycodebuffer.UserService.service;

import com.dailycodebuffer.UserService.entity.User;
import com.dailycodebuffer.UserService.repository.UserRepository;
import com.dailycodebuffer.UserService.vo.Department;
import com.dailycodebuffer.UserService.vo.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVo findUserWithDepartment(Long userId) {
        log.info("Inside findUserWithDepartment");
        ResponseTemplateVo vo = new ResponseTemplateVo();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://Department-Service/department/"+user.getDepartmentId(),Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;

    }


}
