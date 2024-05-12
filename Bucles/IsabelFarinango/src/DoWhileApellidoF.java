public class DoWhileApellidoF {
    public void inicialF(int tamaño, char simbolo) {
        System.out.println();
        System.out.println("Inicial F con DO-WHILE");
        int fila = 1;
        do {
            int col = 1;
            do {
                if (col == 1 || (fila == 1 || fila == tamaño / 2 + 1) && col <= tamaño) {
                    System.out.print(simbolo + " ");
                } else {
                    System.out.print("  ");
                }
                col++;
            } while (col <= tamaño);
            System.out.println();
            fila++;
        } while (fila <= tamaño);
        System.out.println();
    }
}
