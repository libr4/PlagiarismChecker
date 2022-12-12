package client;

public class Aluno extends User {
	
	private String id;
	private String curso;
	public Aluno(String id, String nome) {
		super(id, nome);
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getCurso() {
		return this.curso;
	}
	//private boolean submeter() {
		
	//}

}
