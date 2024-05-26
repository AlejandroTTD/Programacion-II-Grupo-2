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

        switch (serieOpcion) {
            case 1:
                fa.FA_S12(terminos);
                break;
            case 2:
                fa.FA_SC1(terminos);
                break;
        }

        scanner.close();
    }
}


