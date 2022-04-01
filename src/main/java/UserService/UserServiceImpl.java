package UserService;

import DAO.HibernateUserDao;
import Model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    HibernateUserDao hbUSD = new HibernateUserDao();

    public void createUsersTable(){
        hbUSD.createUsersTable();
    }

    public void dropUsersTable(){
        hbUSD.dropUsersTable();
    }

    public void saveUser(String name, String lastName){
        hbUSD.saveUser(name,lastName);
    }

    public void removeUserById(long id) {
       hbUSD.removeUserById(id);
    }

    public List<User> getAllUsers(){
        return hbUSD.getAllUsers();
    }

    public void cleanUsersTable(){
    hbUSD.cleanUsersTable();
    }

}
