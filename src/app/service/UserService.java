package app.service;

import app.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
        
        static List<User> users = new ArrayList<>();
        
        public static List<User> listUsers () {
                return users;
        }
        
        public static boolean register (User user) {
                return users.add(user);
        }
        
        public static boolean delete (int id) {
                return users.removeIf(user -> user.getId() == id);
        }

        
        public static boolean update (int id, int age, String name, String email) {
                for (User user : users) {
                        if (id == user.getId()) {
                                user.setAge(age);
                                user.setEmail(email);
                                user.setName(name);
                                return true;
                        }
                }
                return false;
        }

        public static User search (int id){
                for (User user : users) {
                        if (id == user.getId()) {
                                return user;
                        }
                }
                return null;
        }
}