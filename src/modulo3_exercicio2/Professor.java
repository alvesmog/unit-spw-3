package modulo3_exercicio2;

public class Professor extends Pessoa {

	double salario;
	
	Professor(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade);
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
