package controller;

import model.Pessoa;
import br.gui.filagenerica.*;

public class ParqueController {
	Pessoa p;
	public void brinquedo(Fila<Pessoa> f) {
		while(!f.isEmpty()) {
			try {
				p = f.remove();
				if (p.idade < 16) {
					System.out.println(p.nome + " tem idade inferior a 16 anos! " + "[" + p.idade + "]");
				} else if (p.altura < 1.60) {
					System.out.println(p.nome + " tem altura inferior a 1.60! " + "[" + String.format("%.2f", p.altura) + "]");
				} else {
					System.out.println(p.nome + " Liberado!");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
				
		}
	}
}
