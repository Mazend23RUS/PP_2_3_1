package web.DAO;

import web.Model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class HibernateUserDao implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    private List<User> users;


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u",User.class).getResultList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
     entityManager.persist(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
    entityManager.remove(entityManager.find(User.class,id));
    }

    @Override
    @Transactional
    public User editUser(User user) {
        return entityManager.merge(user);
    }
}

