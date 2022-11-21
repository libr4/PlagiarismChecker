package client;

import java.io.*;
import java.util.*;
import tarefa.Tarefa;
import plagcheck.VerificadorPlagio;
import client.Test;

public class Interface {	
	public static void main(String[] args) {	
			
				Scanner scan = new Scanner(System.in);
				System.out.println("Nome do aluno: ");
				String nomeAluno = scan.nextLine();
				System.out.println("Nome da tarefa: ");
				String nomeTarefa = scan.nextLine();
				scan.close();
				
				VerificadorPlagio verificador = new VerificadorPlagio();
				Tarefa tarefa;
				
				try {
					tarefa = new Tarefa(nomeAluno, nomeTarefa + ".txt");
					String[] listaAlunos = new File("Exemplos/").list();
					
					List<Tarefa> outrasSubmissoes = new ArrayList<Tarefa>();
					
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

				catch (FileNotFoundException e) {
					System.out.println(nomeTarefa + " de " + nomeAluno + " nao encontrada");
					//System.out.println(e);
				}
				catch (NullPointerException n) {
					System.out.println(n);
				}
	}

}