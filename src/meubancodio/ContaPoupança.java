package meubancodio;

public class ContaPoupanša extends CONTA {

	public ContaPoupanša(cliente Cliente) {
		super(Cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
	System.out.println("=== Extrato Conta Poupanša ===");
	super.imprimirInfosComuns();
 
	}

	@Override
	protected void saque(int i) {
		// TODO Auto-generated method stub
		
	}

}
