package revisao;

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
		System.out.println("---------------------");
		
	}
	
	public static void main(String[] args) {
		mostrarQuantContas();
		
		Conta c1 = new Conta();
		Conta c2 = new Conta(500);
		
		mostrarQuantContas();
		
		mostrarInformacoes(c1);
		mostrarInformacoes(c2);
	}

}
