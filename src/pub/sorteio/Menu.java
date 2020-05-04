package pub.sorteio;

import java.util.Random;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		int menu = -1;
		
		while(menu != 0) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 - Sair\n" +
					"Digite 1 - Adicionar Cliente\n" +
					"Digite 2 - Remover Cliente\n" + 
					"Digite 3 - Sortear Cliente"));
			
			if(menu == 1) {
				No novoNo = new No();
				novoNo.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero")));
				lista.inserirFim(novoNo);
			} else if(menu == 2) {
				lista.removerFim();
				lista.listar();
			} else if(menu == 3) {
				 Random gerador = new Random();
				 int sorteado = gerador.nextInt(lista.getQuantidade());
				 System.out.println("numero sorteado: " + sorteado);
				 System.out.println("-------------------------------------");
				 System.out.println("ANTES");
				 System.out.println("-------------------------------------");
				 lista.listar();
				 System.out.println("-------------------------------------");
				 lista.removerPosEsp(sorteado);
				 System.out.println("DEPOIS");
				 System.out.println("-------------------------------------");
				 lista.listar();
				 System.out.println("-------------------------------------");
			}
		}
	}

}
