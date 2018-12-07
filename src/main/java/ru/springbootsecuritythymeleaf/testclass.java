package ru.springbootsecuritythymeleaf;


import ru.springbootsecuritythymeleaf.model.User;
import ru.springbootsecuritythymeleaf.service.abstraction.user.UserService;
import ru.springbootsecuritythymeleaf.service.impl.user.UserServiceImpl;

import java.util.List;

public class testclass {
    public static void main(String[] args) throws  IllegalAccessException, InstantiationException, ClassNotFoundException {
        UserService service = new UserServiceImpl();
        List<User> users = service.getAllUsers();
    }
}
