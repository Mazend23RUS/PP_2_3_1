package DAO;

import Model.User;
import java.util.List;


public interface UserDao {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
