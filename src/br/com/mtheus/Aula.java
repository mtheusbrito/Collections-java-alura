package br.com.mtheus;

import java.util.Comparator;

public class Aula implements Comparable<Aula>{
	
private String titulo ; 
private int tempo;



public Aula(String titulo, int tempo) {
	super();
	this.titulo = titulo;
	this.tempo = tempo;
}

public String getTitulo() {
	return titulo;
}

public int getTempo() {
	return tempo;
}



@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aula: " +this.titulo+","+ this.tempo + "minuto ]";
	}

@Override
public int compareTo(Aula outraAula) {

	return this.titulo.compareTo(outraAula.titulo);
	// TODO Auto-generated method stub
	
}
}
