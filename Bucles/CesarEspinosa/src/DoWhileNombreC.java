public class DoWhileNombreC {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    int i = 1;
    public void nombreCDoWhile(){
        System.out.println("DO WHILE NOMBRE C:");
        do {
            if (i == 1 || i == n - 1) {
                System.out.println(f);
            }else {
                System.out.println(c);
                System.out.println(c);
            }
            i++;
        } while (i < n);
    }
}
