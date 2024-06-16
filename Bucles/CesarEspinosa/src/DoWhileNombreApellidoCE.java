public class DoWhileNombreApellidoCE {
    int altura = 7; // Altura de las letras
    int anchoC = 10;  // Ancho de la letra C
    int anchoE = 10;  // Ancho de la letra E
    
    int i = 0;
    public void nombreApellidoCEDoWhile(){
        System.out.println("WHILE NOMBRE Y APELLIDO CE:");
        do {
            // Imprimir la letra C
            int j = 0;
            do {
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
                j++;
            } while (j < anchoC);

            // Espacio entre la letra C y E
            System.out.print("  "); 

            // Imprimir la letra E
            j = 0;
            do {
                if (i == 0 || i == altura - 1 || i == altura / 2) {
                    System.out.print("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < anchoE);

            System.out.println();
            i++;
        } while (i < altura);
    }
}