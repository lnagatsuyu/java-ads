package pr.senac.br.jpa;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pr.senac.br.modelo.Tarefa;

public class AdicionaTarefa {

	public static void main(String[] args) {
		
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Entender o que estou fazendo");
		tarefa.setDataConclusão(LocalDate.parse("2022-05-22"));
		tarefa.setFinalizado(false);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		
		System.out.println("ID da tarefa: " + tarefa.getId());
		
		manager.close();
	}
}
