package unidade2;

public class estruturaRepeticao {
	
	public static void main(String[] args) {
		
		int number = 0;
		
		while(number <= 10) {		
			System.out.println(number);
			number++;
		}
		
		number = 0;
		
		do {
			System.out.println(number);
			number++;
		} while (number <= 10);
		
		for (int number1 = 0; number1 <= 10; number1++) {
			System.out.println(number1);
		}
		
	}
	
}
