public class FarinangoAlegria {
    
    private String FANombre;

    // metodos S12
    public void FA_S12(int terminos) {
        int valor = 2;
        for (int i = 1; i <= terminos; i++) {
            System.out.print(valor + " ");
            valor += (i + 1) * 2;
        }
        System.out.println();
    }

    // metodos SC
    public void FA_SC1(int terminos) {
        char caracter = '+';
        for (int i = 0; i < terminos; i++) {
            System.out.print(caracter + " ");
            caracter = (caracter == '+') ? '-' : '+';
        }
        System.out.println();
    }

    public void FA_SC2(int terminos){
        int length = 1; 
        for(int i = 0; i<terminos; i++){
            for(int j = 0; j<length; j++){
                System.out.print('+');
            }
            System.out.print(" ");
            length += i + 1; 
        }
        System.out.println();
    }

    public void FA_SC3(int terminos){
        int length = 2; 
        for(int i = 0; i < terminos; i++){
            for(int j = 0; j < length; j++){
                System.out.print('+');
            }
            System.out.print(" ");
            length += 2 * i +1; 
        }
        System.out.println();
    }

    public void FA_SC4(int terminos) {
        char[] simbolos = {'+', '-', '*', '/'};
        for (int i = 0; i < terminos; i++) {
            System.out.print(simbolos[i % simbolos.length] + " ");
        }
        System.out.println();
    }

    public void FA_SC5(int terminos) {
        char[] simbolos = {'\\', '|', '/', '-'};
        for (int i = 0; i < terminos; i++) {
            System.out.print(simbolos[i % simbolos.length] + " ");
        }
        System.out.println();
    }

















}
