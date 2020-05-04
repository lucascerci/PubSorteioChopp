package pub.sorteio;

public class Lista {
	private No inicio;
	private No fim;
	private int quantidade;
	
	public void inserirFim(No novoNo) {
		if(inicio==null) {
			inicio = novoNo;
			quantidade++;
		} else {
			fim.setProximo(novoNo);
			novoNo.setAnterior(fim);
			fim = novoNo;
			quantidade++;
		}
		fim = novoNo;
	}
	
	public void removerFim() {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			No noAnt = fim.getAnterior();
			if(noAnt == null) {
				inicio = null;
				fim = null;
				quantidade--;
			} else {
				noAnt.setProximo(null);
				fim.setAnterior(null);
				fim = noAnt;
				quantidade--;
			}
		}
	}
	
	public void removerInicio() {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			No noAux = inicio;
			inicio = inicio.getProximo();
			noAux.setProximo(null);
		}
	}
	
	public void removerPosEsp(int pos) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			if(pos == 0) {
				removerInicio();
				quantidade--;
			} else if(pos == quantidade) {
				removerFim();
				quantidade--;
			} else {
				No noAux = inicio;
				int cont = 0;
				
				while(noAux.getProximo() != null && cont < pos) {
					noAux = noAux.getProximo();
					cont++;
				}
				
				No noAnt = noAux.getAnterior();
				if(noAnt != null) {
					noAnt.setProximo(noAux.getProximo());
				}
				quantidade--;
			}
		}
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
