
import java.util.Scanner;

/*
* 6 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
*/

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite um inteiro (nao negativo): ");
		int n = scanner.nextInt();
		
		int fatorial = 1;
		for (int i = 1; i <= n; ++i) {
			fatorial *= i;
		}
		
		System.out.println("" + n + "!" + " = " + fatorial);
		
	}
}
