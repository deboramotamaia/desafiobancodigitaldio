package meubancodio;

public class ContaCorrente extends CONTA{

	public ContaCorrente(cliente Cliente) {
		super(Cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		
		
	}

	@Override
	protected void saque(int i) {
		// TODO Auto-generated method stub
		
		
		
		
	}

			
	}	
	
	
	
