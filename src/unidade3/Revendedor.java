package unidade3;

// ENUMS SERVEM PARA CRIAR PADRÕES QUE SÓ PODERÃO RECEBER DETERMINADOS DADOS
public enum Revendedor {
	
	// NESSE CASO, TODA VEZ QUE ESSE ENUM FOR INSTANCIADO SÓ SERÃO ACEITOS ESSE DADOS INFORMADOS ABAIXO
	REVENDEDOR1("Vitor Hugo", 15, "Rua 1"),	REVENDEDOR2("Lucas Simão", 19, "Rua 2"),	REVENDEDOR3("Badanha Badonha", 22, "Rua 3");
	
	// VARIÁVEIS
	public String nome;
	public int idade;
	public String endereco;
	
	// PARA QUE O ENUM SEJÁ FEITO DE FORMA CORRETA O CONSTRUTOR DEVE SER PRIVADO, SENÃO ALGUEM VAI PODER ALTERALO DE FORA DA CLASSE
	private Revendedor( String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

}
