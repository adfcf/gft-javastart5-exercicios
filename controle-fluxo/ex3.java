
import java.util.Scanner;

/*
 * 2 - Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;		
		int maior = -1;
		
		float soma = 0.0f;
		
		for (int i = 0; i < 5; ++i) {
			
			System.out.println("Digite um numero: ");
			numero = scanner.nextFloat();
			
			if (numero > maior)
				maior = numero;
		
			soma += numero;
			
		}
		
		float media = soma / 5;
		
		System.out.println("Maior: " + maior);
		System.out.println("Media: " + media);
		
	}
}
