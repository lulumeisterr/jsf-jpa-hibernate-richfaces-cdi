package br.com.dev.testes;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.dev.dao.exception.CommitException;
import br.com.dev.dao.impl.CadastroDAOImpl;
import br.com.fiap.dao.interfaces.CadastrarDAO;
import br.com.fiap.entity.Cadastro;


public class CadastroDAO {

	@Inject
	private EntityManager em;

	public void cadastrar(Cadastro cadastro) throws CommitException{
		try {
			CadastrarDAO cDao = new CadastroDAOImpl(em);
			cDao.Cadastrar(cadastro);
			cDao.Salvar();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
