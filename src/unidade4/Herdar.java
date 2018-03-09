package unidade4;

public class Herdar extends Heranca {
	
	public boolean getAtributo1() {
		return this.atributo1; // NESSE CASO A CLASSE FILHA PODE USAR O ATRIBUTO1, POIS É UM ATRIBUTO PÚBLICO
	}
	
	public boolean getAtributo2() {
		return this.atributo2; // NESSE CASO NÃO PODE SER USADO O ATRIBUTO2, POIS É UM ATRIBUTO PRIVADO
	}
	
	public boolean getAtributo3() {
		return this.atributo3; // NESSE CASO PODE SER USADO O ATRIBUTO3, POIS É UM ATRIBUTO PROTEGIDO
	}
}
