package HomeWorks.day27.task2.main;

import HomeWorks.day27.task2.model.User;
import HomeWorks.day27.task2.service.CrudService;

import java.util.Scanner;

public class Main {

    static CrudService crudService = new CrudService();
    static Scanner in = new Scanner(System.in);


    public void start() {

        initData();

        while (true) {
            System.out.println("input 1 for add user");
            System.out.println("input 2 for view user list");
            System.out.println("input 3 for remove user");
            System.out.println("input 4 for exit");
            System.out.print("->");
            String choose = in.next();

            switch (choose) {
                case "1":
                    add();
                    break;
                case "2":
                    list();
                    break;
                case "3":
                    remove();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID CHOOSE");

            }
        }
    }

    private void initData() {
        crudService.getUsersFromFile();
    }

    private void add() {
        System.out.println("Please input User Name");
        String name = in.next();
        System.out.println("Please input User surName");
        String surname = in.next();
        System.out.println("Please input age");
        int age = in.nextInt();
        User user = new User(name,surname,age);
        crudService.saveUser(user);
    }

    private void list() {
        crudService.listUser();
    }

    private void remove() {
        System.out.println("Choose user name, who you have delete");
        String deleteName = in.next();
        crudService.removeUser(deleteName);
    }

    private void exit() {

    }


}

