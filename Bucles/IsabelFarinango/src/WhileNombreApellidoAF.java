public class WhileNombreApellidoAF {
    public void whileNombreApellidoAF(int nivelEsperado, char signo) {
        System.out.println("\nIniciales A ; F con un while");

        int fil = 1;
        while (fil <= nivelEsperado) {
            int col = 1;
            while (col <= nivelEsperado) {
                if (col == 1 || fil == nivelEsperado
                        || (fil == 1 || fil == nivelEsperado / 2 + 1) && (col == 1 || col == nivelEsperado)) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.print("  ");

            col = 1;
            while (col <= nivelEsperado) {
                if ((fil != 1 && fil != nivelEsperado / 2 + 1 && (col == 1 || col == nivelEsperado))
                        || (fil == 1 || fil == nivelEsperado / 2 + 1) && col <= nivelEsperado) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            fil++;
        }
        System.out.println();
    }
}
