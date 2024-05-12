public class ForApellidoF {
    public void inicialApellido(int alturaInicial, char signo) {
        System.out.println();
        System.out.println("Inicial F con FOR");
        for (int nivel = 1; nivel <= alturaInicial; nivel++) {
            if (nivel == 1 || nivel == alturaInicial / 2 + 1) {
                System.out.println(" " + signo + " " + signo);
            } else {
                System.out.println(" " + signo);
            }
        }
    }
}
