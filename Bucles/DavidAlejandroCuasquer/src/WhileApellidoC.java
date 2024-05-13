public class WhileApellidoC {
    public void ApellidoC(){
        int n = 4; //Tamaño de la letra/Número de lineas que ocupa
        int i = 0;
        System.out.println();
        while (i < n){
            if (i == 0 || i == n - 1){
                System.out.println("*  *  *");
            }else{
                System.out.println("*");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
}
