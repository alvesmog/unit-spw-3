package modulo3_aula4;

import java.util.Scanner;

public class Exercicio2_concatenar {

	public static void concatenar(Scanner s) {

		System.out.println("Digite pelo menos 8 caracteres...");

		String input2 = s.next();

		if (input2.length() < 8) {

			boolean sairDoLoop = false;

			while (sairDoLoop == false) {
				System.out.println("Digite ao menos 8 caracteres!");
				input2 = s.next();

				if (input2.length() >= 8) {
					System.out.println(input2.substring(0, 2) + input2.substring(input2.length()-2, input2.length()));
					sairDoLoop = true;
				}

			}

		} else {
			System.out.println(input2.substring(0, 2) + input2.substring(input2.length()-2, input2.length()));
		}

	}

}
