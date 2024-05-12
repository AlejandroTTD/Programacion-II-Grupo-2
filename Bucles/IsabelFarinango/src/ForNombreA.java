public class ForNombreA {

    public void inicialNombre(int tamañoInicial, char simbolo_A_Imprimir) {
        System.out.println();
        System.out.println("La inicial A con FOR");

        for (int i = 1; i <= tamañoInicial; i++) {
            if (i == tamañoInicial) {
                for (int j = 1; j <= tamañoInicial - 2; j++) {
                    System.out.print(simbolo_A_Imprimir + "  ");
                }
            }
            System.out.println(simbolo_A_Imprimir);
        }

    }

}
