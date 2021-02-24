package br.edu.infnet.appsdin.aula01;

import java.util.HashMap;
import java.util.Map;

public class AlunoMapa {

	public static void main(String[] args) {
		
		Map<Integer, String> mapaAluno = new HashMap<Integer, String>();
		
		mapaAluno.put(1, "Davi");
		mapaAluno.put(2, "Maria");
		mapaAluno.put(3, "Caio");
		
		System.out.println(mapaAluno);
		
		mapaAluno.remove(2);
		
		System.out.println(mapaAluno);
		
		mapaAluno.put(3, "editado");
		
		System.out.println(mapaAluno);
		
	}
	
	
	
}
