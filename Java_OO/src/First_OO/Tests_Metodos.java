package First_OO;

import Secs_OO.Cliente;

public class Tests_Metodos {
	public static void main(String[] args) {
		Conta c = new Conta(12,25);
		
		c.depositar(25.00);
		System.out.println(c.getSaldo());
		
		boolean v = c.saca(20.00);
		System.out.println(v);
		System.out.println(c.getSaldo());
		
		Conta b = new Conta(13,26);
		
		if(c.transfere(5.0, b)) {
			System.out.println("Transferencia com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}

		System.out.println(b.getSaldo());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Nome");
		c.setTitular(cliente);
		
		System.out.println(c.getTitular().getNome());
		c.getTitular().setProfissao("Programador");
	}
	
	public void commends() {
		String msm = "Métodos: Podemos entender como um 'Comportamento' ou a maneira de fazer algo"
				+ "\n O nome de um método deve começar com a letra minúscula"
				+ "Chamar um método no Java: nomeDaReferencia.nomeDoMeodo();"
				+ "This usado para dar referência         "
				+ "double saldo;\r\n"
				+ "int numero;\r\n"
				+ "\r\n"
				+ "        void deposita(double valor) {\r\n"
				+ "            this.saldo = this.saldo + valor;\r\n"
				+ "        }";
	}
}
