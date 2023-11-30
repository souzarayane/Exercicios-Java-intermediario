package exercicio01;

public class Teste {

	public static void main(String[] args) {
		
	Funcionario funcionario = new Funcionario("Tião", 39, 2500.95);
	Gerente gerente = new Gerente("Pedro", 50, 5800.99, "Varejo");
	
	funcionario.PodeTrabalhar();
	gerente.PodeTrabalhar();

	}

}
