public class WhileNombreC {
    int n = 6;
    String f = "* * * * *";
    String c = "*";
    int i = 1;

    public void nombreCWhile(){
        System.out.println("WHILE NOMBRE C:");
        while(i < n){
            if (i == 1 || i == n - 1) {
                System.out.println(f);
            }else {
                System.out.println(c);
                System.out.println(c);
            }
            i++;
        }
    }
}
