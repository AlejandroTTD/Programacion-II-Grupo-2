public class ForNombreApellidoAF {
    public void forNombreApellido(int nivelEsperado, String signo) {
        System.out.println();
        System.out.println("Las iniciales A ; F con FOR");
        for (int fil = 1; fil <= nivelEsperado; fil++) {
            for (int col = 1; col <= nivelEsperado; col++) {
                if (col == 1 || fil == nivelEsperado) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int col = 1; col <= nivelEsperado; col++) {
                if ((fil == 1 || fil == nivelEsperado / 2 + 1) && col <= nivelEsperado) {
                    System.out.print(signo + " ");
                } else {
                    if (fil != 1 && fil != nivelEsperado / 2 + 1 && (col == 1 || col == nivelEsperado)) {
                        System.out.print(signo + " ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
