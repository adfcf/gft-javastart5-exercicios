
import java.util.Scanner;

/*
* 1 - Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. 
* (Pare o programa inserindo o valor 0 no campo nome)
*/

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		
		do {
		    
		    System.out.println("Nome: ");
		    nome = scanner.next();
		    
		    if (nome.equals("0"))
		        break;
		    
		    System.out.println("Idade: ");
		    idade = scanner.nextInt();
		    
		} while (!nome.equals("0"));
		
	}
}
