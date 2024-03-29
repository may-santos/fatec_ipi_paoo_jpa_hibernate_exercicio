package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Veiculo;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.persistence.JPAUtil;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Veiculo");
		List <Veiculo> veiculos = query.getResultList();
		for (Veiculo v : veiculos) {
		System.out.println(v);
		}
		manager.close();
		
		JPAUtil.close();

	}

}
