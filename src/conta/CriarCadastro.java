package conta;

import java.util.Locale;
import java.util.Scanner;

import banco.Cadastro;

public class CriarCadastro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cadastro cadastro;
		
		System.out.print("Numero da Conta: ");
		int numero = sc.nextInt();
		System.out.print("Nome do Cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Tem deposito inical(s/n)?: ");
		char valorInicial = sc.next().charAt(0);
		if(valorInicial == 's') {
			System.out.println("Deposite o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			cadastro = new Cadastro(nome, numero, depositoInicial);
		}else {
			cadastro = new Cadastro(nome, numero);
		}
		System.out.print("Conta atual");
		System.out.println(cadastro);
		
		System.out.println();
		System.out.println("faça um deposito: ");
		double dep = sc.nextDouble();
		cadastro.depositar(dep);
		System.out.println("saldo atualizado: ");
		System.out.println(cadastro);
		
		System.out.println();
		System.out.println("faça um saque: ");
		double sac = sc.nextDouble();
		cadastro.sacar(sac);
		System.out.println("saldo atualizado: ");
		System.out.println(cadastro);
		
		
		
		sc.close();
	}

}
