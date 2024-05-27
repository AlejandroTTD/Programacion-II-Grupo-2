import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FarinangoAlegria fa = new FarinangoAlegria();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elija la serie que desea generar:");
        System.out.println("1. S12");
        System.out.println("2. SC1");
        System.out.println("3. SC2");
        System.out.println("4. SC3");
        System.out.println("5. SC4");
        System.out.println("6. SC5");
        System.out.println("7. SC6");
        System.out.println("8. SC7");
        System.out.println("9. SC8");
        System.out.println("10. SC9");

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
            case 3:
                fa.FA_SC2(terminos);
                break;
            case 4:
                fa.FA_SC3(terminos);
                break;
            case 5:
                fa.FA_SC4(terminos);
                break;
            case 6:
                fa.FA_SC5(terminos);
                break;
            case 7:
                fa.FA_SC6(terminos);
                break;
            case 8:
                fa.FA_SC7(terminos);
                break;
            case 9:
                fa.FA_SC8(terminos);
                break;
            case 10:
                fa.FA_SC9(terminos);
                break;
            default:
                System.out.println("Opción de serie no válida.");
                break;
        }

        scanner.close();
    }
}



