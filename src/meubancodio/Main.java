package meubancodio;

public class Main {

	public static void main(String[] args) {
		cliente debora = new cliente();
		debora.setNome(" D�bora Mota Maia Silva");
		cliente jonnathan = new cliente();
		jonnathan.setNome("Jonnathan Coelho Silva");
		
    CONTA cc = new ContaCorrente(debora);
    CONTA poupanca = new ContaPoupan�a(debora);
    cc.depositar(350);
    cc.transferir(150, poupanca);
    
    CONTA cc1 = new ContaCorrente(jonnathan);
    CONTA poupanca1 = new ContaPoupan�a(jonnathan);
    
    cc1.depositar(550);
    cc1.transferir(100, poupanca1);
    cc1.saque(50);
    
   
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
	
	cc1.imprimirExtrato();
	poupanca1.imprimirExtrato();
	}

	
	}


