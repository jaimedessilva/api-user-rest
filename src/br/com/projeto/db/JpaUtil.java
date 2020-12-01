/**
 * 
 */
package br.com.projeto.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.tool.schema.internal.HibernateSchemaManagementTool;

/**
 * api-rest
 * @author jaime
 * 29 de nov de 2020
 * https://github.com/jaimedessilva/api-user-rest
 */

public class JpaUtil {
	
	/* EntityManager */
	public EntityManager getEntityManager() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("api-rest");
		EntityManager em = emf.createEntityManager();
		
		return em;
	}
	/* Construct */
	public JpaUtil() {
		System.out.println("Connect.....");
		getEntityManager();
		
	}
}
