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
        System.out.println("11. SC1");
        System.out.println("12. SC2");
        System.out.println("13. SC3");
        System.out.println("14. SC4");
        System.out.println("15. SC5");
        System.out.println("16. S12");
        System.out.println("17. SC1");
        System.out.println("18. SC2");
        System.out.println("19. SC3");
        System.out.println("20. SC4");
        System.out.println("21. SC5");
        System.out.println("22. SC6");
        System.out.println("23. SC7");
        System.out.println("24. SC8");
        System.out.println("25. SC9");
        System.out.println("26. Formas/Figuras");
        int g2SerieOpcionI = 0;
        int g2TerminosI = 0;
        while (true) {
            System.out.println("Elija tu opcion:");
            String g2SerieOpcion = g2Sc.nextLine();
            try {
                g2SerieOpcionI = Integer.parseInt(g2SerieOpcion);
                if (g2SerieOpcionI >= 1 && g2SerieOpcionI <= 27) {
                    break; 
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalido. Intente de nuevo.");
            }
        }

        if(g2SerieOpcionI !=26){
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
                fa.faS12(g2TerminosI);
                break;
            case 13:
                fa.faSC1(g2TerminosI);
                break;
            case 14:
                fa.faSC2(g2TerminosI);
                break;
            case 15:
                fa.faSC3(g2TerminosI);
                break;
            case 16:
                fa.faSC4(g2TerminosI);
                break;
            case 17:
                fa.faS12(g2TerminosI);
                break;
            case 18:
                fa.faSC1(g2TerminosI);
                break;
            case 19:
                fa.faSC2(g2TerminosI);
                break;
            case 20:
                fa.faSC3(g2TerminosI);
                break;
            case 21:
                fa.faSC4(g2TerminosI);
                break;
            case 22:
                fa.faSC5(g2TerminosI);
                break;
            case 23:
                fa.faSC6(g2TerminosI);
                break;
            case 24:
                fa.faSC7(g2TerminosI);
                break;
            case 25:
                fa.faSC8(g2TerminosI);
                break;
            case 26:
                fa.faSC9(g2TerminosI);
                break;
            case 27:
                cg.cgFormas();
                break;
            case 28:
                cg.cgA02();
                break;
            case 29:
                cg.cgA03();
                break;
            case 30:
                cg.cgA04();
                break;
            case 31:
                cg.cgA05();
                break;
            case 32:
                cg.cgL10();
                break;
            case 33:
                cg.cgL11();
                break;
            case 34:
                cg.cgL12();
                break;

            default:
                System.out.println("Opción de serie no valida.");
                break;
        }
    cg.cgFormas();
    }
}




