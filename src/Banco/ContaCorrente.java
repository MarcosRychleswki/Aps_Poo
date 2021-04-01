package Banco;

public class ContaCorrente extends Conta {
	
	
	
	protected Double limite = 0.0;
	
	
	
	public ContaCorrente(Integer numConta, String cliente, Integer cpf) {
		super(numConta, cliente, cpf);
	}
	
	

	public ContaCorrente(Integer numConta, String cliente, Integer cpf, Double limite) {
		super(numConta, cliente, cpf);
		this.limite = limite;
	}



	public Double getLimite() {
		return limite;
	}



	public void setLimite(Double limite) {
		this.limite = limite;
	}
	

	
	public boolean usandoLimite() {
		
		if (saldo < 0) {
			
			return true;
		}
		
		return false;
		
	}
	
	
public String toString() {
		
		
		return numConta 
				+ cliente 
				+ cpf  
				+ String.format("%.2f", saldo)
				+ limite;
		
	}
	
	
	
	
	
	
	
}
