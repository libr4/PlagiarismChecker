package client;

public abstract class User {
	
	protected String id;
	protected String nome;
	
	public User(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	boolean submeterArquivo() {
		boolean enviado = false;
		return enviado;
	}
}
