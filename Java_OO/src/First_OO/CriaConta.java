package First_OO;

public class CriaConta {
	public static void main(String[] args) {
		Conta c = new Conta(16,27);
		System.out.println(c);
	}
	
	public static void comments() {
		//Vimos:

			String msmFirst = "O que é uma classe"
					+ "Como criar uma classe"
					+ "Como criar um objeto ou instância de uma classe"
					+ "O que são atributos"
					+ "Como definir e visualizar valores de atributos"
					+ "Como funciona a atribuição de uma referência à uma variável";
			
			String msmSecond = "como definir métodos com parâmetros e retorno\r\n"
					+ "como retornar algo usando a palavra chave return\r\n"
					+ "como usar a referência this para acessar um atributo\r\n"
					+ "que podemos passar uma referência como parâmetro do método\r\n"
					+ "métodos são chamadas a partir da referência usando o operador";
			
			String msmThirt = "Realizar o relacionamento entre classes através de composição;\r\n"
					+ "Vantagens de se isolar informações repetidas em outra classe;\r\n"
					+ "Detalhes da composição;\r\n"
					+ "NullPointerException para atributos não inicializados e seus cuidados.";
			
			String msmFort = "Atributos privados, restringindo o acesso aos atributos\r\n"
					+ "Encapsulamento de código\r\n"
					+ "Métodos de leitura dos atributos, os getters\r\n"
					+ "Métodos de modificação dos atributos, os setters\r\n"
					+ "Getters e Setters de referência\r\n";
			
			String msmFive = "Construtor da classe, possibilitando receber argumentos e inicializar atributos a partir da criação de um objeto\r\n"
					+ "Com isso, a inicialização dos atributos recebidos no construtor torna-se obrigatória\r\n"
					+ "Atributos da classe, os atributos estáticos\r\n"
					+ "Métodos da classe, os métodos estáticos\r\n"
					+ "Ausência de referência, do this, dentro de métodos estáticos";
			
			String msmFirstResp = "Rsp:"
					+ "Classes é um Tipo abstrato de Dados(Classe Pessoa)"
					+ "Podemos criar objetos a partir da declaração de uma Classe(Pessoa var = new Pessoa();)"
					+ "Atributos são caracteristicas de uma Classe"
					+ "A partir da criação do objeto podemos utilizar os métodos e atributos por meio da variavel de instancia(var.MetodosDaClassePessoa)"
					+ "Podemos atribuir uma referência a partir do (primeiraConta = segundaConta)";
		
	}
}
