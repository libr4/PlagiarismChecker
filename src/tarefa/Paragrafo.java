package tarefa;

import java.util.*;

public class Paragrafo implements Granularidade {
	
	public Map<String, Integer> ocorrenciaPalavras;
	private String paragrafo;
	private String[] listaPalavras;
	public int totalDePalavras;
	
	public Paragrafo(String p) {
		this.paragrafo = p;
		this.listaPalavras = splitTextoEmPalavras(paragrafo); 
		this.ocorrenciaPalavras = contaOcorrPalavras(listaPalavras);
		this.totalDePalavras = listaPalavras.length;
		
	}
	
	@Override
	public String[] splitTextoEmPalavras(String paragrafo) {
		//faz um split a partir dos espaços
		String[] palavras = paragrafo.split("[!.,\s]");
		return palavras;
	}
	
	Map<String, Integer> contaOcorrPalavras(String[] palavras) {
		//conta a ocorrencia das palavras no paragrafo
		Map<String, Integer> ocorrenciaPalavras = new HashMap<String, Integer>();
		for(String palavra : palavras) {
			ocorrenciaPalavras.put(
					palavra.toLowerCase(), 
					1 + (!(ocorrenciaPalavras.get(palavra) == null) ? ocorrenciaPalavras.get(palavra) : 0
					));
		}
		return ocorrenciaPalavras;
	}

}
