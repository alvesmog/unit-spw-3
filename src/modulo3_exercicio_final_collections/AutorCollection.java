package modulo3_exercicio_final_collections;

import java.util.ArrayList;

import modulo3_exercicio_final.Autor;

public class AutorCollection {
	
	private static ArrayList<Autor> autores = new ArrayList<>();

	public static int tamanhoLista() {
		return autores.size();
	}

	public static void registrar(Autor a) {
		autores.add(a);
	}
	
	public static void remover(int codigo) {
		autores.remove(codigo);
	}

}
