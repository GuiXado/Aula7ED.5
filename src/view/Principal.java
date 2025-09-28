package view;

import br.gui.filagenerica.*;
import model.Pessoa;
import controller.ParqueController;

public class Principal {
	public static void main(String[] args) {
		Fila<Pessoa> fila = new Fila<>();
		ParqueController pc = new ParqueController();
		
		for (int i = 1; i <= 30; i++) {
			String p = "Pessoa" + i;
			int idade = (int)((Math.random() * 31 ) + 10);
			double altura = ((Math.random() * 0.66 ) + 1.35);
			
			fila.insert(new Pessoa(p, idade, altura));
		}
		
		pc.brinquedo(fila);
		
	}
}
