package modulo3_exercicio_uml;

public class ContaAbstrata {
	
	private String numero;
	private double saldo;
	
	public ContaAbstrata(String numero, double saldo){
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void creditar(double valor) {
		
	}
	
	public void debitar(double valor) {
		
	}

}
