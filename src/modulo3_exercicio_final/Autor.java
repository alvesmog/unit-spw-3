package modulo3_exercicio_final;
import modulo3_exercicio_final_collections.AutorCollection;

public class Autor {
	
	int codigo;
	String nome;
	
	Autor(String nome){
		this.nome = nome;
		this.codigo = AutorCollection.tamanhoLista() + 1;
	}
	
	public static void registrar(Autor a) {
		AutorCollection.registrar(a);
	}
	
	public static void apagar(int codigo) {
		AutorCollection.remover(codigo);	
	}
}
