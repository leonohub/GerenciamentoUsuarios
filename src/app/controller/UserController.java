package app.controller;

import java.util.Scanner;
import java.util.List;

import app.model.User;
import app.service.UserService;

public class UserController {

        public static void printUser(User user) {
                System.out.println("User ID: " + user.getId());
                System.out.println("User AGE: " + user.getAge());
                System.out.println("User NAME: " + user.getName());
                System.out.println("User EMAIL: " + user.getEmail());
        }

        public static void listConstroller(Scanner scanner) {

                List<User> users = UserService.listUsers();

                if (users.isEmpty()) {
                        System.out.println("No users");
                        return;
                }

                for (User user : users) {
                        printUser(user);
                }
        }

        public static void registerController(Scanner scanner) {
                System.out.println("Id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("Email: ");
                String email = scanner.nextLine();

                User user = new User(id, age, name, email);
                if (UserService.register(user)) {
                        System.out.println("User register");
                } else {
                        System.out.println("Error");
                }
        }

        public static void deleteController(Scanner scanner) {

                System.out.println("User Id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                if (UserService.delete(id)) {
                        System.out.println("User deleted");
                } else {
                        System.out.println("User not found");
                }
        }

        public static void updateController(Scanner scanner) {
                System.out.println("Id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("Email: ");
                String email = scanner.nextLine();

                if (UserService.update(id, age, name, email)) {
                        System.out.println("User Updated");
                } else {
                        System.out.println("User not found");
                }
        }

        public static void searchController(Scanner scanner) {
                System.out.println("Id: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                User user = UserService.search(id);

                if (user.equals(null)) {
                        System.out.println("Not founded User");
                }

                printUser(user);
        }
}