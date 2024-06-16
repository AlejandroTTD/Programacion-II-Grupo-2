public class DoWhileApellidoE {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    int i = 1;
    public void apellidoEDoWhile(){
        System.out.println("DO WHILE APELLIDO E:");
        do {
            if (i == 1 || i == n / 2 || i == n - 1) {
                System.out.println(f);
            } else {
                System.out.println(c);
                System.out.println(c);
            }
            i++;
        } while (i < n);
    }
}
