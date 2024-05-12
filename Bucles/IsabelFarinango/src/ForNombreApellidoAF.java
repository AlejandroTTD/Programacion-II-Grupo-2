public class ForNombreApellidoAF {
    public void forNombreApellido(int nivelEsperado, String signo) {
        System.out.println();
        System.out.println("Las iniciales A ; F con FOR");
        for (int fil = 1; fil <= nivelEsperado; fil++) {
            if (fil == 1 || fil == nivelEsperado / 2 + 1) {
                System.out.println(signo + " " + signo);
            } else {
                System.out.println(signo);
            }
        }
    }
}
