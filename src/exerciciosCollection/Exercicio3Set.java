package exerciciosCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3Set {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int num; 
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o " + i + "° numero: ");
			num = leia.nextInt();
			nums.add(num);
		} 
		
		Iterator<Integer> iNumeros = nums.iterator();
		
		System.out.println("\nOs numeros inseridos são: \n");
		
		while(iNumeros.hasNext()) {
			
			System.out.println(iNumeros.next());
		}
			
			
		
	}

}
