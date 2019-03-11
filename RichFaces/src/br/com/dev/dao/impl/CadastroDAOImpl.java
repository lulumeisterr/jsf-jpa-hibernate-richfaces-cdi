package br.com.dev.dao.impl;

import javax.persistence.EntityManager;

import br.com.dev.dao.generics.GenericDAOimpl;
import br.com.fiap.dao.interfaces.CadastrarDAO;
import br.com.fiap.entity.Cadastro;

public class CadastroDAOImpl extends GenericDAOimpl<Cadastro, Integer> implements CadastrarDAO{

	public CadastroDAOImpl(EntityManager em) {
		super(em);
		
	}

}
