public class DoWhileNombreApellidoDC {
    public void NombreApellidoDC(){
        System.out.println();
        int n = 4; //Tamaño de las letras/Numero de lineas que ocupan
        int i = 0;
        do {
            if(i == 0 || i == n-1){
                System.out.println("*  *    *  *  *");
            }else if(i == 1 || i == n-2){
                System.out.println("*    *  *");
            }else{
                System.out.println("*    *  *");
            }
            System.out.println();
            i++;
        } while (i < n);
        System.out.println();
    }
}
