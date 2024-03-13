package revisao;

public class Conta {

	private int numero;
	private double saldo;
	private static int quantContas = 0;
	
	
	public Conta() {
		numero = ++quantContas;
	}
	
	public Conta(double saldo) {
		numero = ++quantContas;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static int getQuantContas() {
		return quantContas;
	}
	
	
}
