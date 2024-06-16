/*  Copyright (C) 2K23, AlejandroTTD
 *  davidcuasquer21@hotmail.com
 *  Version 1,0
 */
import java.util.Scanner;
public class App {
    static Scanner g2Sc = new Scanner(System.in);
    static Scanner scanner;
    public static void main(String[] args) throws InterruptedException {
        int g2A=0;
        int g2B=0;
        GallardoCeleste cg = new GallardoCeleste();
        FarinangoAlegria fa = new FarinangoAlegria();
        CuasquerDavid da = new CuasquerDavid();
        EspinosaCesar ce = new EspinosaCesar();
        System.out.println();
        System.out.println("╔════════════════════════════╗");
        System.out.println("║        * Grupo 2 *         ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║  *    cuasquer.david    *  ║");
        System.out.println("║  *    farinango.alegria *  ║");
        System.out.println("║  *    gallardo.celeste  *  ║");
        System.out.println("║  *    cesar espinoza    *  ║");
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
        System.out.println("11. SN12");
        System.out.println("12. SC1");
        System.out.println("13. SC2");
        System.out.println("14. SC3");
        System.out.println("15. SC4");
        System.out.println("16. SC5");
        System.out.println("17. S16");
        System.out.println("18. SC7");
        System.out.println("19. SC8");
        System.out.println("20. SC9");
        System.out.println("21. Formas/Figuras");
        System.out.println("22. C01");
        System.out.println("23. C02");
        System.out.println("24. C03");
        System.out.println("25. C04");
        System.out.println("26. C05");
        System.out.println("27. C06");
        System.out.println("28. C07");
        System.out.println("29. C08");
        System.out.println("30. C09");
        System.out.println("31. A01");
        System.out.println("32. A02");
        System.out.println("33. A03");
        System.out.println("34. A04");
        System.out.println("35. A05");
        System.out.println("36. L01");
        System.out.println("37. L02");
        System.out.println("38. L03");
        System.out.println("39. L04");
        System.out.println("40. L05");
        System.out.println("41. L06");
        System.out.println("42. L07");
        System.out.println("43. L08");
        System.out.println("44. L09");
        System.out.println("45. L10");
        System.out.println("46. L11");
        System.out.println("47. L12");
        System.out.println("48. L08");
        System.out.println("49. R01");
        System.out.println("50. R02");
        System.out.println("51. R03");
        System.out.println("52. R04");
        System.out.println("53. R05");
        System.out.println("54. R06");
        System.out.println("55. Saliendo del menú...");

        int g2SerieOpcionI = 0;
        int g2TerminosI = 0;
        while (true) {
            System.out.println("Elija tu opcion:");
            String g2SerieOpcion = g2Sc.nextLine();
            try {
                g2SerieOpcionI = Integer.parseInt(g2SerieOpcion);
                if (g2SerieOpcionI >= 1 && g2SerieOpcionI <= 55) {
                    break; 
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalido. Intente de nuevo.");
            }
        }

        if(g2SerieOpcionI !=55){
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
            case 11:
                fa.faS12(g2TerminosI);
                break;
            case 12:
                System.out.println("Ingrese la cantidad de terminos para SC1:");
                int terminosSC1 = scanner.nextInt();
                fa.faSC1(terminosSC1);
                break;
            case 13:
                System.out.println("Ingrese la cantidad de terminos para SC2:");
                int terminosSC2 = scanner.nextInt();
                fa.faSC2(terminosSC2);
                break;
            case 14:
                System.out.println("Ingrese la cantidad de terminos para SC3:");
                int terminosSC3 = scanner.nextInt();
                fa.faSC3(terminosSC3);
                break;
            case 15:
                System.out.println("Ingrese la cantidad de terminos para SC4:");
                int terminosSC4 = scanner.nextInt();
                fa.faSC4(terminosSC4);
                break;
            case 16:
                System.out.println("Ingrese la cantidad de terminos para SC5:");
                int terminosSC5 = scanner.nextInt();
                fa.faSC5(terminosSC5);
                break;
            case 17:
                System.out.println("Ingrese la cantidad de terminos para SC6:");
                int terminosSC6 = scanner.nextInt();
                fa.faSC6(terminosSC6);
                break;
            case 18:
                System.out.println("Ingrese la cantidad de terminos para SC7:");
                int terminosSC7 = scanner.nextInt();
                fa.faSC7(terminosSC7);
                break;
            case 19:
                System.out.println("Ingrese la cantidad de terminos para SC8:");
                int terminosSC8 = scanner.nextInt();
                fa.faSC8(terminosSC8);
                break;
            case 20:
                System.out.println("Ingrese la cantidad de terminos para SC9:");
                int terminosSC9 = scanner.nextInt();
                fa.faSC9(terminosSC9);
                break;
            case 21:
                cg.cgFormas();
                break;
            case 22:
                System.out.println("Ingrese una frase: ");
                String frase = g2Sc.nextLine();
                ce.ceC01(frase);
                break;
            case 23:
                System.out.println("Ingrese una frase: ");
                String frase1 = g2Sc.nextLine();
                ce.ceC02(frase1);
                break;
            case 24:
                System.out.println("Ingrese una frase: ");
                String frase2 = g2Sc.nextLine();
                ce.ceC03(frase2, "a");
                break;
            case 25:
                System.out.println("Ingrese una frase: ");
                String frase3 = g2Sc.nextLine();
                System.out.println("Ingrese la letra a eliminar: ");
                String letra = g2Sc.nextLine();
                ce.ceC04(frase3,letra);
                break;
            case 26:
                System.out.println("Ingrese una frase: ");
                String frase4 = g2Sc.nextLine();
                ce.ceC05(frase4);
                break;
            case 27:
                System.out.println("Ingrese una frase: ");
                String frase5 = g2Sc.nextLine();
                ce.ceC06(frase5);
                break;
            case 28:
                System.out.println("Ingrese una frase: ");
                String frase6= g2Sc.nextLine();
                ce.ceC07(frase6);
                break;
            case 29:
                String[] conjuntoPalabras = {
                        "delira", "lidera",
                        "ballena", "llenaba",
                        "alondra", "ladrona",
                        "españa", "apañes",
                        "enrique", "quieren"
                };
                ce.ceC08(conjuntoPalabras);
                break;
            case 30:
                System.out.println("Ingrese una frase: ");
                String frase8 = g2Sc.nextLine();
                da.dcC09(frase8);
                break;
            case 31:
                String[] dcNombres = { "David", "Alejandro", "Cuasquer", "Rodriguez" };
                int[] dcPorcentajes = { 100, 75, 50, 25 };
                da.dcA01(dcNombres, dcPorcentajes);
            case 32:
                cg.cgA02();
                break;
            case 33:
                cg.cgA03();
                break;
            case 34:
                cg.cgA04();
                break;
            case 35:
                cg.cgA05();
                break;
            case 36:
                fa.faL01();
                break;    
            case 37:
                fa.faL02();
                break;    
            case 38:
                fa.faL03();
                break;    
            case 39:
                fa.faL04();
                break;    
            case 40:
                fa.faL05();
                break;    
            case 41:
                fa.faL06();
                break;    
            case 42:
                fa.faL07();
                break;    
            case 43:
                fa.faL08();
                break;    
            case 44:
                cg.cgL09();
                break;    
            case 45:
                cg.cgL10();
                break;    
            case 46:
                cg.cgL11();
                break;    
            case 47:
                cg.cgL12();
                break;    
            case 48:
                fa.faL08();
                break;    
            case 49:
                System.out.println("Ingrese un numero: ");
                g2A = scanner.nextInt();
                da.dcR01(g2TerminosI);
                break;    
            case 50:
                System.out.println("Ingrese el primer numero:");
                g2A = scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                g2B = scanner.nextInt();
                da.dcR02(g2A,g2B);
                break;    
            case 51:
                System.out.println("Ingrese el primer numero:");
                g2A = scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                g2B = scanner.nextInt();
                da.dcR03(g2A, g2B);
                break;    
            case 52:
                System.out.println("Ingrese el primer numero:");
                g2A = scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                g2B = scanner.nextInt();
                da.dcR04(g2A, g2B);
                break;    
            case 53:
                System.out.println("Ingrese un numero: ");
                g2A = scanner.nextInt();
                da.dcR05(g2TerminosI);
                break;    
            case 54:
                System.out.println("Ingrese un numero: ");
                g2A = scanner.nextInt();
                da.dcR06(g2TerminosI);
                break;
            case 55:
                System.out.println("Saliendo del menu...");
                break;       
            default:
                System.out.println("Opción de serie no valida.");
                break;
        }
    }
}




