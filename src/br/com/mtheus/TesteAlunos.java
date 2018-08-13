package br.com.mtheus;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	
	public static void main(String[] args) {
	
		
		Collection<String> alunos = new  HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza"); 
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopez");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		
		for (String aluno : alunos) {
			System.err.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		boolean pauloEstamatriculado = alunos.contains("Paulo Silvera");
		//alunos.remove("Sergio Lopez");
		
		System.out.println(pauloEstamatriculado);
//		System.out.println(alunos);
		
		java.util.List<String> alunosList = new ArrayList<>(alunos);
		
		
		
}
	
}
