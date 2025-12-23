package app.service;

import app.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

        private static List<User> users = new ArrayList<>();

        static void register (int id, int age, String name, String email) {
                User user = new User(id, age, name, email);
                users.add(user);
        }
        
        static void delete (int id) {
                users.removeIf(user -> user.getId() == id);
        }

        static User search (int id){
                for (User user : users) {
                        if (id == user.getId()) {
                                return user;
                        }
                }
                return null;
        }

        static void update (int id, int age, String name, String email) {
                for (User user : users) {
                        if (id == user.getId()) {
                                user.setAge(age);
                                user.setEmail(email);
                                user.setName(name);
                        }
                }
        }

        static void printUsers () {
                for (User user : users) {
                        System.out.println("User ID: " + user.getId());
                        System.out.println("User AGE: " + user.getAge());
                        System.out.println("User NAME: " + user.getName());
                        System.out.println("User EMAIL: " + user.getEmail());
                }
        }
}