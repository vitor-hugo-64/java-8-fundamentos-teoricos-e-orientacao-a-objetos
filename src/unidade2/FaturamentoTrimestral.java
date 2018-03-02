package unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestral {
	
	public static void main(String[] args) {
		
		double faturamentoJaneiro = Double.parseDouble(JOptionPane.showInputDialog( null, "Informe O Faturamento De Janeiro: "));
		double faturamentoFevereiro = Double.parseDouble(JOptionPane.showInputDialog( null, "Informe O Faturamento De Fevereiro: "));
		double faturamentoMarco = Double.parseDouble(JOptionPane.showInputDialog(null, "informe O Faturamento De Março"));
		
		JOptionPane.showMessageDialog(null, "O Faturamento Trimestral Foi De: " + (faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco));
		
	}

}
