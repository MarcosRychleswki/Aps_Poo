package Banco;

public class ContaCorrente extends Conta {

	protected Double limite = 0.0;
	
	public ContaCorrente() {
	}


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

		if (this.saldo == 0.0) {
			System.out.println("Voce esta no limite");
			return true;
		}
		else {
			System.out.println("Voce nao esta no limite");
			return false;
		}

	

	}

	public  boolean sacar(double valorSacado) {
			
			if (valorSacado > this.saldo && valorSacado > this.limite){
				System.out.println("Voce nao tem limite disponivel");
				return false;
				
			}
			
			if (valorSacado < this.saldo) {
				
				this.saldo -= valorSacado;
				return true;
			}
			
			else {
				this.saldo = this.limite -= valorSacado;
				System.out.println("Voce utilizou seu limite que agr é: " + getLimite());
				return true;
				
			}
	}
	
	public String toString() {

		return numConta + cliente + cpf + String.format("%.2f", saldo) + limite;

	}

}
