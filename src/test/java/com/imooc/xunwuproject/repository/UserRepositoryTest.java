package com.imooc.xunwuproject.repository;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.imooc.xunwuproject.ApplicationTests;
import com.imooc.xunwuproject.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRepositoryTest extends ApplicationTests {
  @Autowired
  private UserRepository userRepository;

  @Test
  public void testFindOne() {
    if (userRepository.findById(1L).isPresent()) {

      User user = userRepository.findById(1L).get();
      assertEquals("wali", user.getName());
    }
  }
}