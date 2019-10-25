package modulo3_exercicio_uml;

public interface RepositorioContas {
	
	public default void inserir(Conta conta) {
		
	}
	
	public default Conta procurar(String numeroConta) {
		return null;
		
	}
	
	public default void remover(String numeroConta) {
		
	}

}
