package plagcheck;

import java.io.*;
import java.util.*;
import tarefa.*;
//import java.lang.*;

public class VerificadorPlagio {
	
	String relatorio;
	
	public VerificadorPlagio() {
		//this.relatorioFrases =  
	}
	
	public Map<String, Integer> comparaFrases(Tarefa submetida, Tarefa arquivada) {
		//FALTA UM METODO DE COMPARACAO AQUI
		//METODO PROVISORIO
		Map<String, Integer> relat = new HashMap<String, Integer>();
		return relat;
	}
	
	public Map<String, Double> comparaParagrafos(Tarefa submetida, Tarefa arquivada) {
		//FALTA UM METODO DE COMPARACAO AQUI
		//METODO PROVISORIO:
		Map<String, Double> relat = new HashMap<String, Double>();
		
		List<Paragrafo> paragrafosSub = submetida.paragrafos;
		List<Paragrafo> paragrafosArq = arquivada.paragrafos;

		for(int i = 0; i < paragrafosSub.size() && i < paragrafosArq.size(); i++) {
			System.out.println();
			//if (i >= paragrafosArq.size()) break;
			Set<String> palavrasUnicas = paragrafosSub.get(i).ocorrenciaPalavras.keySet();
			Map<String, Integer> paragAtualSub = paragrafosSub.get(i).ocorrenciaPalavras;
			Map<String, Integer> paragAtualArq = paragrafosArq.get(i).ocorrenciaPalavras;

			int palavrasSemelhantes = 0;
			int qtdPalavrasComparadas = 0;
			for(String palavra : palavrasUnicas) {
				if(palavra.length() > 2) {
					int ocorrenciaPalavradoParagArq = (paragAtualArq.get(palavra) == null ? 0 : paragAtualArq.get(palavra));
					palavrasSemelhantes += Math.min(paragAtualSub.get(palavra), ocorrenciaPalavradoParagArq);
					if (ocorrenciaPalavradoParagArq > 0) 
						qtdPalavrasComparadas += Math.max(paragAtualSub.get(palavra), (paragAtualArq.get(palavra) == null ? 0 : paragAtualArq.get(palavra)));
						System.out.println("ocorr" + ocorrenciaPalavradoParagArq);
				}
			}

			System.out.println("qtd" + qtdPalavrasComparadas);
			double taxaSemelhanca = (double)palavrasSemelhantes/qtdPalavrasComparadas;
			relat.put("Paragrafo " + (i + 1) + " : ", taxaSemelhanca);
		}
		return relat;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
	}

}
