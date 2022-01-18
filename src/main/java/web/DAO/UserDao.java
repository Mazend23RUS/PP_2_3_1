package web.DAO;

import web.Model.User;
import java.util.List;


public interface UserDao {

    List<User> getAllUsers();
    void deleteUser(long id);
    User editUser(User user);
    void addUser(User user);



}
