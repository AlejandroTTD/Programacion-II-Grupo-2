import java.util.Scanner;

public class App {
    static Scanner g2Sc = new Scanner(System.in);
    public static void main(String[] args) {
        FarinangoAlegria fa = new FarinangoAlegria();
        CuasquerDavid da = new CuasquerDavid();
        System.out.println("Elija la serie que desea generar:");
        System.out.println("1. S1");
        System.out.println("2. S2");
        System.out.println("3. S3");
        System.out.println("4. S4");
        System.out.println("5. S5");
        System.out.println("6. S6");
        System.out.println("7. S7");
        System.out.println("8. S8");
        System.out.println("9. S9");
        System.out.println("10. S10");
        System.out.println("12. SC1");
        System.out.println("13. SC2");
        System.out.println("14. SC3");
        System.out.println("15. SC4");
        System.out.println("16. SC5");

        int g2SerieOpcion = g2Sc.nextInt();

        System.out.print("Ingrese el numero de terminos: ");
        int g2Terminos = g2Sc.nextInt();

        switch (g2SerieOpcion) {
            case 1:
                da.dcSN1(g2Terminos);
                break;
            case 2:
                da.dcSN2(g2Terminos);
                break;
            case 3:
                da.dcSN3(g2Terminos);
                break;
            case 4:
                da.dcSN4(g2Terminos);
                break;
            case 5:
                da.dcSN5(g2Terminos);
                break;
            case 6:
                da.dcSN6(g2Terminos);
                break;
            case 7:
                da.dcSN7(g2Terminos);
                break;
            case 8:
                da.dcSN8(g2Terminos); 
                break;
            case 9:
                da.dcSN9(g2Terminos);
                break;
            case 10:
                da.dcSN10(g2Terminos);
                break;
            case 12:
                fa.FA_S12(g2Terminos);
                break;
            case 13:
                fa.FA_SC1(g2Terminos);
                break;
            case 14:
                fa.FA_SC2(g2Terminos);
                break;
            case 15:
                fa.FA_SC3(g2Terminos);
                break;
            case 16:
                fa.FA_SC4(g2Terminos);
                break;
        }
    }
}


