public class FarinangoAlegria {
    
    private String FANombre;

    // metodos S12
    public void FA_S12_For(int terminos) {
        int valor = 2;
        for (int i = 1; i <= terminos; i++) {
            System.out.print(valor + " ");
            valor += (i + 1) * 2;
        }
        System.out.println();
    }
    public void FA_S12_While(int terminos){
        int valor = 2; 
        int i = 1; 
        while (i <= terminos){
            System.out.print(valor + " ");
            valor += (i + 1) * 2; 
            i++; 
        }
        System.out.println();
    }
    public void FA_S12_DoWhile(int terminos){
        int valor = 2; 
        int i = 1; 
            do {
                System.out.print(valor + " ");
                valor += (i + 1) * 2; 
                i++; 
            } while (i <= terminos); 
            System.out.println();
    }
    // metodos SC
    public void FA_SC1_For(int terminos){
        char caracter = '+'; 
        for (int i = 0; i < terminos; i++){
            System.out.print(caracter + " ");
            caracter = (caracter == '+') ? '-' : '+'; 
        }
        System.out.println();
    }
    public void FA_SC1_While(int terminos){
        char caracter = '+';
        int i = 0; 
        while (i<terminos) {
            System.out.print(caracter + " ");
            caracter = (caracter == '+') ? '-' : '+'; 
            i++; 
        }
        System.out.println();
    }
    public void FA_SC1_DoWhile(int terminos){
        char caracter = '+'; 
        int i = 0; 
        do {
            System.out.print(caracter + " ");
            caracter = (caracter == '+') ? '-' : '+'; 
            i++; 
        } while (i<terminos); 
        System.out.println();
    }
}
