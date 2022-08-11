package com.dailycodebuffer.UserService.repository;

import com.dailycodebuffer.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
   public  User findByUserId(Long userId);
}
