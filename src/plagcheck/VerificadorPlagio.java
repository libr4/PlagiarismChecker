package plagcheck;

import java.io.*;
import java.util.*;
import tarefa.*;
import client.*;
//import java.lang.*;

public interface VerificadorPlagio {
	
	public void comparaComTodasSubmissoes(Tarefa tarefa, String nomeTarefa) throws FileNotFoundException;
	
	public double comparaIndividual(Tarefa tarefa1, Tarefa tarefa2);

}
