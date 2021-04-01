package Banco;

public class ContaPoupanca extends Conta{

	
	
	public void calcularRendimento(double porcentagemRendimento) {
		
		saldo = saldo + (porcentagemRendimento * 2);
		
		
	}
	
	
}
