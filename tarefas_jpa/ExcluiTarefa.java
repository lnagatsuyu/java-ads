package pr.senac.br.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pr.senac.br.modelo.Tarefa;

public class ExcluiTarefa {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		
		Tarefa tarefa = manager.find(Tarefa.class, 2L);
		manager.remove(tarefa);
		
		manager.getTransaction().commit();
		
		manager.close();
	}
}
