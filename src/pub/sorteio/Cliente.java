package pub.sorteio;

public class Cliente {
	private int id;
	private int numero;
	private double conta;
	private boolean jaSorteado;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getConta() {
		return conta;
	}
	
	public void setConta(double conta) {
		this.conta = conta;
	}
	
	public boolean isJaSorteado() {
		return jaSorteado;
	}

	public void setJaSorteado(boolean jaSorteado) {
		this.jaSorteado = jaSorteado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", numero=" + numero + ", conta=" + conta + ", jaSorteado=" + jaSorteado + "]";
	}	
}
