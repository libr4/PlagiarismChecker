package client;

import java.io.*;
import java.util.*;
import tarefa.Tarefa;
import plagcheck.VerificadorPlagio;
import client.Test;

public class Interface {	

	public static void main(String[] args) throws FileNotFoundException {	
				
		
				//Scanner scan = new Scanner(System.in);
				Scanner scan = new Scanner(System.in);
				VerificadorPlagio verificador = new VerificadorPlagio();
				//Tarefa tarefa;
				while(true) {
					//String acao = Interface.leEntrada();
					//if (acao == "1") {
						
					System.out.println("O que deseja fazer? ");
					System.out.println("\t 1 - Cadastrar aluno");
					System.out.println("\t 2 - Comparar tarefas individualmente");
					System.out.println("\t 3 - Comparar tarefa de aluno com todas");
					String acao = scan.nextLine();
					
					System.out.println();
					if(acao.equals("1")) {
						//cadastrar aluno
					}
					else if (acao.equals("2")) {
						System.out.println("Nome do aluno: ");
						String nomeAluno = scan.nextLine();
						System.out.println("Nome do aluno 2: ");
						String nomeAlunoDois = scan.nextLine();
						System.out.println("Nome da tarefa: ");
						String nomeTarefa = scan.nextLine();
						Tarefa tarefa = new Tarefa(nomeAluno, nomeTarefa + ".txt");
						Tarefa tarefaDois = new Tarefa(nomeAlunoDois, nomeTarefa + ".txt");
						verificador.comparaIndividual(tarefa, tarefaDois);						
					}
					else if (acao.equals("3")) {
						System.out.println("Nome do aluno: ");
						String nomeAluno = scan.nextLine();
						System.out.println("Nome da tarefa: ");
						String nomeTarefa = scan.nextLine();
						Tarefa tarefa = new Tarefa(nomeAluno, nomeTarefa + ".txt");
						verificador.comparaComTodasSubmissoes(tarefa, nomeTarefa);
					}
					else if(acao.equals("0")) break;
					
				}
			
				//Scanner scan2 = new Scanner(System.in);
				//System.out.println("Nome do aluno: ");
				//String nomeAluno = scan2.nextLine();
			//	System.out.println("Nome do aluno 2: ");
			//	String nomeAlunoDois = scan2.nextLine();
				//String nomeTarefa = scan2.nextLine();
				
				//scan2.close();
				
				Tarefa tarefaDois;
				
				//try {
					//tarefaDois = new Tarefa(nomeAlunoDois, nomeTarefa + ".txt");
					//verificador.comparaComTodasSubmissoes(tarefa, nomeTarefa);
				//}

			//	catch (FileNotFoundException e) {
					//System.out.println(nomeTarefa + " de " + nomeAluno + " nao encontrada");
					//System.out.println(e);
			//	}
			//	catch (NullPointerException n) {
			//		System.out.println(n);
			//	}
	}

}