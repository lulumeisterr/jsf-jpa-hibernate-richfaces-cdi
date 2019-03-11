package br.com.fiap.entity;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.dev.enums.EnumSexo;
import br.com.dev.enums.Estados;
import br.com.dev.testes.CadastroDAO;


/*
 * Named - Ela disponibiliza o acesso nas propriedades do jsf(xhtml) para que possamos usar a expression Language
 */

/*
 * RequestScoped - Ele e instanciado quando a requisicao comeca , e destruido quando a requisicao termina , ou seja so dura uma requisicao
 */

@Named
@RequestScoped
public class CadastroBean implements Serializable , Comparable<CadastroBean>{

	private static final long serialVersionUID = 7385843199983745139L;

	private Cadastro cadastro = new Cadastro();

	@Inject
	private CadastroDAO cDAO;
	
	public void salvar() {
		try {
			cDAO.cadastrar(cadastro);
			System.out.println("Verificando o cadastro : " + cadastro.getRetornaAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* 
	 * Retornando Enums Sexo
	 */
	
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public EnumSexo[] getSexo(){
		return EnumSexo.values();	
	}
	
	/*
	 * Retornando Enums Estado
	 */
	public Estados[] getEstado() {
		return Estados.values();
	}
	
	/*
	 * Permitindo o acesso a classe Cadastro
	 * 
	 */
	
	public Cadastro getCadastro() {
		return cadastro;
	}
	
	// Representar um objeto atraves de uma string
	@Override
	public String toString() {
		return "CadastroBean [nome=" + cadastro.getNome() + ", sobreNome=" + cadastro.getSobreNome() + ", rg=" + cadastro.getRg() + ", senha=" + cadastro.getSenha()
		+ ", confirmSenhaString=" + cadastro.getConfirmSenhaString() + ", sexo=" + cadastro.getSexo() + ", cpf=" + cadastro.getCpf() + ", endereco="
		+ cadastro.getEndereco() + ", celular=" + cadastro.getCelular() + ", telefone=" + cadastro.getTelefone() + ", data=" + cadastro.getData() + ", cep=" + cadastro.getCep()
		+ ", numeroCasa=" + cadastro.getNumeroCasa() + ", estado=" + cadastro.getEstado() + "]";
	}

	// Utilizando Colecao de ordenacao
	@Override
	public int compareTo(CadastroBean outraNome) {
		if(this.cadastro.getNome().equals(outraNome)){
			return -1;
		}else if(!this.cadastro.getNome().equals(outraNome)){
			return 1;
		}
		return 0;
	}

}
