public class Main {

public static void main(String[] args) {
		
	/*		 
	 * Operações aritméticas
	 */
		
        int inteiro1 = 10;
        int inteiro2 = 25;
        
        // +
        int soma = inteiro1 + inteiro2;
        System.out.println(soma);
        
        // -
        int subtracao = inteiro1 - inteiro2;
        System.out.println(subtracao);
        
        // *
        int multiplicacao = inteiro1 * inteiro2;
        System.out.println(multiplicacao);
        
        // /
        int divisao = inteiro1 / inteiro2;
        System.out.println(divisao);
        
        // %
        int resto = inteiro2 % inteiro1;
        System.out.println(resto);
        
        // ++ e --
        int posIncremento = inteiro1++;
        int preIncremento = ++inteiro1;
        int posDecremento = inteiro1--;
        int preDecremento = --inteiro1;
        
        System.out.println(posIncremento);
        System.out.println(preDecremento);
        
        /*
	 * Operações de atribuição aritméticas
 	 */
		
	double d1 = 1.0d;
	double d2 = 2.0d;
	d1 += 15.5;
	d1 -= d2;
	d1 *= 2.5d;
	d1 /= 0.67d;
		
	System.out.println(d2);

	int precedencia1 = 352 + 938 / 45 - 5 * 3 / 2;
	int precedencia2 = 352 + (938 / 45) - ((5 * 3) / 2);
	int precedencia3 = (352 + 938) / (45 - 5) * (3 / 2);

	System.out.println(precedencia1);
	System.out.println(precedencia2);
	System.out.println(precedencia3);

	/*
	* OPERADOES RELACIONAIS
	*/
		
	int a = 1;
	int b = 2;
		
	// igualdade
	boolean f1 = a == b;
		
	// desigualdade
	boolean f2 = a != b;
				
	// maior que - maior ou igual que
	boolean f3 = a > b;
	boolean f4 = a >= b;
		
	// menor que - menor ou igual que
	boolean f5 = a < b;
	boolean f6 = a <= b;
		
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	System.out.println(f4);
	System.out.println(f5);
	System.out.println(f6);

	/*
	* OPERADORES LÓGICOS
	*/

	// conjunção lógica
	boolean and = f1 && f2;

	// disjunção inclusiva lógica
	boolean or = f1 || f2;

	// negação lógica
	boolean not = !f1;

	System.out.println(and);
	System.out.println(or);
	System.out.println(not);

}

}