public class ForNombreApellidoCE {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    public void nombreApellidoCEFor() {
        System.out.println("FOR NOMBRE Y APELLIDO CE:");
        for (int i = 1; i < n; i++) {
            System.out.println((i == 1 || i == n - 1) ? f : c);
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            System.out.println((i == 1 || i == n / 2 || i == n - 1) ? f : c);
        }

    }
}
