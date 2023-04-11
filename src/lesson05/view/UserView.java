package lesson05.view;

// Добавить операции удаления, изменения и вывода пользователей

import lesson05.controller.UserController;
import lesson05.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your data");
        userController.saveUser(scanner.nextLine(), scanner.nextInt());
        int i = 0;
        for (User user : userController.getUserList()) {
            System.out.printf("index: %d %s \n", i, user);
            i++;
        }
        System.out.println("enter index for remove:");
        i = scanner.nextInt();

        userController.removeUser(userController.getUserList().get(i));

        scanner.close();

    }
}
