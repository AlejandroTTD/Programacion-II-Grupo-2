
public class ForApellidoC {
    public void ApellidoC(){
        System.out.println();
        int n = 4; //Tamaño de la letra/Numero de lineas que ocupa
        for(int i = 0; i < n; i++){
            if (i == 0 || i == n - 1){
                System.out.println("*  *  *");
            }else{
                System.out.println("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
