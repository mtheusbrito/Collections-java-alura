package br.com.mtheus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	private String nome ;
	private String instrutor; 
	private List<Aula> aulas= new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	

	
	
	
	 
	
public Set<Aluno> getAlunos() {
	return Collections.unmodifiableSet(alunos);
}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

public List<Aula> getAulas() {
	return Collections.unmodifiableList(aulas); 
}

public String getNome() {
	return nome;
}
public String getInstrutor() {
	return instrutor;
}

public Curso(String nome, String instrutor) {
	super();
	this.nome = nome;
	this.instrutor = instrutor;
}

public void adicionaAula(Aula aula) {
	this.aulas.add(aula);
	
	
}

public int getTempoTotal() {
return this.aulas.stream().mapToInt(Aula::getTempo).sum();	
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "[Curso " +nome +","+this.getTempoTotal()+", " +"aulas: "+this.aulas +"]" ;
}

public void matricula(Aluno aluno) {
	this.alunos.add(aluno);
	
	
	
	
}

public boolean estaMatriculado(Aluno aluno3) {
	return this.alunos.contains(aluno3);
	}

public boolean estaMatriculadoEquals(Aluno aluno) {
	return this.alunos.equals(aluno);
}
 
	

}
