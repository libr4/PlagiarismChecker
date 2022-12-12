package tarefa;

import java.util.*;

abstract public class Texto {
	
	public Map<String, Integer> ocorrenciaPalavras;
	/**pode ser uma frase ou paragrafo*/
	public String pedacoDeTexto;
	public String[] listaPalavras;
	public int totalDePalavras;
	public int totalDePalavrasComparaveis;
	public Texto(String p) {
		this.pedacoDeTexto = p;
		this.listaPalavras = splitTextoEmPalavras(pedacoDeTexto); 
		this.ocorrenciaPalavras = contaOcorrPalavras(listaPalavras);
		this.totalDePalavras = listaPalavras.length;
		this.totalDePalavrasComparaveis = this.totalPalavrasComparaveis(this.listaPalavras).size();
	}
	
	
	protected String[] splitTextoEmPalavras(String pedacoDeTexto) {
		//faz um split a partir dos espaços
		String[] palavras = pedacoDeTexto.split("[!.,\s]");
		return palavras;
	}
	
	protected List<String> totalPalavrasComparaveis(String[] palavras) {
		List<String> palavrasComparaveis = new ArrayList<String>();
		for (String palavra:palavras) {
			if(palavra.length() > 2) {
				palavrasComparaveis.add(palavra);
			}
		}
		return palavrasComparaveis;
	}
	
	protected Map<String, Integer> contaOcorrPalavras(String[] palavras) {
		//conta a ocorrencia das palavras no paragrafo
		
		Map<String, Integer> ocorrenciaPalavras = new HashMap<String, Integer>();
		for(String palavra : palavras) {
			if (palavra.length() > 2) {
				ocorrenciaPalavras.put(
						palavra.toLowerCase(), 
						1 + (!(ocorrenciaPalavras.get(palavra) == null) ? ocorrenciaPalavras.get(palavra) : 0
						));

			}
		}
		return ocorrenciaPalavras;
	}
}
