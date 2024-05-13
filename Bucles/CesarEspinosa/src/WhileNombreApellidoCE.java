public class WhileNombreApellidoCE {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    public void nombreapellidoCEwhile() {
        System.out.println("WHILE NOMBRE Y APELLIDO CE:");
        int i = 1;
        while (i < n) {
            System.out.println((i == 1 || i == n - 1) ? f : c);
            i++;    
        }
        while (i < n) {
            System.out.println();
            System.out.println((i == 1 || i == n / 2 || i == n - 1) ? f : c);
            i++;    
        }
    }
}
