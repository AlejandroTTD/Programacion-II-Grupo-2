public class ForApellidoF {

    public void inicialApellido(int alturaInicial, char signo) {
        System.out.println();
        System.out.println("Inicial F con FOR");
        for (int nivel = 1; nivel <= alturaInicial; nivel++) {
            for (int columna = 1; columna <= alturaInicial; columna++) {
                if ((nivel == 1 || nivel == alturaInicial / 2 + 1) && columna <= alturaInicial) {
                    System.out.print(" " + signo + " ");
                } else {
                    if (columna == 1 || columna == alturaInicial) {
                        System.out.print(" " + signo + " ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

}
