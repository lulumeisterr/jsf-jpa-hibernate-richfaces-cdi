package br.com.dev.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.dev.dao.exception.CommitException;
import br.com.dev.dao.impl.CadastroDAOImpl;
import br.com.dev.enums.EnumSexo;
import br.com.dev.enums.Estados;
import br.com.fiap.dao.interfaces.CadastrarDAO;
import br.com.fiap.dev.cdi.EntityManagerSingleton;
import br.com.fiap.entity.Cadastro;

public class CadastroTeste {

	public static void main(String[] args) {
		
		/* 
		EntityManagerFactory fabrica = EntityManagerSingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		CadastrarDAO cadastrarDAO =  new CadastroDAOImpl(em);
		
		Calendar Ano = new GregorianCalendar(2015 , Calendar.MAY , 27);
		
		Cadastro c = new Cadastro("Lucas",
								 "Rodrigues",
								 "52776532",
								 "1010","1010",
								 EnumSexo.MASCULINO,123213,
								 "Rua x",
								 "1197931383",
								 "41692128",
								 Ano,
								 "06330065",
								 230,
								 Estados.SP);
		
		cadastrarDAO.Cadastrar(c);
		
		try {
			cadastrarDAO.Salvar();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();
		
		

	}
	
	*/
	}

}
