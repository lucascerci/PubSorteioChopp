package pub.sorteio;

public class NoAr {

    private int numero;
    private NoAr esquerdo;
    private NoAr direito;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NoAr getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(NoAr esquerdo) {
        this.esquerdo = esquerdo;
    }

    public NoAr getDireito() {
        return direito;
    }

    public void setDireito(NoAr direito) {
        this.direito = direito;
    }
    
}
