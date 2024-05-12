public class ForApellidoF {
    public void inicialF(int tamaño, char simbolo) {
        System.out.println();
        System.out.println("Inicial F con un for");
        for (int fila = 1; fila <= tamaño; fila++) {
            for (int col = 1; col <= tamaño; col++) {
                if (col == 1 || (fila == 1 || fila == tamaño / 2 + 1) && col <= tamaño) {
                    System.out.print(simbolo + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}