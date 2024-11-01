package exerciciosFor;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int cont, num1, num2;
		
		System.out.println("Digite o 1° numero: ");
		num1 = leia.nextInt();
		System.out.println("Digite o 2° numero: ");
		num2 = leia.nextInt();
		
		if (num1 >= num2) {
			System.out.println("Intervalo invalido! O primeiro numero deve ser menor e diferente do segundo.");
			return;
		}
		
		for (cont = num1; cont <=num2; cont++) {
			if (cont % 3 == 0 && cont % 5 == 0){
				System.out.println(cont);
			}
			
		}
			

	}

}
