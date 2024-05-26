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

    // metodos SC1
    public void FA_SC1(int terminos) {
        char caracter = '+';
        for (int i = 0; i < terminos; i++) {
            System.out.print(caracter + " ");
            caracter = (caracter == '+') ? '-' : '+';
        }
        System.out.println();
    }
}
