package br.edu.unidep.principal;

import javax.persistence.EntityManager;

import br.edu.unidep.model.Conta;
import br.edu.unidep.util.JPAUtil;

public class ContaInsertPrincipal {

	public static void main(String[] args) {
		
		Conta contaMaria = new Conta("Maria dos Santos", 250);

		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(contaMaria);
		
		em.getTransaction().commit();
		
		em.close();
		

	}
	
	/* 
	 
	  *** ATIVIDADE ***
	  
	  1. Criar 3 novas tabelas com no mínimo 4 atributos, sendo diversificado o tipo de dado (Date, boolean, String).
	  2. Realizar as implementações dos métodos para inserir e buscar pelo código (SELECT).
	  
	 */

}
