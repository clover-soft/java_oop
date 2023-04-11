package lesson05.service;

import java.util.List;

import lesson05.model.User;
import lesson05.repository.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();

    @Override
    public void saveUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }

        userRepository.saveUser(user);

    }

    @Override
    public void removeUser(User user) {
        if (user != null) {
            userRepository.removeUser(user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public void updateUser(int index, User user) {
        if (user != null) {
            userRepository.updateUser(index, user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public List<User> getUserList() {
        return userRepository.getUserList();
    }
}
