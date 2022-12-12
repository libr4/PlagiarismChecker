package tarefa;

import java.util.*;

public class Frase extends Texto {
	
	public Map<String, Integer> ocorrenciaPalavras;
	private String frase;
	private String[] listaPalavras;
	public int totalDePalavras;
	public int totalDePalavrasComparaveis;
	public Frase(String f) {
		super(f);
		this.frase = f;
		this.listaPalavras = splitTextoEmPalavras(frase); 
		this.ocorrenciaPalavras = contaOcorrPalavras(listaPalavras);
		this.totalDePalavras = listaPalavras.length;
		this.totalDePalavrasComparaveis = this.totalPalavrasComparaveis(this.listaPalavras).size();
	}
}
