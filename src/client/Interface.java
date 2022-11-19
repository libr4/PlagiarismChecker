package client;

import java.io.FileNotFoundException;
import java.util.Scanner;
import tarefa.Tarefa;
import client.Test;

public class Interface {	
	public static void main(String[] args) {	
				Scanner scan = new Scanner(System.in);
		 
				System.out.println("Nome do aluno: ");
				String nomeAluno = scan.nextLine();
				System.out.println("Nome da tarefa: ");
				String nomeTarefa = scan.nextLine();
	
				scan.close();
				
				Tarefa tarefa;
				try {
					tarefa = new Tarefa(nomeAluno, nomeTarefa);
				}
				catch (FileNotFoundException e) {
					System.out.println(nomeTarefa + " de " + nomeAluno + " nao encontrada");
					System.out.println(e);
				}
				catch (NullPointerException n) {
					System.out.println(n);
				}
	}

}
