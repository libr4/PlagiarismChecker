package tarefa;

import java.io.*;
import java.util.*;
import tarefa.*;

public class Tarefa {
	
	public String texto;
	private String diretorio;
	private String aluno;
	private String nomeTarefa;
	private String arquivo;
	public List<String> palavrasComparaveis;
	public List<Frase> frases;
	public List<Paragrafo> paragrafos;
	
	public Tarefa(String idAluno, String nomeTarefa) throws FileNotFoundException {
		this.aluno = idAluno;
		this.nomeTarefa = nomeTarefa;
		this.arquivo = nomeTarefa + ".txt";
		this.diretorio = ("Atividades/" + idAluno + "/" + this.arquivo);
		
		this.texto = this.converterEmString(diretorio);
		this.frases = this.getFrases(texto);
		this.paragrafos = this.getParagrafos(texto);
	}
	
	public String getAlunoId() {
		return this.aluno;
	}
	
	public String getNomeTarefa() {
		return this.nomeTarefa;
	}
	String converterEmString(String directory) throws FileNotFoundException {
		
		String txt = "";
		File file = new File(directory);
		Scanner scan = new Scanner(file);
		
		//le o arquivo linha por linha e as adiciona a txt
		while(scan.hasNextLine()) {
			txt += (scan.nextLine() + '\n');
		}
		
		scan.close();
		//System.out.println(txt);
		
		return txt;
	}
	
	List<Frase> getFrases(String texto) {
		/*partindo do simples pressuposto de que uma frase
		termina com um ponto final*/
		String[] sentences = texto.split("\\.");
		List<Frase> frases = new ArrayList<Frase>();
		
		for(String sentence : sentences) {
			frases.add(new Frase(sentence));
		}
		
		return frases;
	}
	
	List<Paragrafo> getParagrafos(String texto) {
		//partindo do simples pressuposto de que um paragrafo
		//termina com um '\n'
		String[] parags = texto.split("\\n");
		List<Paragrafo> paragrafos = new ArrayList<Paragrafo>();
		
		for(String parag : parags) {
			paragrafos.add(new Paragrafo(parag));
		}
		
		return paragrafos;
	}
	
	public String getDiretorio() {
		return this.diretorio;
	}

}
