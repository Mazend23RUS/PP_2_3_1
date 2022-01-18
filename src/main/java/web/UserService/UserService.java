package web.UserService;

import web.Model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser (long id);
    User editUser (User user);


//    void createUsersTable();
//
//    void dropUsersTable();
//
//    void saveUser(String name, String lastName);
//
//    void removeUserById(long id);
//
//    List<User> getAllUsers();
//
//    void cleanUsersTable();

}
