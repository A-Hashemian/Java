
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // Create an EntityManagerFactory with the persistence unit name "myDatabase"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        
        // Create an EntityManager to interact with the database
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Begin a new transaction using the EntityTransaction object
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        // Create a new instance of the MyTable entity and set its values
        MyTable myTable = new MyTable();
        myTable.setColumn1("value1");
        myTable.setColumn2("value2");
        
        
         // Save the entity to the database using the persist() method
        entityManager.persist(myTable);
        
        // Commit the transaction to save the changes to the database
        entityTransaction.commit();
        
        // Close the EntityManager and EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }
      
      
    }
