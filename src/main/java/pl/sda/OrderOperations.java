package pl.sda;

import javax.persistence.EntityManager;

/**
 * @author Remigiusz Zudzin
 */
public class OrderOperations {

    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();

        createTable(entityManager, "OrderManager");
    }

    static void createTable(EntityManager entityManager, String tableName) {

        entityManager.getTransaction().begin();

        entityManager.createNativeQuery("CREATE TABLE " + tableName + "(" +
                        "id smallint unsigned not null auto_increment, " +
                        "date varchar(20) not null, " +
                        "price double, " +
                        "primary key (id) )").executeUpdate();

        entityManager.getTransaction().commit();
    }

}
