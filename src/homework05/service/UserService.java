package homework05.service;

import java.util.List;

import homework05.model.User;

public interface UserService {
     void saveUser(User user);

     void removeUser(User user);

     void updateUser(int index, User user);

     List<User> getUserList();
}
