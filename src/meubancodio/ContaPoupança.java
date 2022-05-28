package meubancodio;

public class ContaPoupança extends CONTA {

	public ContaPoupança(cliente Cliente) {
		super(Cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
	System.out.println("=== Extrato Conta Poupança ===");
	super.imprimirInfosComuns();
 
	}

	@Override
	protected void saque(int i) {
		// TODO Auto-generated method stub
		
	}

}
