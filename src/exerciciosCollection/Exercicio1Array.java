package exerciciosCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1Array {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a °" + i +  " cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		Iterator<String> iCores = cores.iterator();
		
		System.out.println("\nAs cores inseridas são: \n");
		
		while(iCores.hasNext()) {
			
			System.out.println(iCores.next());
			
			
		}
		
		System.out.println(" ");
		
		Collections.sort(cores);
		
		Iterator<String> iCores2 = cores.iterator();
		
		System.out.println("A cores inseridas em ordem: \n");
		
		while(iCores2.hasNext()) {
			
			
			
			System.out.println(iCores2.next());
		}
		
			
		
		
		
		
	}

}
