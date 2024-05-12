public class WhileNombreA {

    public void whileInicialNombre(int tamañoInicial, char signo) {
        System.out.println();
        System.out.println("Inicial A con WHILE");
        int fil = 0;
        while (fil < tamañoInicial) {
            if (fil == tamañoInicial - 1) {
                int col = 1;
                while (col <= tamañoInicial) {
                    System.out.print(signo + " ");
                    col++;
                }
                System.out.println();
            } else {
                System.out.println(signo);
            }
            fil++;
        }
    }
}
