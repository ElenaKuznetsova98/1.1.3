package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl j = new UserDaoJDBCImpl();
    public void createUsersTable() {
        j.createUsersTable();
    }

    public void dropUsersTable() {
        j.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        j.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        j.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return j.getAllUsers();
    }

    public void cleanUsersTable() {
        j.cleanUsersTable();
    }
}
