package ExerciciosFloat;

import java.util.Scanner;

public class exercicio4 {
	

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		float num1 = leia.nextFloat();
		

		System.out.println("Digite o segundo numero: ");
		float num2 = leia.nextFloat();
		

		System.out.println("Digite a terceiro numero: ");
		float num3 = leia.nextFloat();
		

		System.out.println("Digite a quarto numero: ");
		float num4 = leia.nextFloat();
		
		float dif = (num1 * num2) - (num3 * num4);
		
		System.out.println("A diferença é: " + dif);
		
		leia.close();

	}

}
