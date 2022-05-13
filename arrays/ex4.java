
import java.util.Random;

/*
 * 4 - Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).
 */

public class Main
{
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < matriz.length; ++i) {
			for (int j = 0; j < matriz[i].length; ++j) {
				matriz[i][j] = gerador.nextInt(10);
				System.out.println(matriz[i][j]);
			} 
		}

		int menor = 10;
		int linha = 0, coluna = 0;
		for (int i = 0; i < matriz.length; ++i) {
			for (int j = 0; j < matriz[i].length; ++j) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					linha = i;
					coluna = j;
				}
			} 
		}
		
		System.out.println("Menor: " + menor);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
		
		
	}
}
