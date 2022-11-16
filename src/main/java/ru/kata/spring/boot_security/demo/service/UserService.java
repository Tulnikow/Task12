package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void addUser(User user);

    void addRole(Role role);

    void updateUser(int id, User user);

    void removeUser(int id);

    User getUserById(int id);

    List<User> listUser();

    List<Role> listRole();
}
