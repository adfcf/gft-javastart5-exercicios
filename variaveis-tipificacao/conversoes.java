public class Main {

public static void main(String[] args) {
		
	/*
	* Conversões
	*/
		
        // Upcast (implícito)
        int i = 100;
        long l = i;
        float f = 2.5f;
        double d = f;
        
        // Downcast (explícito)
        l = 5555;
        i = (int) l;
        d = 2.319294983928304932423423423424;
        f = (float) d; // potencial truncamento

}

}