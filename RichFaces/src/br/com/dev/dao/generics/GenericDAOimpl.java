package br.com.dev.dao.generics;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Table;

import br.com.dev.dao.exception.CommitException;

import java.lang.reflect.ParameterizedType;

public class GenericDAOimpl<Table,Value> implements GenericDAO<Table, Value>{
	
	@Inject 
	private EntityManager em;
		
	//Pegar a tabela em tempo de excecução
	private Class<Table> clazz;
	
	@SuppressWarnings("unchecked")
	public GenericDAOimpl(EntityManager em) {
		super();
		this.em = em;
		
		//Recuperando a Classe    
				clazz = (Class<Table>) ((ParameterizedType)
						getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		
	}

	@Override
	public void Cadastrar(Table entity) throws CommitException {
		em.persist(entity);
	}

	@Override
	public Table Pesquisar(Value codigo){
		return em.find(clazz, codigo);
	}

	@Override
	public void Alterar(Table entity) {
		em.merge(entity);
		
	}
	@Override
	public void Salvar() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			throw new CommitException("Erro ao realizar o commit");
		}
		
	}

	@Override
	public void Remover(Value codigo) {
		Table tabela = Pesquisar(codigo);
		if(tabela == null) {
			try {
				throw new Exception("Registro não encontrado");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	

}
