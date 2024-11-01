package exerciciosWhile;
import java.util.Scanner;

public class Exercicio1 {
	
	//***** Exercicio WHILE *****

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 1,menor21 = 0, maior50 = 0;
		
		while (true) {
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if (idade <= 0) {
				break;
				
			}else if(idade < 21){
				menor21++; // Adiciona +1 para a lista menor21
			
			} else if (idade > 50) {
				maior50++; // Adiciona +1 para a lista maior50
				
			}
			
		}
		
		System.out.println(menor21 + " pessoa(s) com idade menor que 21\n");
		
		System.out.println("Foram " + maior50 + " pessoas com idade maior que 50\n");
		
		
		

	}

}
