public class Main {

    // Calcula o valor total de um empréstimo a partir de um valorInicial
    // Taxa de juros e número de parcelas é fixado
    static float calcularMontante(float valorInicial) {
        
        final float TAXA = 0.1f;
        final int PARCELAS = 12;
        
        return valorInicial * (1 + (PARCELAS * TAXA));
        
    }

    // Imprime uma mensagem dependendo da hora do dia [0-24]
    static void mostrarMensagem(int horaDia) {
        if (horaDia >= 0 && horaDia < 12) {
            System.out.println("Bom dia!");
        } else if (horaDia < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }

    /*
     * Delegações de operações aritméticas com funções 
     */
    static int somar(int a, int b) {
        return a + b;
    }
    static int subtrair(int a, int b) {
        return a - b;
    }
    static int multiplicar(int a, int b) {
        return a * b;
    }
    static int dividir(int a, int b) {
        return a / b;
    }

    // Exemplo de uso
	public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int o = 0;
        
        o = somar(a, b);
        System.out.println("Soma = " + o);
        o = subtrair(a, b);
        System.out.println("Diferença = " + o);
        o = multiplicar(a, b);
        System.out.println("Produto = " + o);
        o = dividir(a, b);
        System.out.println("Quociente = " + o);
        
        int horario = 6;
        System.out.print("Horário = " + horario + " -> ");
        mostrarMensagem(horario);
        horario = 13;
        System.out.print("Horário = " + horario + " -> ");
        mostrarMensagem(horario);
        horario = 20;
        System.out.print("Horário = " + horario + " -> ");
        mostrarMensagem(horario);

        float valor = 1200;
        float montante = calcularMontante(valor);
        System.out.println("Valor total = " + montante);


	}
}