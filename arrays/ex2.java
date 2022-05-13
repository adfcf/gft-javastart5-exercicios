
import java.util.Scanner;

/*
 * 2 - Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. 
 * Imprima as consoantes.
 */
 
public class Main
{
    
    public static boolean ehConsoante(char letra) {
        
        boolean consoante = true;
        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
        
        letra = Character.toUpperCase(letra);
        
        for (char vogal : vogais) {
		if (letra == vogal) {
			consoante = false;
			break;
		}
	}
		
	return consoante;
        
    }
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		char[] vetor = new char[6];
    		int numeroConsoantes = 0;
    	
		for (int i = 0; i < vetor.length; ++i) {
	
			System.out.println("Digite uma letra: ");
			vetor[i] = scanner.next().charAt(0);

			if (ehConsoante(vetor[i])) {
				++numeroConsoantes;
			}
			
		}
		
		System.out.println("Numero de Consoantes: " + numeroConsoantes);
		for (char letra : vetor) {
		    if (ehConsoante(letra)) {
		        System.out.print(letra + " ");
		    }
		}
		
	}
}
