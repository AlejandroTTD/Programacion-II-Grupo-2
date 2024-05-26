import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FarinangoAlegria fa = new FarinangoAlegria();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elija la serie que desea generar:");
        System.out.println("1. S12");
       
        int serieOpcion = scanner.nextInt();

        System.out.print("Ingrese el número de términos: ");
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
                        fa.FAS1_S12_For(terminos);
                        break;
                    case 2:
                        fa.FAS1_S12_While(terminos);
                        break;
                    case 3:
                        // fa.FAS1_S12_DoWhile(terminos);
                        // break;
                        default:
                        System.out.println("Opción de bucle no válida.");
                        break;
                }
                
        scanner.close();
        }
    }
}


