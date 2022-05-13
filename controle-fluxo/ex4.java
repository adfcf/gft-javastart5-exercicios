
import java.util.Scanner;

/*
* 4 - Faça um programa que peça N números inteiros. 
* Calcule e mostre a quantidade de números pares e a quantidade de números impares.
*/

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int entrada = 0;
		int quantidadePares = 0, quantidadeImpares = 0;
		
		System.out.println("Quantos numeros: ");
		int quantidade = scanner.nextInt();
		
		for (int i = 0; i < quantidade; ++i) {
				
			System.out.println("Digite um numero: ");
			entrada = scanner.nextInt();
			
			if ((entrada % 2) == 0)
				++quantidadePares;
			else
				++quantidadeImpares;
			
			
		}
		
		System.out.println("Pares: " + quantidadePares);
		System.out.println("Impares: " + quantidadeImpares);
		
	}
}
