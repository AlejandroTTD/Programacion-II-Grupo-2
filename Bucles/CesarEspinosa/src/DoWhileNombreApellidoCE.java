public class DoWhileNombreApellidoCE {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    int i = 1;
    public void nombreApellidoCEDoWhile(){
        System.out.println("DO WHILE NOMBRE Y APELLIDO CE:");
        do {
            System.out.println((i == 1 || i == n - 1) ? f : c);
            i++;    
        } while (i < n);
        System.out.println();
        do {
            System.out.println((i == 1 || i == n / 2 || i == n - 1) ? f : c);
            i++;    
        } while (i < n);
    }
}