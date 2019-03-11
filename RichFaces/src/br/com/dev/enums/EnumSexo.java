package br.com.dev.enums;

public enum EnumSexo {

	MASCULINO("Homem") , 
	FEMININO("Mulher") , 
	OUTROS("?");
	
	
	private String descricaoString;
	
	EnumSexo(String descricaoString){
		this.descricaoString = descricaoString;
	}

	public String getDescricaoString() {
		return descricaoString;
	}

	
	
}

