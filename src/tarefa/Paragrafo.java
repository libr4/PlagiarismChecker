package tarefa;

import java.util.*;

public class Paragrafo extends Texto {
	
	public Map<String, Integer> ocorrenciaPalavras;
	public String paragrafo;
	public String[] listaPalavras;
	public int totalDePalavras;
	public int totalDePalavrasComparaveis;
	
	public Paragrafo(String p) {
		super(p);
		this.paragrafo = p;
		this.listaPalavras = splitTextoEmPalavras(paragrafo); 
		this.ocorrenciaPalavras = contaOcorrPalavras(listaPalavras);
		this.totalDePalavras = listaPalavras.length;
		this.totalDePalavrasComparaveis = this.totalPalavrasComparaveis(this.listaPalavras).size();
	}
	
	
	
}
