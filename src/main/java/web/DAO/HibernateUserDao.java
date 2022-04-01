package web.DAO;

import org.springframework.stereotype.Repository;
import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HibernateUserDao implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    private List<User> users;


    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u",User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
     entityManager.persist(user);
    }

    @Override
    public void deleteUser(long id) {
    entityManager.remove(entityManager.find(User.class,id));
    }

    @Override
    public User editUser(User user) {
        return entityManager.merge(user);
    }
}

