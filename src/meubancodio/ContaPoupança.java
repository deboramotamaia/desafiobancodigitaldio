package meubancodio;

public class ContaPoupan�a extends CONTA {

	public ContaPoupan�a(cliente Cliente) {
		super(Cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
	System.out.println("=== Extrato Conta Poupan�a ===");
	super.imprimirInfosComuns();
 
	}

	@Override
	protected void saque(int i) {
		// TODO Auto-generated method stub
		
	}

}
