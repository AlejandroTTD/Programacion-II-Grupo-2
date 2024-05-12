// ForNombreApellidoAF.java
public class ForNombreApellidoAF {
    public void inicialFA(int size, char symbol) {
        System.out.println();
        System.out.println("Iniciales A y F con FOR");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2; col++) { // Aumentamos el ancho para ambas iniciales
                if (col <= size && (row == 1 || row == size / 2 + 1)) {
                    System.out.print(" " + symbol + " ");
                } else if (col > size && (row == 1 || row == size)) {
                    System.out.print(" " + symbol + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
