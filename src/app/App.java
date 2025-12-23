package app;

import java.util.Scanner;

import app.controller.UserController;

public class App {

        static void printOptions () {
                System.out.println("Options:");
                System.out.println("1-List Users");
                System.out.println("2-Register User");
                System.out.println("3-Delete User");
                System.out.println("4-Updade User");
                System.out.println("5-Search User");
                System.out.println("6-Exit");
                int option = getAnswer(Utils.scanner);
                validateOption(option);
        }

        static void validateOption (int option) {
                switch (option) {
                        case 1 -> UserController.listConstroller(Utils.scanner);
                        case 2 -> UserController.registerController(Utils.scanner);
                        case 3 -> UserController.deleteController(Utils.scanner);
                        case 4 -> UserController.updateController(Utils.scanner);
                        case 5 -> UserController.searchController(Utils.scanner);
                        case 6 -> {
                                System.out.println("Bye!");
                                System.exit(0);
                        }
                        default -> System.out.println("Invalid Option");
                }
        }

        static int getAnswer (Scanner scanner) {
                System.out.println("Send your choose:");
                int option = scanner.nextInt();
                return option;
        }
        
        public static void main(String[] args) {
                while (true) {
                        printOptions();
                }
        }        
}
