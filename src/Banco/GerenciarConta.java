package Banco;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {

	ArrayList<Conta> gerenciarConta = new ArrayList();
	ContaCorrente conta = new ContaCorrente();

	public void adicionarConta(Conta c) {
		gerenciarConta.add(c);
		System.out.println(c);
	}

	public boolean removerConta(int numeroConta) {
		boolean encontrou = false;
		for (int i = 0; i <= gerenciarConta.size(); i++) {
			if (gerenciarConta.get(i).getNumConta() == numeroConta) {
				gerenciarConta.remove(gerenciarConta.get(i));
				System.out.println(" encontrou");
				encontrou = true;
			} else if (i == gerenciarConta.size() && encontrou  == false ) {
				System.out.println("nao encontrou");
				encontrou = false;
			}
		}

		System.out.println(gerenciarConta);
		// gerenciarConta.remove(numeroConta);
		return encontrou;
	}

//	public String buscarContasEspeciais() {
//		
//	}
//	
//	public String buscarClientesUsandoLimite() {
//		
//	}
//	
//	public Conta buscarConta(int numeroConta) {
//		
//	}
//	
//	public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor) {
//		
//	}
//	
//	public boolean sacar(int numeroConta, double valorSacado) {
//		
//	}
//	
//	public boolean depositar(int numeroConta, double valorDepositado) {
//		
//	}
//	
//	public String listarContas() {
//		
//	}

}
