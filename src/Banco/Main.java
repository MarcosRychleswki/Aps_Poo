package Banco;

import java.util.Scanner;






public class Main {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero da conta: ");
		Integer numConta = sc.nextInt();
		System.out.println("Nome: ");
		String cliente = sc.next();
		System.out.print("Numero do CPF: ");
		Integer cpf = sc.nextInt();
	
		
		Conta conta = new Conta(numConta,cliente,cpf);
		
		System.out.println(conta.getNumConta());
		System.out.println();
		System.out.println(conta.getCliente());
		System.out.println();
		System.out.println(conta.getCpf());
		System.out.println();
		
		System.out.println("Digite um valor para depositar");
		int valorDepositado = sc.nextInt();
		conta.depositar(valorDepositado);
		System.out.println(valorDepositado);
		
		
		
		
		
	}

}
