
import java.util.Scanner;

/*
* 2 - Faça um programa que peça uma nota, entre zero e dez. 
* Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
*/

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean valida;
		float nota;
		
		do {
		    
		    System.out.println("Digite uma nota [0, 10]: ");
		    nota = scanner.nextFloat();
		    
		    valida = nota >= 0 && nota <= 10;
		    
		    if (!valida) {
		        System.out.println("Nota Inválida");
		    }
		    
		} while (!valida);
		
	}
}
