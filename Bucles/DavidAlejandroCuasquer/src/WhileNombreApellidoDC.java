public class WhileNombreApellidoDC {
    public void NombreApellidoDC(){
        System.out.println();
        int n = 4; //Tamaño de las letras/Número de lineas que ocupa
        int i = 0;
        while(i < n){
            if(i == 0 || i == n - 1){
                System.out.println("*  *    *  *  *");
            }else if(i == 1 || i == n - 2){
                System.out.println("*    *  *");
            }else{
                System.out.println("*    *  *");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
}
