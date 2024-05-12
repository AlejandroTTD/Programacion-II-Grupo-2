public class WhileNombreApellidoAF {
    public void inicialFA(int tamaño, char simbolo) {
        System.out.println();
        System.out.println("Iniciales A y F con un while");
        int fila = 1;
        while (fila <= tamaño) {
            int col = 1;
            while (col <= tamaño * 2) {
                if (col <= tamaño && (fila == 1 || fila == tamaño / 2 + 1)) {
                    System.out.print(" " + simbolo + " ");
                } else if (col > tamaño && (fila == 1 || fila == tamaño)) {
                    System.out.print(" " + simbolo + " ");
                } else {
                    System.out.print("   ");
                }
                col++;
            }
            System.out.println();
            fila++;
        }
        System.out.println();
    }
}
