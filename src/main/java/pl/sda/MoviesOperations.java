package pl.sda;

import javax.persistence.EntityManager;

/**
 * @author Remigiusz Zudzin
 */
public class MoviesOperations {

    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();

//        showMoviesProductionDate(entityManager, 10);
//        createNewFilms(entityManager, 5);
        deleteMovie(entityManager, 10);
    }

    static void createNewFilms(EntityManager entityManager, int amount) {

        entityManager.getTransaction().begin();

        for (int i = 0; i < amount; i++) {
            Movies movie = new Movies("New Film", 1950+i);
            entityManager.persist(movie);
        }

        entityManager.getTransaction().commit();
    }

    public static void showMoviesProductionDate(EntityManager entityManager, long id) {
        Movies movies = entityManager.find(Movies.class, id);

        entityManager.getTransaction().begin();

        System.out.println("Rok produkcji: " + movies.getProductionYear());

        entityManager.getTransaction().commit();
    }

    public static void setMovieName(EntityManager entityManager, String title, long index) {
        Movies movies = entityManager.find(Movies.class, index);

        entityManager.getTransaction().begin();

        movies.setName(title);

        entityManager.getTransaction().commit();
    }

    public static void deleteMovie (EntityManager entityManager, long index) {
        Movies movies = entityManager.find(Movies.class, index);

        entityManager.getTransaction().begin();

        entityManager.remove(movies);

        entityManager.getTransaction().commit();
    }

    public static void selectedMovieById(EntityManager entityManager) {
        Movies movies = entityManager.find(Movies.class, 14L);
        System.out.println(movies);
    }

}
