package unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {
	
	public static void main(String[] args) {
		
		int nota  = Integer.parseInt(JOptionPane.showInputDialog( null, "Informe Sua Nota: "));
		
		if ((nota < 0) || (nota > 100)) {
			JOptionPane.showInputDialog(null, "Nota Inválida, Informe Novamente: ");
			main(null);
		}
		
		if (nota < 50) { 
			JOptionPane.showMessageDialog( null, "Nopta Insuficiente!"); 
		}
		else if (nota <= 70) { 
			JOptionPane.showMessageDialog( null, "Regular!"); 
		}
		else if (nota <= 90) { 
			JOptionPane.showMessageDialog( null, "Bom!"); 
		}
		else if (nota <= 100) { 
			JOptionPane.showMessageDialog( null, "Excelente!"); 
		}
		
	}

}
