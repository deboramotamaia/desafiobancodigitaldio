package meubancodio;

import java.util.List;

public class Banco {
 
	private String nome;
	private List<CONTA> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<CONTA> getContas() {
		return contas;
	}

	public void setContas(List<CONTA> contas) {
		this.contas = contas;
	}

	}


