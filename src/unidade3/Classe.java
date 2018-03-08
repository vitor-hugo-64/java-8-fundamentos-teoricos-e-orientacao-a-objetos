package unidade3;

import java.time.LocalDate;

public class Classe {
	
	static int totalCarros = 0;
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); // INSTANCIA UM NOVO OBJETO
		
		carro1.idCarro = 1; // ATRIBUI OS DADOS AOS SEUS ATRIBUTOS
		carro1.modelo = "gol";
		carro1.placa = "jdk 001";
		carro1.cor = "azul";
		carro1.ano = 2013;
		carro1.valorDiaria = 99.90f;
		carro1.fabricante = "volkswagen";
		
		totalCarros += 1;
		
		//Carro carro2 = new Carro();
		
		Cliente cliente1 = new Cliente();
		
		cliente1.idCliente = 1;
		cliente1.cpf = "1234567-90";
		cliente1.nome = "Vitor Hugo";
		cliente1.cnh = "XYZ001";
		
		//Cliente cliente2 = new Cliente();
		
		gerarRelatorioLocacao(LocalDate.now(), LocalDate.now().plusDays(5));
		
	}
	
	public void realizarLocacao(int idCarro, int idCliente) {
		Locacao locacao = new Locacao();
		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
		locacao.idLocacao = 1;
		locacao.dataInicio = LocalDate.now();
		locacao.dataFim = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * 99.90f;
	}
	
	// O VARARGS É UM RECURSO QUE PERMITE VOCE PASSAR QUANTOS ATRIBUTOS FOR NECESSÁRIO E MAIS TARDE ISSO VIRA UM ARRAY DENTRO DO METODO
	// NESSA CASO ELE PODE IFORMAR VARIOS VALORES QUE SEJAM DO TIPÓ 'LocalDate' E TUDO SERA ARMAZENADO NA VARIÁVEL 'datas'
	// A PALAVRA 'STATIC' PERMITE QUE O METODO SE TORNE UM MEMBRO DE CLASSE OU ESTÁTICO, ISSO SIGNIFICA QUE ELE PERTENCE A CLASSE E NÃO AO OBJETO
	// NA PRÁTICA ISSO PERMITE USAR O METODO SEM PRECISAR INSTANCIAR UM NOVO OBJETO
	public static void gerarRelatorioLocacao(LocalDate ...datas) { 
		float totalFaturado = 2 * 99.90f;
	}

}
