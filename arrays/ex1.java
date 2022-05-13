
import java.util.Scanner;

/*
* 1 - Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
*/

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] vetor = new int[5];
		for (int i = 0; i < vetor.length; ++i) {
			System.out.println("Digite o numero " + (i + 1));
			vetor[i] = scanner.nextInt();
		}
		
		System.out.println("Ordem Inversa");
		
		for (int i = vetor.length - 1; i >= 0; --i) {
			System.out.println(vetor[i]);
		}
		
	}
}

