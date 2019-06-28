package com.prakash.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.prakash.entities.ProductsEntity;
import com.prakash.utils.HibernateUtil;

public class ProductsRepository {
	
	public void save(ProductsEntity productsEntity){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(productsEntity);
		session.getTransaction().commit();
		
		session.close();
	}
}
