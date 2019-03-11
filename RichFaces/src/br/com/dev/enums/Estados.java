package br.com.dev.enums;

public enum Estados {
	
	RO("Rondônia"),
	AC("Acre"),
	AM("Amazonas"),
	RR("Roraima"),
	PA("Pará"),
	AP("Amapá"),
	TO("Tocantins"),
	MA("Maranhão"),
	PI("Piauí"),
	CE("Ceará"),
	RN("Rio Grande do Norte"),
	PB("Paraíba"),
	PE("Pernambuco"),
	AL("Alagoas"),
	SE("Sergipe"),
	BA("Bahia"),
	MG("Minas Gerais"),
	ES("Espírito Santo"),
	RJ("Rio de Janeiro"),
	SP("São Paulo"),
	PR("Paraná"),
	SC("Santa Catarina"),
	RS("Rio Grande do Sul"),
	MS("Mato Grosso do Sul"),
	MT("Mato Grosso"),
	GO("Goiás"),
	DF("Distrito Federal");
	
	
	private String estados;

    Estados(String estado) {
        this.estados = estado;
    }

    public String getDescricao() {
        return estados;
    }
	
	
	
	

}
