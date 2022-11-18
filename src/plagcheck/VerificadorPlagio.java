package plagcheck;

import java.io.*;
import java.util.*;
import tarefa.*;

public class VerificadorPlagio {
	
	String reatorio;
	
	public VerificadorPlagio() {
		
	}
	
	Map<String, Integer> comparaFrases(Frase[] frases, Paragrafo[] paragrafos) {
		//FALTA UM METODO DE COMPARACAO AQUI
		Map<String, Integer> relat = new HashMap<String, Integer>();
		
		return relat;
	}
	
	Map<String, Integer> comparaParagrafos(Tarefa submetida, Tarefa arquivada) {
		//FALTA UM METODO DE COMPARACAO AQUI
		Map<String, Integer> relat = new HashMap<String, Integer>();
		
		return relat;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File one = new File("one.txt");
		File two = new File("two.txt");
		
		Scanner scan1 = new Scanner(one);
		Scanner scan2 = new Scanner(two);
		
		String firstText = "";
		String secondText = "";
		while(scan1.hasNextLine()) {
			firstText += scan1.nextLine() + '\n';
		}
		
		while(scan2.hasNextLine()) {
			secondText += scan2.nextLine() + '\n';
		}
		
		String[] lines1 = firstText.split("\\.");
		
		
		for(String l : lines1) {
			System.out.println(l);
		}
		
		System.out.println(lines1.length);
		
		
	}

}
