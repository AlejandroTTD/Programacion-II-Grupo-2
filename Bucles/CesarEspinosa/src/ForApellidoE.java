public class ForApellidoE {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    public void apellidoEFor() {
        System.out.println("FOR APELLIDO E:");
        for (int i = 1; i < n; i++) {
            if (i == 1 || i == n / 2 || i == n - 1) {
                System.out.println(f);
            } else {
                System.out.println(c);
                System.out.println(c);
            }
        }
    }
}
