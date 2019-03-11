package br.com.fiap.dev.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerCDI {
	
	private EntityManagerCDI() {
		
	}
	
	/*
	 * Mostrando para CDI que os metodos abaixo sao metodos produtores com a anotacao @Produces
	 */
	
	
	/*
	 * Obtendo o objeto da classe persiste e Criando o metodo Produtor do DB ou seja , me retornando um entitymanagerFactory
	 * me retornando uma fabrica de conexao
	 */
	
	@Produces
	@ApplicationScoped // Diz para CDI que o objeto EntityManager precisa estar vivo durante toda a sessao criada e so deve ser liberado quando a aplicaco for encerrada
	public static EntityManagerFactory getNameEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("dboracle");
	}
	
	
	/*
	 * Obtendo o EntityManager apartir do metodo EntityManagerFactory ou seja Criando de fato a fabrica de conexao
	 * responsavel pela persistencia
	 */
	@Produces
	@RequestScoped // Para dizer que ao final da requisicao o entityManager precisa ser liberado da memoria
	public static EntityManager getEntityManager(EntityManagerFactory fa) {
		return 	fa.createEntityManager();
	}
	
	/*
	 * @Disposes - removem da memoria objetos que tenha um processo de destruicao complexaca.
	 * Os Produces criam objetos complexos e os @Disposes destroem objetos complexos
	 */
	
	public void fecharEntityManager(@Disposes EntityManager em) {
		//Verificando se a conexao esta fechando com exito
		if(em.isOpen()) {
			String urlString = (String) em.getEntityManagerFactory().getProperties().get("javax.persistence.jdbc.url");
			System.out.println(urlString);
			em.close();
		}
	}
	
	
}
