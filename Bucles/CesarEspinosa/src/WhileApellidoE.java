public class WhileApellidoE {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    int i = 1;
    public void apellidoEWhile(){
        System.out.println("WHILE APELLIDO E:");
        while (i < n) {
            if (i == 1 || i == n / 2 || i == n - 1) {
                System.out.println(f);
            } else {
                System.out.println(c);
                System.out.println(c);
            }
            i++;  
        }
    }
}
