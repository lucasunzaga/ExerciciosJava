package ExerciciosFloat;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = leia.nextFloat();
		

		System.out.println("Digite a segunda nota: ");
		float nota2 = leia.nextFloat();
		

		System.out.println("Digite a terceira nota: ");
		float nota3 = leia.nextFloat();
		

		System.out.println("Digite a quarta nota: ");
		float nota4 = leia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média das notas é: "+ media);
		
		leia.close();
		// TODO Auto-generated method stub

	}

}
