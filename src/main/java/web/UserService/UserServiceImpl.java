package web.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.Model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;


    @Autowired
    public UserServiceImpl (UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }
    @Override
    @Transactional
    public User editUser(User user) {
        return userDao.editUser(user);
    }


//    public void createUsersTable(){
//        hbUSD.createUsersTable();
//    }
//
//    public void dropUsersTable(){
//        hbUSD.dropUsersTable();
//    }
//
//    public void saveUser(String name, String lastName){
//        hbUSD.saveUser(name,lastName);
//    }
//
//    public void removeUserById(long id) {
//       hbUSD.removeUserById(id);
//    }
//
//    public List<User> getAllUsers(){
//        return hbUSD.getAllUsers();
//    }
//
//    public void cleanUsersTable(){
//    hbUSD.cleanUsersTable();
//    }

}
