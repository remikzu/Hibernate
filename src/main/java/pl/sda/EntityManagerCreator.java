package pl.sda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Remigiusz Zudzin
 */
public class EntityManagerCreator {

    public static void main(String[] args) {
        //wartosc z persistence.xml
        getEntityManager();

    }

    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        return emf.createEntityManager();
    }

}
