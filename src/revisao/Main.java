package revisao;

import java.util.Scanner;

public class Main {

	public static void mostrarQuantContas() {
		System.out.println("Quantidade de contas: "
				+ Conta.getQuantContas());
	}
	
	public static void mostrarInformacoes(Conta c) {
		System.out.println("---------------------");
		System.out.println("Conta número: "
							+ c.getNumero());
		System.out.println("Saldo: " + c.getSaldo());
		
		if (c instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) c;
			System.out.println("Limite: " + cc.getLimite());
			System.out.println("Saldo total: "
				+ cc.obterSaldoTotal());
		}
		
		
		
		System.out.println("---------------------");
		
	}
	
	public static void realizarCredito(Conta c) {
		System.out.println("Digite o valor a ser creditado: ");
		Scanner scan = new Scanner(System.in);
		double valor = scan.nextDouble();
		
		if (c.creditar(valor)) {	
			System.out.println("Saldo atualizado: " + c.getSaldo());
		} 
		System.out.println(c.getMensagemOp());
	}
	
	
	private static void realizarDebito(Conta c) {
		System.out.println("Digite o valor a ser debitado: ");
		Scanner scan = new Scanner(System.in);
		double valor = scan.nextDouble();
		
		if (c.debitar(valor)) {
			System.out.println("Saldo atualizado: " + c.getSaldo());
		}
		System.out.println(c.getMensagemOp());
	}
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100, 200);
		
		realizarDebito(cc);
		mostrarInformacoes(cc);
		
		
		
	}

}
