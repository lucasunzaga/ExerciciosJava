package exerciciosDoWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int num, numpositivo = 0;
		
		do {
			System.out.println("Digite um numero : ");
			num = leia.nextInt();
			
			if (num > 0) 
				numpositivo += num; // adiciona o numero digitado na lista "numpositivo" e soma
	
		} while (num != 0);
		System.out.println("A soma dos numeros é: "+ numpositivo);
		
	}

}
