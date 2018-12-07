package ru.springbootsecuritythymeleaf.service.abstraction.user;

import ru.springbootsecuritythymeleaf.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

     User getUserById(long id);

    void editUser(User user);

 User getUserByLogin(String login);

     List<User> getAllUsers();

     void deleteUser(long id);


}
