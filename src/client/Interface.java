package client;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import tarefa.Tarefa;
import plagcheck.*;
import client.Test;

public class Interface {	

	public static void main(String[] args) throws FileNotFoundException {	
				
				Scanner scan = new Scanner(System.in);
				//VerificadorPlagio verificador = new VerificadorPlagio();

				while(true) {

					System.out.println("O que deseja fazer? \n");
					System.out.println("\t 0 - Encerrar");
					System.out.println("\t 1 - Cadastrar professor");
					System.out.println("\t 2 - Cadastrar aluno");
					System.out.println("\t 3 - Comparar tarefas individualmente");
					System.out.println("\t 4 - Verificar plágio");
					String acao = scan.nextLine();
					
					System.out.println();
					
					if(acao.equals("1")) {
						System.out.println("1 - Cadastrar professor:");
						System.out.println("Acao ainda nao implementada!");
					}
					else if(acao.equals("2")) {
						System.out.println("2 - Cadastrar aluno:");
						System.out.println("Nome do aluno: ");
						String nomeAluno = scan.nextLine();
						boolean alunoCriado = Submissao.criarAluno(nomeAluno);
						if (alunoCriado) {
							System.out.println("Aluno criado com sucesso");
						}
						else {
							System.out.println("Nao foi possivel criar o aluno");
						}
						
					}
					else if (acao.equals("3")) {
						System.out.println("3 - Comparar tarefas individualmente: ");
						try {
							VerificadorPlagioParagrafos verificador = new VerificadorPlagioParagrafos();
							System.out.println("Nome do aluno: ");
							String nomeAluno = scan.nextLine();
							System.out.println("Nome do aluno 2: ");
							String nomeAlunoDois = scan.nextLine();
							System.out.println("Nome da tarefa: ");
							String nomeTarefa = scan.nextLine();
							Tarefa tarefa = new Tarefa(nomeAluno, nomeTarefa);
							Tarefa tarefaDois = new Tarefa(nomeAlunoDois, nomeTarefa);
							double relatorio = verificador.comparaIndividual(tarefa, tarefaDois);
							System.out.println("Similaridade entre tarefas de " + nomeAluno + " e " + nomeAlunoDois + ": ");
							DecimalFormat df = new DecimalFormat();
							df.setMaximumFractionDigits(2);
							System.out.println(df.format(relatorio) + "%");
						} 
						catch (FileNotFoundException e) {
							System.out.println("Tarefa ou aluno não encontrados");
						}
					}
					else if (acao.equals("4")) {
						System.out.println("4 - Verificar plágio");
						VerificadorPlagioParagrafos v = new VerificadorPlagioParagrafos();
						try {
							System.out.println("Nome do aluno: ");
							String nomeAluno = scan.nextLine();
							System.out.println("Nome da tarefa: ");
							String nomeTarefa = scan.nextLine();
							Tarefa tarefa = new Tarefa(nomeAluno, nomeTarefa);
							v.comparaComTodasSubmissoes(tarefa, nomeTarefa);
						} 
						catch (FileNotFoundException e) {
							System.out.println("Tarefa ou aluno não encontrados");
						}
					}
					else if(acao.equals("0")) {
						System.out.println("Encerrado!");
						break;
					}
				}
	}

}