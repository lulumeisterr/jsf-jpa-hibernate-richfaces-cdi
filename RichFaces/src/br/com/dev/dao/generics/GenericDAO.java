package br.com.dev.dao.generics;

import br.com.dev.dao.exception.CommitException;

public interface GenericDAO<Table,Value>{
	
	void Cadastrar(Table entity)throws CommitException;
	Table Pesquisar(Value codigo);
	void Alterar(Table entity);
	void Remover(Value codigo);
	void Salvar()throws CommitException;

}
