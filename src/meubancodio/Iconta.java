package meubancodio;

public interface Iconta {
	
	void sacar(double valor);
	
	 void depositar(double valor);
	 
	 void transferir(double valor, CONTA contaDestino);
	 
	 void imprimirExtrato();
}
