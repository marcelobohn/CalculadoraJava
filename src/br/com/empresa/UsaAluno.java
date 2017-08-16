package br.com.empresa;

import br.com.empresa.lib.Aluno;

public class UsaAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Marcelo");		
		System.out.println("Aluno 1: " + aluno1.getNome());
		
		Aluno aluno2 = new Aluno("Carlos");
		System.out.println("Aluno 2: " + aluno2.getNome());
		
	}

}
