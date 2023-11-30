package exercicio01;

public class Gerente extends Funcionario {
	
	public String departamento;

	public Gerente(String nome, int idade, double salario, String departamento) {
		super(nome, idade, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	//Implementação da interface
		public void PodeTrabalhar() {
			System.out.println("Gerente " + getNome() + " está dando ordens aos funcionários e não faz nada em seguida.");
		}

}
