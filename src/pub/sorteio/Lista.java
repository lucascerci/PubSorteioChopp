package pub.sorteio;

import javax.swing.JOptionPane;

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
    
	public void removerCli(int num){
            if(inicio == null){
                JOptionPane.showMessageDialog(null, "Lista Vazia");
            } else {
                No noRem = inicio;
                int flag = 0;
                int i = 0;
                while(flag == 0){
                    if(num == noRem.getNumero()){
                        System.out.println(noRem.getNumero());
                        System.out.println(i);
                        removerPosEsp(i);
                        flag = 1;
                        JOptionPane.showMessageDialog(null, "Exclusão bem sucedida");
                    }
                    noRem = noRem.getProximo();
                    i = i + 1;
                }
                if(flag == 0){
                    JOptionPane.showMessageDialog(null, "Não há o número " + num +" na lista");
                }
            }
    }
        
    public void numero(int sorteado){
        No noSor = inicio;
        if(inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
        	if(sorteado == 0) {
                    JOptionPane.showMessageDialog(null,"Número sorteado: "+ noSor.numero);
        	} else if(sorteado == quantidade) {
                    noSor = fim;
                    JOptionPane.showMessageDialog(null,"Número sorteado: "+ noSor.numero);
        	} else {
                    int cont = 0;
                    while(noSor.getProximo() != null && cont < sorteado) {
                        noSor = noSor.getProximo();
                        cont++;
                    }
                    JOptionPane.showMessageDialog(null,"Número sorteado: "+ noSor.numero);
            }
         }
    }
	
	public void removerFim() {
        if(inicio == null) {
        	JOptionPane.showMessageDialog(null, "Lista Vazia");
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
        	JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
        	No noAux = inicio;
        	inicio = inicio.getProximo();
        	noAux.setProximo(null);
        }
	}
	
	public void removerPosEsp(int pos) {
        if(inicio == null) {
                JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
        	if(pos == 0) {
        		removerInicio();
        		quantidade--;
            } else if(pos == quantidade) {
                    removerFim();
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
    	   JOptionPane.showMessageDialog(null, "Lista Vazia");
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
