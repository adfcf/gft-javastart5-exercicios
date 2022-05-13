public class Main
{
public static void main(String[] args) {

        /*
        * ESTRUTURAS CONDICIONAIS DE CONTROLE DE FLUXO 
        */
        
        boolean condicao = true;
        boolean outraCondicao = false;
        
        // Estrutura condicional simples (if)
        if (condicao) {
        	// ...
        }
		
	// Estrutura condicional composta (if-else)
	if (condicao) {
		// se verdadeiro
	} else {
		// se falso
	}
		
	// Estrutura condicional composta encadeada (if-else-if)
	if (condicao) {
		// se condicao
	} else if (outraCondicao) {
		// se outraCondicao
	} else {
		// se tudo falso
	}

	// Estrutura condicional de seleção (switch)
	int caso = 2;
	switch(caso) {
	case 1:
	// ...
	break;
	case 2:
	// ...
	break;
	case 3:
	// ...
	break;
	default:
	// ...
	}
		
}
}
