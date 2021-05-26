package Banco;

public class ContaPoupanca extends Conta{

	
	
	
	public ContaPoupanca(Integer numConta, String cliente, Integer cpf) {
		super(numConta, cliente, cpf);
	}
	
	
	public void calcularRendimento(double porcentagemRendimento) {
		
		saldo = saldo + (porcentagemRendimento * 2);

		
	}
	
	
	
	public String toString() {
			
			
			return numConta  + " "
					+ cliente + " "
					+ cpf + " "  
					+ String.format("%.2f", saldo);
			
		}
		
	
}
