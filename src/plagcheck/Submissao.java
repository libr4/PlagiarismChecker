package plagcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import tarefa.*;

import tarefa.Tarefa;

public class Submissao {
	
	public Submissao() {
		
	}
	/** retorna uma lista com todas
	 * as tarefas arquivadas, exceto a passada como argumento 
	 * */
	protected List<Tarefa> getTodasTarefasOutros(Tarefa excecao) throws FileNotFoundException {
		String idAluno = excecao.getAlunoId();
		String[] listaAlunos = new File("Atividades/").list();
		List<Tarefa> outrasSubmissoes = new ArrayList<Tarefa>();
		String nomeTarefa = excecao.getNomeTarefa();
		for(String aluno : listaAlunos) {
			/**
			 * adiciona a lista apenas
			 * todas as tarefas EXCETO a tarefa do aluno passada
			 * como argumento do metodo */
			if(!aluno.equals(idAluno)) {
				outrasSubmissoes.add(new Tarefa(aluno, nomeTarefa));				
			}
		}
		
		return outrasSubmissoes;
	}
	
	/** Cria uma pasta com o nome do aluno
	 * retorna falso se a pasta do aluno ja existia
	 * ou seja, o aluno ja havia sido cadastrado
	 * @param nomeAluno
	 * @return boolean
	 */
	public static boolean criarAluno(String nomeAluno) {
		File novaPastaAluno = new File("Atividades" + "/" + nomeAluno+"/");
		if (!novaPastaAluno.exists()) {
		    novaPastaAluno.mkdirs();
		    return true;
		}
		else {
			return false;
		}
	}

}
