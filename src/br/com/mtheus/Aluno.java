package br.com.mtheus;

public class Aluno {

	public String nome;
	public int matricula;

	public Aluno(String nome, int matricula) {
		if (nome == null) {
			throw new NullPointerException("nome não pode ser null");
		}
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return this.nome;
	}
	
	//sempre que se sobreescreve o metodo equals é obrigatoriamente reescrever o metodo hashCode.
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nome.charAt(0);
		
	}

}
