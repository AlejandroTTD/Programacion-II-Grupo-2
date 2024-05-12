public class WhileApellidoF {

    public void whileApellido(int tamañoInicial, char signo) {
        System.out.println();
        System.out.println("Inicial F con un While");
        int fil = 1;
        while (fil <= tamañoInicial) {
            int col = 1;
            while (col <= tamañoInicial) {

                if ((fil == 1 || fil == tamañoInicial / 2 + 1) && col <= tamañoInicial) {
                    System.out.print(" " + signo + " ");
                } else {
                    if (col == 1 || col == tamañoInicial) {
                        System.out.print(" " + signo + " ");
                    } else {

                        System.out.print("   ");
                    }
                }
                col++;
            }
            System.out.println();
            fil++;
        }
    }
}
