
package pub.sorteio;

public class Arvore {
	private NoAr raiz;

	private NoAr incluir(NoAr noAtual, NoAr novoNo) {
		if (noAtual == null) {
			if (raiz == null) {
				raiz = novoNo;
			} else {
				noAtual = novoNo;
			}
		} else if (novoNo.getNumero() < noAtual.getNumero()) {
			noAtual.setEsquerdo(incluir(noAtual.getEsquerdo(), novoNo));
		} else if (novoNo.getNumero() > noAtual.getNumero()) {
			noAtual.setDireito(incluir(noAtual.getDireito(), novoNo));
		} else {
			System.out.println("Telefone já cadastrado");
		}
		return noAtual;
	}

	private NoAr verificar(NoAr noAtual, NoAr novoNo) {
		if (noAtual.getEsquerdo() != null) {
			verificar(noAtual.getEsquerdo(), novoNo);
		}
		if (noAtual != null) {
			if (noAtual.getNumero() == novoNo.getNumero()) {
				System.out.println("Telefone já cadastrado");
			}
		}
		if (noAtual.getDireito() != null) {
			verificar(noAtual.getDireito(), novoNo);
		}
		return noAtual;
	}

	public void incluir(NoAr novoNo) {
		if (novoNo != null) {
			incluir(raiz, novoNo);
		}
	}

	private NoAr ordemCrescente(NoAr noAtual) {
		if (noAtual.getEsquerdo() != null) {
			ordemCrescente(noAtual.getEsquerdo());
		}
		if (noAtual != null) {
			System.out.println(noAtual.getNumero());
		}
		if (noAtual.getDireito() != null) {
			ordemCrescente(noAtual.getDireito());
		}
		return noAtual;
	}

	public void verificar(NoAr novoNo) {
		if (raiz != null) {
			verificar(raiz, novoNo);
		} else {
			System.out.println("árvore vazia");
		}
	}

	public void ListarEmOrdemCrescente() {
		if (raiz != null) {
			ordemCrescente(raiz);
		} else {
			System.out.println("árvore vazia");
		}
	}

	public void remover(NoAr noAtual) {
		NoAr noAux = noAtual;
		while (noAtual.getDireito() != null || noAtual.getEsquerdo() != null) {
			if (noAtual.getEsquerdo() != null) {
				noAux = noAtual;
				noAtual = noAtual.getEsquerdo();
			} else if (noAtual.getDireito() != null) {
				noAux = noAtual;
				noAtual = noAtual.getDireito();
			}
		}
		if (raiz.getNumero() == noAtual.getNumero()) {
			raiz = null;
		} else if (noAux.getNumero() > noAtual.getNumero()) {
			noAtual = noAux;
			noAtual.setEsquerdo(null);
		} else {
			noAux.setDireito(null);
		}
		if (raiz != null) {
			removerNumeros();
		}
	}

	public void removerNumeros() {
		if (raiz == null) {
			System.out.println("árvore vazia");
		} else {
			NoAr noAtual = raiz;
			remover(noAtual);
		}
	}
}
