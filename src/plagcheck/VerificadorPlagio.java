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
	
	//private Map<String, Integer> similaridadeSequencial() {
	//	Map<String, Integer> relat;
	//}
	
	
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
		for(int i = 0; i < paragrafosSub.size(); i++) {
			Set<String> palavrasUnicas = paragrafosSub.get(i).ocorrenciaPalavras.keySet();
			Map<String, Integer> paragAtualSub = paragrafosSub.get(i).ocorrenciaPalavras;
			Map<String, Integer> paragAtualArq = paragrafosArq.get(i).ocorrenciaPalavras;
			int palavrasSemelhantes = 0;
			for(String palavra : palavrasUnicas) {
				palavrasSemelhantes += Math.min(paragAtualSub.get(palavra), paragAtualArq.get(palavra));
			}
			
			double taxaSemelhanca = (double)palavrasSemelhantes/paragrafosSub.get(i).totalDePalavras;
			relat.put("Paragrafo " + (i + 1) + " : ", taxaSemelhanca);
		}
		for (String name: relat.keySet()) {
		    String key = name.toString();
		    String value = relat.get(name).toString();
		    System.out.println(key + " " + value);
		}
		return relat;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
	}

}
