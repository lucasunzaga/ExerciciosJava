package exerciciosIF;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valorA;
		
		System.out.println("Digite um numero: ");
		valorA = leia.nextInt();
		
		if (valorA % 2 == 0 && valorA > 0) {
			System.out.println("O numero é par e positivo ");
			
		} else if (valorA % 2 == 0 && valorA < 0) {
			System.out.println("O numero é par e negativo ");
			
		} else if (valorA % 2 != 0 && valorA > 0) {
			System.out.println("O numero é impar e positivo ");
			
		} else {
			System.out.println("O numero é impar e negativo ");
			
		} leia.close();

	}   	
}