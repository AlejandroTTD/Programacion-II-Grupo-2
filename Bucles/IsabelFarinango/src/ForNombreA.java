public class ForNombreA {
    public void inicialNombre(int tamañoInicial, char simbolo_A_Imprimir) {
        System.out.println();
        System.out.println("La inicial A con FOR");
        for (int i = 1; i <= tamañoInicial; i++) {
            if (i == tamañoInicial / 2 + 1) {
                for (int j = 1; j <= tamañoInicial / 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(simbolo_A_Imprimir);
            } else {
                for (int j = 1; j <= tamañoInicial / 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(simbolo_A_Imprimir + simbolo_A_Imprimir);
            }
        }
    }
}
