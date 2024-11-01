package ExerciciosFloat;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salario bruto: ");
		float salariobruto = leia.nextFloat();
		

		System.out.println("Digite o salario noturno: ");
		float salarionoturno = leia.nextFloat();
		

		System.out.println("Digite a digite as horas extras feitas: ");
		float horaextra = leia.nextFloat();
		

		System.out.println("Digite o desconto: ");
		float desc = leia.nextFloat();
		
		float salarioliquido = salariobruto  + salarionoturno  + (horaextra * 5) - desc;
		
		System.out.println("O alario liquido será: " + salarioliquido );
		
		leia.close();

	}

}
