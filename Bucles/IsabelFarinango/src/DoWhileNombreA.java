public class DoWhileNombreA {
    public void inicialA(int tamaño, char simbolo) {
        System.out.println();
        System.out.println("Inicial A con un do-while");
        int fila = 1;
        do {
            int col = 1;
            do {
                if (col <= tamaño && (fila == 1 || fila == tamaño / 2 + 1)) {
                    System.out.print(" " + simbolo + " ");
                } else if (col > tamaño && (fila == 1 || fila == tamaño)) {
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
