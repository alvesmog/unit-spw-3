package modulo3_aula4;

import java.util.Scanner;

public class ExemploString {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("[Exercício 1]");
		System.out.println("");
	
		String nome = "GuilhermeAugusto";
		String subNome1 = nome.substring(4);
		String subNome2 = nome.substring(2, 6);
		
		System.out.println("Nome: " + nome);
		System.out.println("Substring apenas com início: " + subNome1);
		System.out.println("Substring com início e fim: " + subNome2);
		
		if (nome.endsWith("Guilherme")) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("False");
		}
		
		System.out.println("");
		System.out.println("[Exercício 2]");
		System.out.println("");
		
		Exercicio1_caracteresDigitados.comprimento(s);
		
		System.out.println("");
		System.out.println("[Exercício 3]");
		System.out.println("");
		
		Exercicio2_concatenar.concatenar(s);
				
		
	}

}
