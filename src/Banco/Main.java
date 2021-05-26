package Banco;

import java.util.ArrayList;
import java.util.Scanner;






public class Main {

	public static void main(String[] args) {

		
		int conta = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu tipo de conta? ");
		conta = sc.nextInt();
		
		
		
		// conta corrente
		if(conta == 1 ) {
			ContaCorrente contaCorrente = new ContaCorrente(1, "Marcos", 503173, 0.00);
			System.out.println("Cliente: " + contaCorrente.getCliente());
			System.out.println("Numero da conta: " + contaCorrente.getNumConta());
			System.out.println("CPF: " + contaCorrente.getCpf());
			System.out.println("Limite: " + contaCorrente.getLimite());
			System.out.println("Saldo " + contaCorrente.getSaldo());

			contaCorrente.depositar(100.00);
			
			System.out.println("Saldo " + contaCorrente.getSaldo());
			//System.out.println("Voce fez um deposito seu saldo agr e: " + contaCorrente.getSaldo());
			System.out.println(contaCorrente.usandoLimite());
			contaCorrente.sacar(80.00);
			System.out.println("Saldo " + contaCorrente.getSaldo());

		}
		
		// conta poupança
		if (conta == 2) {
			
			ContaPoupanca contaPoupanca = new ContaPoupanca(1, "Lais", 5031);
			contaPoupanca.calcularRendimento(10);
			System.out.println("Saldo da poupança " + contaPoupanca.getSaldo());
			
			
		}
		
		
		if(conta == 3) {
			ContaEspecial contaEspecial = new ContaEspecial(1, "Marcos", 503173, 100.00, "Lucas");
			System.out.println("Cliente: " + contaEspecial.getCliente());
			System.out.println("Numero da conta: " + contaEspecial.getNumConta());
			System.out.println("CPF: " + contaEspecial.getCpf());
			System.out.println("Limite: " + contaEspecial.getLimite());
			System.out.println("Saldo " + contaEspecial.getSaldo());
			System.out.println("Seu gerente: " + contaEspecial.getNomeGerente());


			contaEspecial.depositar(100.00);
			
			System.out.println("Saldo " + contaEspecial.getSaldo());
			//System.out.println("Voce fez um deposito seu saldo agr e: " + contaCorrente.getSaldo());
			System.out.println(contaEspecial.usandoLimite());
			contaEspecial.sacar(80.00);
			System.out.println("Saldo " + contaEspecial.getSaldo());
			contaEspecial.sacar(20.00);
			System.out.println("Saldo " + contaEspecial.getSaldo());
			System.out.println("Saldo " + contaEspecial.getSaldo());

		}
	
		if(conta == 4) {
			
			GerenciarConta g = new GerenciarConta();
			g.adicionarConta(new ContaCorrente(1, "Marcos", 503173, 0.00));
			g.adicionarConta(new ContaPoupanca(2, "Lais", 5031));
			g.adicionarConta(new ContaEspecial(3, "thiago", 503173, 100.00, "Lucas"));
			g.removerConta(4);
			


			
		}
		
		
		


		
		
	}

}
