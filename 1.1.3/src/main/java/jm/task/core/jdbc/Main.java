package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl user = new UserServiceImpl();
        user.createUsersTable();

        User user1 = new User("Елена", "Кузнецова", (byte) 23);
        user.saveUser(user1.getName(), user1.getLastName(), user1.getAge());

        User user2 = new User("Алина", "Иванова", (byte) 22);
        user.saveUser(user2.getName(), user2.getLastName(), user2.getAge());

        User user3 = new User("Алексей", "Алексеев", (byte) 27);
        user.saveUser(user3.getName(), user3.getLastName(), user3.getAge());

        User user4 = new User("Владислав", "Попов", (byte) 25);
        user.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        System.out.println(user.getAllUsers());
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
