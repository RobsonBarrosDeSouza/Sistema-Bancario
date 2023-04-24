package banco;

public class Cadastro {

	private  int numeroConta;
	private String name;
	private double saldo;
	
	
	
	// Construtores 
	public Cadastro(String name, int numeroConta) {
		this.name = name;
		this.numeroConta = numeroConta;
	}
	
	public Cadastro(String name, int numeroConta, double depositoInicial) {
		this.name = name;
		this.numeroConta = numeroConta;
		depositar(depositoInicial);
	}

	//Metodos Get and Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}


	// Metodos adicionais 
	public void abrirConta(String name, int numeroConta) {
		this.numeroConta = numeroConta;
		this.name = name;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
		
	}
	
	public void sacar(double saque) {
		this.saldo -= saque + 5.0;
		
	}
	
	public String toString() {
		return "Conta: " 
				+ numeroConta
				+ ", Nome: "
				+ name
				+ ", saldo: "
				+ String.format("%.2f", saldo);
	}
	
	
	
}
