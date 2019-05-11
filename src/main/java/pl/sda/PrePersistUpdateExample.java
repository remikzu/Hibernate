package pl.sda;

import javax.persistence.EntityManager;

/**
 * @author Remigiusz Zudzin
 */
public class PrePersistUpdateExample {

    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();
//        User login = new User("login");
//        entityManager.getTransaction().begin();
//        entityManager.persist(login);
//        entityManager.getTransaction().commit();

        User user = entityManager.find(User.class, 1L);
        entityManager.getTransaction().begin();
        user.setLogin("login2");
        entityManager.getTransaction().commit();
    }

}
