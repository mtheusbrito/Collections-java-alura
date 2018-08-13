package br.com.mtheus;

import java.util.ArrayList;
import java.util.Collections;

public class TestendoListas {

	
	
	public static void main(String[] args) {
		String aula1 = "Conhecendi mais de listas";
		String aula2 = "Modelando a classe Alula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula: "+ aula);
		
		
		});
		//metodo de ordenacao alfabetica 
		
		Collections.sort(aulas);
		
	}
}
