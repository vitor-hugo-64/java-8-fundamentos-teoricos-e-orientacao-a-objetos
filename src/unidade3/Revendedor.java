package unidade3;

// ENUMS SERVEM PARA CRIAR PADR�ES QUE S� PODER�O RECEBER DETERMINADOS DADOS
public enum Revendedor {
	
	// NESSE CASO, TODA VEZ QUE ESSE ENUM FOR INSTANCIADO S� SER�O ACEITOS ESSE DADOS INFORMADOS ABAIXO
	REVENDEDOR1("Vitor Hugo", 15, "Rua 1"),	REVENDEDOR2("Lucas Sim�o", 19, "Rua 2"),	REVENDEDOR3("Badanha Badonha", 22, "Rua 3");
	
	// VARI�VEIS
	public String nome;
	public int idade;
	public String endereco;
	
	// PARA QUE O ENUM SEJ� FEITO DE FORMA CORRETA O CONSTRUTOR DEVE SER PRIVADO, SEN�O ALGUEM VAI PODER ALTERALO DE FORA DA CLASSE
	private Revendedor( String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

}
