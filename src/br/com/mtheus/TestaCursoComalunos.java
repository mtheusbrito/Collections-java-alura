package br.com.mtheus;

import java.util.Collection;
import java.util.HashSet;

public class TestaCursoComalunos {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do java ", "Paulo Silveira");
		javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayList", 55));
		javaColecoes.adicionaAula(new Aula("Criando uma Aula", 22));
		javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 45));

		Aluno aluno = new Aluno("Rodrigo Turini", 321545);
		Aluno aluno2 = new Aluno("Guilherme Silveira", 52222);
		Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);
		javaColecoes.matricula(aluno);
		javaColecoes.matricula(aluno2);
		javaColecoes.matricula(aluno3);

		System.out.println("Todos os aluos matriculados neste curso: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println("Aluno" + a);

			

		});
		
		
		System.out.println(javaColecoes.estaMatriculado(aluno3));

		
		Aluno aluno4 = new Aluno( "Rodrigo Turini", 321545);

		System.out.println(javaColecoes.estaMatriculado(aluno4));
		
		
		System.out.println(aluno.equals(aluno4));
		

		
	}
}
