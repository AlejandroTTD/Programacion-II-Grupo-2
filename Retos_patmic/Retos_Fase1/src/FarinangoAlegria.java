public class FarinangoAlegria {
    // Variables de clase
    private String FANombre;

    // Métodos para Serie numérica S12
    public void FAS1_S12_For(int terminos) {
        int valor = 2;
        for (int i = 1; i <= terminos; i++) {
            System.out.print(valor + " ");
            valor += (i + 1) * 2;
        }
        System.out.println();
    }
    public void FAS1_S12_While(int terminos){
        int valor = 2; 
        int i = 1; 
        while (i <= terminos){
            System.out.println(valor + " ");
            valor += (i + 1) * 2; 
            i++; 
        }
        System.out.println();
    }
}
