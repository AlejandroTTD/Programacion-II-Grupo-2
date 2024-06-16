public class WhileNombreApellidoCE {
    int altura = 7; // Altura de las letras
    int anchoC = 10; // Ancho de la letra C
    int anchoE = 10; // Ancho de la letra E
    
    int i = 0;
    
    public void nombreapellidoCEwhile() {
        System.out.println("WHILE NOMBRE Y APELLIDO CE:");
        while (i < altura) {
            // Imprimir la letra C
            int j = 0;
            while (j < anchoC) {
                if (i == 0 || i == altura - 1) 
                    if (j != 0 && j != anchoC - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                else if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            }

            // Espacio entre la letra C y E
            System.out.print("  ");

            // Imprimir la letra E
            j = 0;
            while (j < anchoE) {
                if (i == 0 || i == altura - 1 || i == altura / 2)
                    System.out.print("*");
                else if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
