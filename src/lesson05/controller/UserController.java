package lesson05.controller;

import java.util.List;

import lesson05.model.User;
import lesson05.service.UserService;
import lesson05.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, int age) {
        userService.saveUser(new User(name, age));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }
}
