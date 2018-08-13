package br.com.mtheus;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do java ", "Paulo Silveira");
		
		javaColecoes.adicionaAula(new Aula("Trabalhando com array lists",10 ));
		
		
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(javaColecoes.getAulas());
	}
}
