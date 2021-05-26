package Banco;

public class ContaEspecial extends ContaCorrente {


	private String nomeGerente;
	
	public ContaEspecial(Integer numConta, String cliente, Integer cpf, String nomeGerente) {
		super(numConta, cliente, cpf);
		this.nomeGerente = nomeGerente;

	}

	public ContaEspecial(Integer numConta, String cliente, Integer cpf, Double limite, String nomeGerente) {
		super(numConta, cliente, cpf, limite);
		this.nomeGerente = nomeGerente;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	

public String toString() {
		
		
		return numConta  + " "
				+ cliente + " "
				+ cpf + " "  
				+ String.format("%.2f", saldo) + " "
				+ limite + " "
				+ nomeGerente;
		
	}
	
	
	
	
	
}
