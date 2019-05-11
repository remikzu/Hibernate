package pl.sda;

import javax.persistence.EntityManager;

/**
 * @author Remigiusz Zudzin
 */
public class MoviesPersists {

    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();

        entityManager.getTransaction().begin();

        Movies movie = new Movies("Avengers", 2019);
        entityManager.persist(movie);

        entityManager.getTransaction().commit();
    }

}
