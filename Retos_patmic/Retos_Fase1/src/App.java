import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FarinangoAlegria serie = new FarinangoAlegria();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione la serie que desea generar:");
            System.out.println("1. Serie Numérica S12");
            option = scanner.nextInt();

            if (option < 1 || option > 10) {
                if (option == 11) {
                    System.out.println("Saliendo...");
                    break;
                }
                System.out.println("Opción no válida. Intente de nuevo.");
                continue;
            }

            System.out.print("Ingrese el número de términos/caracteres: ");
            int numElementos = scanner.nextInt();

            switch (option) {
                case 1:
                    generarSerieS12(serie, numElementos);
                    break;

            }

            System.out.println();

        } while (option != 11);

        scanner.close();
    }

    private static void generarSerieS12(FarinangoAlegria serie, int numElementos) {
        serie.FAS1S12(numElementos);
    }

}

