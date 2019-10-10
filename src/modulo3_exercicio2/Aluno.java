package modulo3_exercicio2;

public class Aluno extends Pessoa {

	private String matricula;

	Aluno(String nome, String cpf, int idade, String matricula) {
		super(nome, cpf, idade);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

}
