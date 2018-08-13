package br.com.mtheus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do java ", "Paulo Silveira");
		javaColecoes.adicionaAula(new Aula("Carros", 55));
		javaColecoes.adicionaAula(new Aula("Gadscxzv", 22));
		javaColecoes.adicionaAula(new Aula("Aula2", 45));
		javaColecoes.adicionaAula(new Aula("cvb", 96));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas(); 
		System.out.println(aulasImutaveis.toString());
		
		List<Aula>  aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		
		System.out.println(aulas.toString());
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}
	
	
}
