package br.edu.infnet.appsdin.aula01;

import java.util.ArrayList;
import java.util.List;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		
		String[] nomes = { "Davi", "Maria", "Caio", "Elberth Moraes"};
		String[] emails = {"davicm98@hotmail.com", "caiocm93@hotmail.com", "mariaclarabranca@hotmail.com", "elberth@moraes.com"};
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int i = 0; i < nomes.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			alunos.add(aluno);
				
		}
		
		System.out.println(alunos.size());
		for(Aluno item : alunos) {
			System.out.println(item);
		}	
	}
}
