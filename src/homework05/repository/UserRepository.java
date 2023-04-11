package homework05.repository;

import homework05.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    static private List<User> userList = new ArrayList<>();

    static public void saveUser(User user) {
        userList.add(user);
    }

    static public void removeUser(User user) {
        System.out.println("remove user");
        userList.remove(user);
    }

    static public void updateUser(int index, User user) {
        userList.set(index, user);
    }

    static public List<User> getUserList() {
        return userList;
    }

    static public void payment(int index, int amount) {
        userList.get(index).payment(amount);
    }

    static public int withdrawal(int index, int amount) {
        return userList.get(index).withdrawal(amount);
    }

    static public int getBalance(int index) {
        return userList.get(index).getBalance();
    }
}
