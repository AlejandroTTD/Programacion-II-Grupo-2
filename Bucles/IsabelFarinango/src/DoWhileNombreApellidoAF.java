public class DoWhileNombreApellidoAF {
    public void inicialFA(int tamaño, char simbolo) {
        System.out.println();
        System.out.println("Iniciales A y F con DO-WHILE");
        int fila = 1;
        do {
            int col = 1;
            do {
                if (col == 1 || (fila == 1 || fila == tamaño / 2 + 1)) {
                    System.out.print(" " + simbolo + " ");
                } else if (fila == tamaño && col <= tamaño) {
                    System.out.print(" " + simbolo + " ");
                } else {
                    System.out.print("   ");
                }
                col++;
            } while (col <= tamaño * 2);
            System.out.println();
            fila++;
        } while (fila <= tamaño);
        System.out.println();
    }
}
