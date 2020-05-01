package pub.sorteio;

public class Lista {
	private No inicio;
	private No fim;
	
	public void inserirFim(No novoNo) {
		if(inicio==null) {
			inicio = novoNo;
		} else {
			fim.setProximo(novoNo);
		}
		fim = novoNo;
	}
	
	public void listar() {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			No noAux = inicio;
			
			while(noAux != null) {
				System.out.println(noAux.getNumero());
				noAux = noAux.getProximo();
			} 
		}
	}
}
