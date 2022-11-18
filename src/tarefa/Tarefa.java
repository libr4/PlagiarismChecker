package tarefa;

import java.io.*;
import java.util.*;
import tarefa.Frase;
import tarefa.Paragrafo;

public class Tarefa {
	
	public String texto;
	public String directory;
	public Tarefa(String path) throws FileNotFoundException {
		this.directory = path;
		this.texto = converterEmString(directory);
		
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
		//partindo do pressuposto de que um paragrafo
		//termina com um '\n'
		String[] parags = texto.split("\\n");
		List<Paragrafo> paragrafos = new ArrayList<Paragrafo>();
		
		for(String parag : parags) {
			paragrafos.add(new Paragrafo(parag));
		}
		return paragrafos;
	}

}
