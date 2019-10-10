package modulo3_exercicio2;

import java.util.ArrayList;

public class RepositorioPessoasArray {

	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	int indice;

	public RepositorioPessoasArray(int tamanho) {

	}

	public void inserir(Pessoa pessoa) {

	}

	public Pessoa procurar(String numCPF) {

		Pessoa p = null;

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getCpf().equals(numCPF)) {
				p = pessoas.get(i);
			}
		}

		return p;

	}
}
