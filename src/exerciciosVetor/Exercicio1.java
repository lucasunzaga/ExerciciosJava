package exerciciosVetor;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, num;
		
		System.out.println("Digite um numero de 1 a 10");
		num = leia.nextInt();
		boolean achou = false; // inicia o codigo ja prevendo q o numero não esta no vetor
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] == num ){
				achou = true; // se achar o numero no vetor muda o valor para true e printa a posição
				System.out.println("O " + num + " esta na posição " + i);
				
				break;
				
			} else if (achou = false) { // se após percorrer não achar o numero, mantém como false e printa
				System.out.println("Numero não encontrado!");
				
				break;
			}
			
			leia.close();
			
		}

	}

}
