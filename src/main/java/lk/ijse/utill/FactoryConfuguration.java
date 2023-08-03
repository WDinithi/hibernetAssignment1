package lk.ijse.utill;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfuguration {
    private static FactoryConfuguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private  FactoryConfuguration(){
        Configuration configuration= new Configuration().configure()
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfuguration getInstance(){
        return (factoryConfiguration==null)?
                factoryConfiguration=new FactoryConfuguration():factoryConfiguration;
    }



    public Session getSession() {
        return sessionFactory.openSession();
    }
}
