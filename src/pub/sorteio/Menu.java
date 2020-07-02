package pub.sorteio;

import java.util.Random;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Arvore arvore = new Arvore();

		int menu = -1;

		while (menu != 0) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 - Sair\n" + "Digite 1 - Adicionar Cliente\n"
					+ "Digite 2 - Baixa Número Cliente\n" + "Digite 3 - Sortear Cliente\n"
					+ "Digite 5 - Listar números\n" + "Digite 6 - Remover números"

			));

			if (menu == 1) {
				No novoNo = new No();
				NoAr novoNoar = new NoAr();

				int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero"));
				novoNo.setNumero(numero);
				System.out.println(novoNo.getNumero());
				novoNoar.setNumero(numero);
				System.out.println(novoNoar.getNumero());
				
				lista.inserirFim(novoNo);
				arvore.incluir(novoNoar);

			} else if (menu == 2) {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ser removido"));
				lista.removerCli(num);
			} else if (menu == 3) {
				Random gerador = new Random();
				if (lista.getQuantidade() == 0) {
					System.out.println("Lista Vazia");
				} else {
					int sorteado = gerador.nextInt(lista.getQuantidade());
					JOptionPane.showMessageDialog(null, "Posição Sorteada: " + sorteado);
					lista.numero(sorteado);
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
			} else if (menu == 4) {
				lista.listar();
			} else if (menu == 5) {
				arvore.ListarEmOrdemCrescente();
			} else if (menu == 6) {
				arvore.removerNumeros();
			} else if (menu != 0) {
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}
	}

}
