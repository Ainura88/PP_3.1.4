package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    boolean addUser(User user);

    User getById(Long id);

    boolean updateUser(User user);

    boolean deleteUser(Long id);

    List<User> getUsers();

    User getUserByUsername(String username);

}
