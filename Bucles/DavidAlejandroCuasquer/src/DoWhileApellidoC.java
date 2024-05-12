public class DoWhileApellidoC {
    public void ApellidoC(){
        System.out.println();
        int n = 4; //Tamaño de la letra/Numero de lineas que ocupa
        int i = 0;
        do {
            if(i == 0 || i == n - 1){
                System.out.println("*  *  *");
            }else{
                System.out.println("*");
            }
            System.out.println();
            i++;
        } while (i < n);
        System.out.println();
    }
}
