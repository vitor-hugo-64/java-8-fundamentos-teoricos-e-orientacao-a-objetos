package unidade3;

public class Carro {
	
	public int idCarro, ano;
	public String placa, fabricante, modelo, cor;
	public float valorDiaria, consumo;
	
	// CONSTRUTOR SEM PARAMETROS
	public Carro() {
		
	}
	
	// CONSTRUTOR QUE SE PASSA PARAMETROS
	public Carro(float Consumo) {
		this.consumo = consumo;
	}
	
	public static void main(String[] args) {
		Carro carro1 = new Carro(15.5f);
	}
	
}
