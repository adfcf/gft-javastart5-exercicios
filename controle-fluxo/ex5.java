
import java.util.Scanner;

/*
* 5 - Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
* O usuário deve informar de qual numero ele deseja ver a tabuada. 
* A saída deve ser conforme o exemplo abaixo:
*/

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual numero: ");
		int numero = scanner.nextInt();
		
		for (int i = 1; i <= 10; ++i) {
			System.out.println("" + numero + " x " + i + " = " + (numero * i));
		}
		
	}
}

