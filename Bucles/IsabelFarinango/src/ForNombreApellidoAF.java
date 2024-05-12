public class ForNombreApellidoAF {
    public void inicialFA(int tamaño, char simbolo) {
        System.out.println();
        System.out.println("Iniciales A ; F con FOR");
        for (int fila = 1; fila <= tamaño; fila++) {
            for (int col = 1; col <= tamaño * 2; col++) {
                if (col <= tamaño) {
                    System.out.print(" " + simbolo + " ");
                } else if (fila == 1 || fila == tamaño / 2 + 1) {
                    if (col == tamaño + 1) {
                        System.out.print("    " + simbolo + "    ");
                    } else {
                        System.out.print("  " + simbolo + "  ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
