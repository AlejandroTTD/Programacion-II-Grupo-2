import java.util.Scanner;
public class App {
    static Scanner g2Sc = new Scanner(System.in);
    public static void main(String[] args) {
        GallardoCeleste cg = new GallardoCeleste();
        FarinangoAlegria fa = new FarinangoAlegria();
        CuasquerDavid da = new CuasquerDavid();

        System.out.println();
        System.out.println("╔════════════════════════════╗");
        System.out.println("║        * Grupo 2 *         ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║  *    cuasquer.david    *  ║");
        System.out.println("║  *    farinango.alegria *  ║");
        System.out.println("║  *    gallardo.celeste  *  ║");
        System.out.println("║  *                      *  ║");
        System.out.println("╚════════════════════════════╝");
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

        int g2SerieOpcionI = 0;
        int g2TerminosI = 0;
        
        System.out.println("Elija la serie que desea generar:");
        System.out.println("17. S12");
        System.out.println("18. SC1");
        System.out.println("19. SC2");
        System.out.println("20. SC3");
        System.out.println("21. SC4");
        System.out.println("22. SC5");
        System.out.println("23. SC6");
        System.out.println("24. SC7");
        System.out.println("25. SC8");
        System.out.println("26. SC9");

       
        while (true) {
            System.out.print("Ingrese el numero de terminos: ");
            String g2Terminos = g2Sc.nextLine();
            try {
                g2TerminosI = Integer.parseInt(g2Terminos);
                if (g2TerminosI > 0) {
                    break; 
                } else {
                    System.out.println("El número de términos debe ser mayor que 0. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalido. Intente de nuevo.");
            }
        }

        switch (g2SerieOpcionI) {
            case 1:
                da.dcSN1(g2TerminosI);
                break;
            case 2:
                da.dcSN2(g2TerminosI);
                break;
            case 3:
                da.dcSN3(g2TerminosI);
                break;
            case 4:
                da.dcSN4(g2TerminosI);
                break;
            case 5:
                da.dcSN5(g2TerminosI);
                break;
            case 6:
                da.dcSN6(g2TerminosI);
                break;
            case 7:
                da.dcSN7(g2TerminosI);
                break;
            case 8:
                da.dcSN8(g2TerminosI);
                break;
            case 9:
                da.dcSN9(g2TerminosI);
                break;
            case 10:
                da.dcSN10(g2TerminosI);
                break;
            case 12:
                fa.FA_S12(g2TerminosI);
                break;
            case 13:
                fa.FA_SC1(g2TerminosI);
                break;
            case 14:
                fa.FA_SC2(g2TerminosI);
                break;
            case 15:
                fa.FA_SC3(g2TerminosI);
                break;
            case 16:
                fa.FA_SC4(g2TerminosI);
                break;
            case 17:
                fa.FA_S12(g2TerminosI);
                break;
            case 18:
                fa.FA_SC1(g2TerminosI);
                break;
            case 19:
                fa.FA_SC2(g2TerminosI);
                break;
            case 20:
                fa.FA_SC3(g2TerminosI);
                break;
            case 21:
                fa.FA_SC4(g2TerminosI);
                break;
            case 22:
                fa.FA_SC5(g2TerminosI);
                break;
            case 23:
                fa.FA_SC6(g2TerminosI);
                break;
            case 24:
                fa.FA_SC7(g2TerminosI);
                break;
            case 25:
                fa.FA_SC8(g2TerminosI);
                break;
            case 26:
                fa.FA_SC9(g2TerminosI);
                break;
            default:
                System.out.println("Opción de serie no válida.");
                break;
        }
    //formas
    cg.cgFormas();
    
    }
}




