package plagcheck;

import java.io.*;
import java.util.*;
import tarefa.*;
import client.*;
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
					//if (ocorrenciaPalavradoParagArq > 0) {
					qtdPalavrasComparadas += Math.max(paragAtualSub.get(palavra), (paragAtualArq.get(palavra) == null ? 0 : paragAtualArq.get(palavra)));
				//}
				}
			}
			double taxaSemelhanca = (double)palavrasSemelhantes/qtdPalavrasComparadas;
			relat.put("Paragrafo " + (i + 1) + " : ", taxaSemelhanca);
		}
		return relat;
	}
	
	public void comparaComTodasSubmissoes(Tarefa tarefa, String nomeTarefa) throws FileNotFoundException {
		String nomeAluno = tarefa.aluno;
		String[] listaAlunos = new File("Exemplos/").list();
		List<Tarefa> outrasSubmissoes = new ArrayList<Tarefa>();
		VerificadorPlagio verificador = new VerificadorPlagio();
		
		for(String aluno : listaAlunos) {
			outrasSubmissoes.add(new Tarefa(aluno, nomeTarefa + ".txt"));
		}
		
		for(Tarefa t : outrasSubmissoes) {
			Map<String, Double> relatorio = verificador.comparaParagrafos(tarefa, t);
			if (t.aluno != nomeAluno) {
				System.out.println("Similaridade com " + t.aluno);

				for (String name: relatorio.keySet()) {
					String key = name.toString();
					String value = relatorio.get(name).toString();
					System.out.println(key + " " + value);
				}
			}
		}
		
	}
	
	public void comparaIndividual(Tarefa tarefa1, Tarefa tarefa2) {

		VerificadorPlagio verificador = new VerificadorPlagio();
		Map<String, Double> relatorio = verificador.comparaParagrafos(tarefa1, tarefa2);

		for (String name : relatorio.keySet()) {
			String key = name.toString();
			String value = relatorio.get(name).toString();
			System.out.println(key + " " + value);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {	
	}

}
