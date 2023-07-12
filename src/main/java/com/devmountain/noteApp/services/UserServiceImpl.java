package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.UserDto;
import com.devmountain.noteApp.entities.User;
import com.devmountain.noteApp.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Transactional
  public List<String> addUser(UserDto userDto) {

    List<String> response = new ArrayList<>();

    User user = new User(userDto);
    userRepository.saveAndFlush(user);
    response.add("User added successfully");

    return response;
  }

  public List<String> userLogin(UserDto userDto) {

    List<String> response = new ArrayList<>();


    return response;
  }
}
