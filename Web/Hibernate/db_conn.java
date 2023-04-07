

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   private static final SessionFactory sessionFactory = buildSessionFactory();

   private static SessionFactory buildSessionFactory() {
      try {
         // Create the SessionFactory from hibernate.cfg.xml
         Configuration configuration = new Configuration();
         configuration.configure();
         SessionFactory sessionFactory = configuration.buildSessionFactory();
         return sessionFactory;
      } catch (Throwable ex) {
         // Make sure you log the exception, as it might be swallowed
         System.err.println("Initial SessionFactory creation failed." + ex);
         throw new ExceptionInInitializerError(ex);
      }
   }
  
 }
