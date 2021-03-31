package Banco;

public class Conta {

	private Integer numConta;
	private String cliente;
	private Integer cpf;
	private double saldo;
	
	
	//CONSTRUTOR
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
