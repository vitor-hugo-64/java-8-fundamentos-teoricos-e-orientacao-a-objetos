package unidade3;

public class Javargs {
	
	public static void main(String[] args) {
		
		datas(4,5,6,7,8); // AQUI O METODO EST�TICO � CHAMADO
		
	}
	
	// O JAVARGS PERMITE CRIAR UM METODO QUE RECEBA UM NUMERO INFINITO DE NUMEROS
	// PARA MAIS TARDE TRANFORMAS ESSES DADOS EM UM ARRAY
	// PERCEBA QUE NESSE CASO ELE EST� SENDO USADO EM CONJUNTO COM O FOR EACH PARA PRINTAR OS DADOS NA TELA
	public static void datas(int ...datas) { // JAVARGS
		for(int value :datas) { //FOR EACH
			System.out.println(value);
		}
	}

}
