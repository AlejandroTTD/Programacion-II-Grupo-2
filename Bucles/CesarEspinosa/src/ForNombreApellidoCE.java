public class ForNombreApellidoCE {
    int altura = 7; // Altura de las letras
    int anchoC = 10;  // Ancho de la letra C
    int anchoE = 10;  // Ancho de la letra E
    public void nombreApellidoCEFor() {
        System.out.println("FOR NOMBRE Y APELLIDO CE:");
        for (int i = 0; i < altura; i++) {
            // Imprimir la letra C
            for (int j = 0; j < anchoC; j++) {
                if (i == 0 || i == altura - 1) {
                    if (j != 0 && j != anchoC - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Espacio entre la letra C y E
            System.out.print("  "); 

            // Imprimir la letra E
            for (int j = 0; j < anchoE; j++) {
                if (i == 0 || i == altura - 1 || i == altura / 2) {
                    System.out.print("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
