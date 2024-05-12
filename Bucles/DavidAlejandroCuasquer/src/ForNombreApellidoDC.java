
public class ForNombreApellidoDC {
    public void NombreApellidoDC(){   
        System.out.println(); 
        int n = 4; // Tamaño de las letras/Numero de lineas que ocupan
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n - 1){
                System.out.print("*  *    *  *  *");
            }else if (i == 1 || i == n - 2){
                System.out.print("*    *  *");
            }else {
                System.out.print("*    *  *");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
    }
}

