public class WhileApellidoF {
    public void inicialF(int tamaño, char simbolo) {
        System.out.println();
        System.out.println("Inicial F con WHILE");
        int fila = 1;
        while (fila <= tamaño) {
            int col = 1;
            while (col <= tamaño) {
                if (col == 1 || (fila == 1 || fila == tamaño / 2 + 1) && col <= tamaño) {
                    System.out.print(simbolo + " ");
                } else if (fila == tamaño && col <= tamaño) {
                    System.out.print(simbolo + " ");
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
