package First_OO;

import Secs_OO.Cliente;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total;
	
	public Conta(int Agencia, int Numero) {
		total++;
		setAgencia(Agencia);
		setNumero(Numero);
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo +=valor; //this podemos refenciar a var pela Class Conta
		}
	}
	
	public boolean saca(double valor) {
		if(getSaldo() >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta contaTr) {
		if(getSaldo() > valor && valor > 0) {
			this.saldo -= valor;
			contaTr.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
