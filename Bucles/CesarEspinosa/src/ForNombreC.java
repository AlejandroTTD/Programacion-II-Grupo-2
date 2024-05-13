public class ForNombreC {
    // Tamaño de la letra/Numero de filas
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    public void nombreCFor() {
        System.out.println("FOR NOMBRE C:");
        for (int i = 1; i < n; i++) {
            if (i == 1 || i == n - 1) {
                System.out.println(f);
            } else {
                System.out.println(c);
                System.out.println(c);
            }
        }
    }
}
