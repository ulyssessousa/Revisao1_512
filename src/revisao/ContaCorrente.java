package revisao;

public class ContaCorrente extends Conta {
	private double limite;
	private double limiteConta;

	public ContaCorrente() {
		super();
		
	}

	public ContaCorrente(double saldo) {
		super(saldo);
	}

	public ContaCorrente(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
		limiteConta = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double obterSaldoTotal() {
		return getSaldo() + limite;
	}

	@Override
	public boolean debitar(double valor) {
		if (valor > obterSaldoTotal()) {
			setMensagemOp("Saldo insuficiente");
			return false;
		}
		if (valor <= getSaldo()) {
			return super.debitar(valor);
		}
		
		double diferenca = valor - getSaldo();
		setSaldo(0);
		limite = limite - diferenca;
		setMensagemOp("Débito realizado com sucesso."
				+ "Porém, foi utilizado " + diferenca
				+ " reais do limite da conta.");
		return true;
		
	}

	@Override
	public boolean creditar(double valor) {
		if (limite == limiteConta) {
			return super.creditar(valor);
		}
		
		double diferenca = limiteConta - limite;
		
		if ()
		
	}
	
	
	
	
	
	

	
}
