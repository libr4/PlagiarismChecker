package plagcheck;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import tarefa.*;
import client.*;
//import java.lang.*;

public class VerificadorPlagioParagrafos implements VerificadorPlagio {
	
	String relatorio;
	
	public VerificadorPlagioParagrafos() {
		  
	}
	
	public double comparaParagrafos(Tarefa submetida, Tarefa arquivada) {
		//FALTA UM METODO DE COMPARACAO AQUI
		//METODO PROVISORIO:
		Map<String, Double> relat = new HashMap<String, Double>();
		double soma = 0;
		
		List<Paragrafo> paragrafosSub = submetida.paragrafos;
		List<Paragrafo> paragrafosArq = arquivada.paragrafos;

		for(int i = 0; i < paragrafosSub.size() && i < paragrafosArq.size(); i++) {

			//if (i >= paragrafosArq.size()) break;
			Set<String> palavrasUnicas = paragrafosSub.get(i).ocorrenciaPalavras.keySet();
			Map<String, Integer> paragAtualSub = paragrafosSub.get(i).ocorrenciaPalavras;
			Map<String, Integer> paragAtualArq = paragrafosArq.get(i).ocorrenciaPalavras;

			int palavrasSemelhantes = 0;
			for(String palavra : palavrasUnicas) {
				if(palavra.length() > 2) {
					/**uma palavra eh comparavel se tiver tamanho maior do que 2
					 * isso ajuda a evitar artigos e preposicoes*/
					int ocorrenciaPalavradoParagArq = (paragAtualArq.get(palavra) == null ? 0 : paragAtualArq.get(palavra));
					palavrasSemelhantes += Math.min(paragAtualSub.get(palavra), ocorrenciaPalavradoParagArq);
				}
			}
			
			/**palavrasSemelhantes eh dividido 
			 * pelo tamanho do menor paragrafo da comparacao*/
			int tamMenorParag = Math.min(paragrafosSub.get(i).totalDePalavrasComparaveis, paragrafosArq.get(i).totalDePalavrasComparaveis);
	
			double taxaSemelhanca = (double)palavrasSemelhantes/tamMenorParag;
			soma += taxaSemelhanca;
			relat.put("Paragrafo " + (i + 1) + " : ", taxaSemelhanca);
		}
		int menorQtdParags = Math.min(paragrafosSub.size(), paragrafosArq.size());
		assert menorQtdParags > 0: "Divisao por 0!";
		double result = soma / menorQtdParags;
	
		return result*100;
	}
	
	public void comparaComTodasSubmissoes(Tarefa tarefa, String nomeTarefa) throws FileNotFoundException {
	
		VerificadorPlagioParagrafos verificador = new VerificadorPlagioParagrafos();
		Submissao submissao = new Submissao();
		List<Tarefa> outrasSubmissoes = submissao.getTodasTarefasOutros(tarefa);
	
		assert(outrasSubmissoes.size() > 0);
		for(Tarefa t : outrasSubmissoes) {
			double relatorio = verificador.comparaParagrafos(tarefa, t);
		
			System.out.println("Similaridade com " + t.getAlunoId());
	
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(2);
			System.out.println(df.format(relatorio) + "%");	
		}
		
	}
	
	public double comparaIndividual(Tarefa tarefa1, Tarefa tarefa2) {

		VerificadorPlagioParagrafos verificador = new VerificadorPlagioParagrafos();
		double relatorio = verificador.comparaParagrafos(tarefa1, tarefa2);

		return relatorio;
	}

}
