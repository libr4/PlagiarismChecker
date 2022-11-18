package tarefa;

import java.util.*;

public class Paragrafo {
	
	private Map<String, Integer> ocorrenciaPalavras;
	private String paragrafo;
	private String[] listaPalavras;
	
	public Paragrafo(String p) {
		this.paragrafo = p;
		this.listaPalavras = splitParagEmPalavras(paragrafo); 
		this.ocorrenciaPalavras = contaOcorrPalavras(listaPalavras);
		
	}
	
	
	String[] splitParagEmPalavras(String paragrafo) {
		//faz um split a partir dos espaços
		String[] palavras = paragrafo.split("\\s");
		return palavras;
	}
	
	Map<String, Integer> contaOcorrPalavras(String[] palavras) {
		//conta a ocorrencia das palavras no paragrafo
		for(String palavra : palavras) {
			ocorrenciaPalavras.put(
					palavra, 
					1 + (!(ocorrenciaPalavras.get(palavra) == null) ? ocorrenciaPalavras.get(palavra) : 0
					));
		}
		return ocorrenciaPalavras;
	}

}
