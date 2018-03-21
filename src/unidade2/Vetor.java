package unidade2;

import java.util.Random;

public class Vetor {

	public static void main(String[] args) {
		
		int[] vetor = new int[3];
		
		Random gerador = new Random();
		
		for(int i = 0; i <= vetor.length; i++) {
			vetor[i] = gerador.nextInt();
		}
		
		for(int value: vetor) {
			System.out.println(value);
		}
		
		
	}

}
