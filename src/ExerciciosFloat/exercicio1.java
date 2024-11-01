package ExerciciosFloat;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        float salario = leia.nextFloat();

        System.out.print("Digite o abono: ");
        float abono = leia.nextFloat();

        float novosalario = salario + abono;

        System.out.println("O novo salário é: " + novosalario);

        leia.close();
    }
}