package meubancodio;

public abstract class CONTA implements Iconta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static final Object sacar = (50);
	private static int SEQUENCIAL = 1;
  
    protected int agencia;
	protected int numero;
	protected double saldo;
	protected cliente Cliente;
	
	
        public CONTA(cliente Cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.Cliente = Cliente;
		
		}

	
	public void sacar() {
	}
	
	public void depositar() {
	}
	
	public void transferir() {
	
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
    saldo -= valor;		
	}

	@Override
	public void depositar(double valor) {
	saldo += valor;	
	}

	@Override
	public void transferir(double valor, CONTA contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	protected void imprimirInfosComuns() {
	System.out.println(String.format("Titular: %s",this.Cliente.getNome()));
	System.out.println(String.format("Agencia: %d",this.agencia));
	System.out.println(String.format("Numero: %d",this.numero));
	System.out.println(String.format("Saldo: %.2f",this.saldo));
	System.out.println(String.format("Saque: %d", this.sacar));{
		}}{
			
		
		}


		protected abstract void saque(int i);
}
