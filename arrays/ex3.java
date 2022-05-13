
import java.util.Random;

/*
 *  3 - Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.
 */

public class Main
{
	public static void main(String[] args) {
		
		Random gerador = new Random();
		int[] numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; ++i) {
			numerosAleatorios[i] = gerador.nextInt(100);
		}

		for (int i = 0; i < numerosAleatorios.length; ++i) {
			System.out.println("Numeros " + numerosAleatorios[i] + " e " + (numerosAleatorios[i] + 1));
		}
		
	}
}
