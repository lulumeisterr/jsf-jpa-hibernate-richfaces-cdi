package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.dev.enums.EnumSexo;
import br.com.dev.enums.Estados;

@Entity
//Nome tabela
@Table(name="T_CADASTRO_USUARIO")
//Gerendo a sequencie de users
@SequenceGenerator(name="cadastro",allocationSize=1,sequenceName="T_SQ_CADASTRO")
public class Cadastro {
	
	@GeneratedValue(generator="cadastro",strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name="cd_user")
	private int codigo;
	
	@Column(name="ds_nome",length=50,nullable=false)
	private String nome;
	
	@Column(name="ds_sobrenome",length=50,nullable=false)
	private String sobreNome;
	
	@Column(name="nr_rg",length=9,nullable=false)
	private String rg;
	
	@Column(name="ds_password",length=16,nullable=false)
	private String senha;
	
	@Column(name="ds_passwordConfirm",length=16,nullable=false)
	private String confirmSenhaString;
	
	@Column(name="ds_sexo" , nullable = true)
	@Enumerated(EnumType.STRING)
	private EnumSexo sexo;
	
	@Column(name="nr_cpf",length=11 ,nullable = false)
	private long cpf;
	
	@Column(name="ds_endereco",length=50,nullable=false)
	private String endereco;
	
	@Column(name="nr_celular")
	private String celular;
	
	@Column(name="nr_endereco",length=100)
	private String telefone;
	
	@Column(name="dt_dataNascimento")
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@Column(name="ds_cep",length=30,nullable=false)
	private String cep;
	
	@Column(name="nr_casa",length=30,nullable=false)
	private int numeroCasa;
	
	@Column(name="ds_estado" , nullable = true)
	@Enumerated(EnumType.STRING)
	private Estados estado;

	public Cadastro() {
	}		
	
	public String getRetornaAll() {
		return "Nome  " + nome + "Sobrenome " + sobreNome + "RG : " + rg + "Senha : " + senha + "Enum : " + sexo + "CPF : " + cpf + "Endereco : " + endereco + "Celular :" + celular + "Telefone : " + telefone ;
	}
	
	public Cadastro(String nome, String sobreNome, String rg, String senha, String confirmSenhaString,
			EnumSexo sexo, long cpf, String endereco, String celular, String telefone, Calendar data, String cep,
			int numeroCasa, Estados estado) {
		super();
	
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.rg = rg;
		this.senha = senha;
		this.confirmSenhaString = confirmSenhaString;
		this.sexo = sexo;
		this.cpf = cpf;
		this.endereco = endereco;
		this.celular = celular;
		this.telefone = telefone;
		this.data = data;
		this.cep = cep;
		this.numeroCasa = numeroCasa;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmSenhaString() {
		return confirmSenhaString;
	}

	public void setConfirmSenhaString(String confirmSenhaString) {
		this.confirmSenhaString = confirmSenhaString;
	}

	public EnumSexo getSexo() {
		return sexo;
	}

	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}
}