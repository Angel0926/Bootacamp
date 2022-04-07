package HomeWorks.day27.task2.service;

import HomeWorks.day27.task2.model.User;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CrudService {

    private List<User> usersList = new LinkedList<>();
    private final File file = new File("src/HomeWorks/day27/task2/resource/Users");

    public void saveUser(User user) {
        usersList.add(user);
        serializeUsers();
    }

    private void serializeUsers() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(usersList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<User> getUsersFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            usersList = (List<User>) in.readObject();
            return usersList;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void listUser() {
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    public void removeUser(String deleteName) {
        Iterator<User> iterator = usersList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getName().equals(deleteName)){
                iterator.remove();
            }
        }
        serializeUsers();
    }
}