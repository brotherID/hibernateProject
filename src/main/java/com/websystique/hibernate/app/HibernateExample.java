package com.websystique.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.websystique.hibernate.model.Student;
import com.websystique.hibernate.model.University;

public class HibernateExample {
	
	public static void main(String[] args) {
		  // Load Hibernate configuration
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Open a session
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Create a new university
            University university = new University();
            university.setName("OpenAI University");

            // Create students
            Student student1 = new Student();
            student1.setName("Sara");
            student1.setUniversity(university);

            Student student2 = new Student();
            student2.setName("John");
            student2.setUniversity(university);

            // Add students to university
            university.getStudents().add(student1);
            university.getStudents().add(student2);

            // Save the university (students will be saved due to CascadeType.ALL)
            session.save(university);

            tx.commit();

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
	}

}
