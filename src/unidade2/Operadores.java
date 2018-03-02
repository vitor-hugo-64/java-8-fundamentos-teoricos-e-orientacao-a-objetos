package unidade2;

import java.util.Scanner;

public class Operadores {
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Escreva O Primeiro Numero: ");
		int numero1 = scn.nextInt();
		System.out.println("Escreva O Segundo Número: ");
		int numero2 = scn.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
		System.out.println("O 'numero1' É Igual a 'numero2'? " + (numero1 == numero2));
		System.out.println("O 'numero1' É Maior Que O 'numero2'? " + (numero1 > numero2));
		System.out.println("O 'numero1' É Menor Que O 'numero2'? " + (numero1 < numero2));
		
	}

}
