public class Main {

    /* 
     * Sobrecarga de métodos
     */
	
    // Area do quadrado
    static float area(float lado) {
        return lado * lado;
    }

    // Area do retangulo
    static float area(float base, float altura) {
        return base * altura;
    }
    
    // Area do trapezio
    static float area(float baseMenor, float baseMaior, float altura) {
        return altura * ((baseMenor + baseMaior) / 2);
    }

    // Exemplo de uso
	public static void main(String[] args) {

        // quadrado
        int lado = 4;
        System.out.println("Area do quadrado (l = 4): " + area(lado));
        
        // retangulo
        int a = 5;
        int b = 8;
        System.out.println("Area do retangulo (a = 5, b = 8): " + area(a, b));
        
        // trapezio
        int b1 = 5;
        int b2 = 8;
        int h = 10;
        System.out.println("Area do trapezio (b1 = 5, b2 = 8, h = 10): " + area(b1, b2, h));

	}
}
