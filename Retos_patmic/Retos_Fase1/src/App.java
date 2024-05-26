import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FarinangoAlegria fa = new FarinangoAlegria();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elija la serie que desea generar:");
        System.out.println("1. S12");
        System.out.println("2. SC1");
       
        int serieOpcion = scanner.nextInt();

        System.out.print("Ingrese el numero de terminos: ");
        int terminos = scanner.nextInt();

        System.out.println("Elija el tipo de bucle:");
        System.out.println("1. For");
        System.out.println("2. While");
        System.out.println("3. DoWhile");

        int bucleOpcion = scanner.nextInt();

        switch (serieOpcion) {
            case 1:
                switch (bucleOpcion) {
                    case 1:
                        fa.FA_S12_For(terminos);
                        break;
                    case 2:
                        fa.FA_S12_While(terminos);
                        break;
                    case 3:
                        fa.FA_S12_DoWhile(terminos);
                        break;
                        default:
                        System.out.println("Opcion de bucle no valida.");
                        break;
                }
                break;
            case 2: 
                switch(bucleOpcion){
                    case 1: 
                        fa.FA_SC1_For(terminos);
                        break; 
                    case 2:
                        fa.FA_SC1_While(terminos);
                        break; 
                    case 3: 
                        fa.FA_SC1_DoWhile(terminos);
                        break; 
                        default: 
                        System.out.println("Opcion de bucle no valida");
                        break; 
                }
                
        scanner.close();
        }
    }
}


