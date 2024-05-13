public class WhileNombreD {
    public void NombreD(){
        int n = 4; //Tamaño de las letras/Numero de líneas que ocupa
        int i = 0;
        System.out.println();
        while(i < n){
            if(i == 0 || i == n -1){
                System.out.println("*  *");
            }else{
                System.out.println("*    *");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
}
