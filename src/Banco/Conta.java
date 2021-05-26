package Banco;

public abstract class Conta {

	protected Integer numConta;
	protected String cliente;
	protected Integer cpf;
	protected double saldo;
	
	
	//CONSTRUTOR
	
	
	public Conta() {
	}
	
	
	public Conta(Integer numConta, String cliente, Integer cpf) {
		super();
		this.numConta = numConta;
		this.cliente = cliente;
		this.cpf = cpf;
	}



	
	//GET-SET
	public Integer getNumConta() {
		return numConta;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public Integer getCpf() {
		return cpf;
	}



	public double getSaldo() {
		return saldo;
	}



	
	
	public  boolean sacar(double valorSacado) {
		
		if (valorSacado > this.saldo){
			return false;
			
		}
		
		else {
			
			this.saldo -= valorSacado;
			return true;

			
		}
		
		
		
	}
	
	
	public boolean depositar(double valorDepositado) {
		
		this.saldo += valorDepositado;
		return true;
		
		
	}
	
	
	
	public String toString() {
		
		
		return numConta 
				+ cliente 
				+ cpf + saldo 
				+ String.format("%.2f", saldo);
		
		
	}
	
	
	
	
	
	
}
