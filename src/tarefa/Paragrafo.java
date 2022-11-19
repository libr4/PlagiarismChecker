package tarefa;

import java.util.*;

public class Paragrafo implements Granularidade {
	
	private Map<String, Integer> ocorrenciaPalavras;
	private String paragrafo;
	private String[] listaPalavras;
	
	public Paragrafo(String p) {
		this.paragrafo = p;
		this.listaPalavras = splitTextoEmPalavras(paragrafo); 
		this.ocorrenciaPalavras = contaOcorrPalavras(listaPalavras);
		
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
		
		//codigo abaixo eh apenas para teste/debug, mostra a contagem de ocorrencias
		//por paragrafo
		for (String name: ocorrenciaPalavras.keySet()) {
		    String key = name.toString();
		    String value = ocorrenciaPalavras.get(name).toString();
		    System.out.println(key + " " + value);
		}
		return ocorrenciaPalavras;
	}

}
