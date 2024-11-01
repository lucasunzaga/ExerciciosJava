package exerciciosIF;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valorA, valorB, valorC;
		
		System.out.println("Digite o primeiro valor: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		valorC = leia.nextInt();
		
		boolean maior = (valorA + valorB) > valorC;
		boolean igual =  (valorA + valorB) == valorC;
		
		if (maior){
			System.out.println(" A soma de " + valorA + " com " + valorB + " né maior que " + valorC);		
		} else if (igual){
			System.out.println(" A soma de " + valorA + " com " + valorB + " é igual a " + valorC);
	    } else {
	    	System.out.println(" A soma de " + valorA + " com " + valorB + " é menor que " + valorC); 

	    }

	}   	
}
