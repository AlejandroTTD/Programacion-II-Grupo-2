import java.util.Scanner;

public class FarinangoAlegria {

    private Scanner scanner;

    public FarinangoAlegria() {
        scanner = new Scanner(System.in);
    }
    public void mostrarMenu() throws InterruptedException {
        int opcion;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Ejercicio S12");
            System.out.println("2. Ejercicio SC");
            System.out.println("3. Ejercicio L01");
            System.out.println("4. Ejercicio L02");
            System.out.println("5. Ejercicio L03");
            System.out.println("6. Ejercicio L04");
            System.out.println("7. Ejercicio L05");
            System.out.println("8. Ejercicio L06");
            System.out.println("9. Ejercicio L07");
            System.out.println("10. Ejercicio L08");
            System.out.println("0. Salir");
            System.out.println("Ingrese la opción deseada:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de terminos para S12:");
                    int terminosS12 = scanner.nextInt();
                    faS12(terminosS12);
                    break;
                case 2:
                    mostrarSubMenuSC();
                    break;
                case 3:
                    faL01();
                    break;
                case 4:
                    faL02();
                    break;
                case 5:
                    faL03();
                    break;
                case 6:
                    faL04();
                    break;
                case 7:
                    faL05();
                    break;
                case 8:
                    faL06();
                    break;
                case 9:
                    faL07();
                    break;
                case 10:
                    faL08();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intentar de nuevo.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
    public void mostrarSubMenuSC() {
        int opcionSC;
        do {
            System.out.println("=== SUBMENU SC ===");
            System.out.println("1. Ejercicio SC1");
            System.out.println("2. Ejercicio SC2");
            System.out.println("3. Ejercicio SC3");
            System.out.println("4. Ejercicio SC4");
            System.out.println("5. Ejercicio SC5");
            System.out.println("6. Ejercicio SC6");
            System.out.println("7. Ejercicio SC7");
            System.out.println("8. Ejercicio SC8");
            System.out.println("9. Ejercicio SC9");
            System.out.println("0. Volver al menu principal");
            System.out.println("Ingrese la opcion deseada:");
            opcionSC = scanner.nextInt();

            switch (opcionSC) {
                case 1:
                    System.out.println("Ingrese la cantidad de terminos para SC1:");
                    int terminosSC1 = scanner.nextInt();
                    faSC1(terminosSC1);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de terminos para SC2:");
                    int terminosSC2 = scanner.nextInt();
                    faSC2(terminosSC2);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de terminos para SC3:");
                    int terminosSC3 = scanner.nextInt();
                    faSC3(terminosSC3);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de terminos para SC4:");
                    int terminosSC4 = scanner.nextInt();
                    faSC4(terminosSC4);
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de terminos para SC5:");
                    int terminosSC5 = scanner.nextInt();
                    faSC5(terminosSC5);
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de terminos para SC6:");
                    int terminosSC6 = scanner.nextInt();
                    faSC6(terminosSC6);
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad de terminos para SC7:");
                    int terminosSC7 = scanner.nextInt();
                    faSC7(terminosSC7);
                    break;
                case 8:
                    System.out.println("Ingrese la cantidad de terminos para SC8:");
                    int terminosSC8 = scanner.nextInt();
                    faSC8(terminosSC8);
                    break;
                case 9:
                    System.out.println("Ingrese la cantidad de terminos para SC9:");
                    int terminosSC9 = scanner.nextInt();
                    faSC9(terminosSC9);
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("opcion no valida, intentar de nuevo.");
                    break;
            }
        } while (opcionSC != 0);
    }

    // Métodos S12
    public void faS12(int terminos) {
        int valor = 2;
        for (int i = 1; i <= terminos; i++) {
            System.out.print(valor + " ");
            valor += (i + 1) * 2;
        }
        System.out.println();
    }

    // Métodos SC
    public void faSC1(int terminos) {
        char caracter = '+';
        for (int i = 0; i < terminos; i++) {
            System.out.print(caracter + " ");
            caracter = (caracter == '+') ? '-' : '+';
        }
        System.out.println();
    }

    public void faSC2(int terminos) {
        int length = 1;
        for (int i = 0; i < terminos; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print('+');
            }
            System.out.print(" ");
            length += i + 1;
        }
        System.out.println();
    }

    public void faSC3(int terminos) {
        int length = 2;
        for (int i = 0; i < terminos; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print('+');
            }
            System.out.print(" ");
            length += 2 * i + 1;
        }
        System.out.println();
    }

    public void faSC4(int terminos) {
        char[] simbolos = {'+', '-', '*', '/'};
        for (int i = 0; i < terminos; i++) {
            System.out.print(simbolos[i % simbolos.length] + " ");
        }
        System.out.println();
    }

    public void faSC5(int terminos) {
        char[] simbolos = {'\\', '|', '/', '-'};
        for (int i = 0; i < terminos; i++) {
            System.out.print(simbolos[i % simbolos.length] + " ");
        }
        System.out.println();
    }

    public void faSC6(int terminos) {
        char caracter = 'a';
        for (int i = 0; i < terminos; i++) {
            System.out.print(caracter + " ");
            caracter++;
        }
        System.out.println();
    }

    public void faSC7(int terminos) {
        char caracter = 'a';
        for (int i = 0; i < terminos; i++) {
            System.out.print(caracter + " ");
            if (i % 2 == 1) {
                caracter += 2;
            } else {
                caracter++;
            }
        }
        System.out.println();
    }

    public void faSC8(int terminos) {
        char caracter = 'a';
        int repeticiones = 2;
        for (int i = 0; i < terminos; i++) {
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
            caracter++;
            repeticiones += 2;
        }
        System.out.println();
    }

    public void faSC9(int terminos) {
        char caracter = 'a';
        int repeticiones = 1;
        for (int i = 0; i < terminos; i++) {
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
            caracter++;
            repeticiones += 2;
        }
        System.out.println();
    }

    public void faL01() throws InterruptedException {
        String[] loading = {"\\", "|", "/", "-"};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + loading[i % 4] + " " + i + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public void faL02() throws InterruptedException {
        System.out.println("Ingrese un caracter para la barra de carga:");
        char loadChar = scanner.next().charAt(0);

        for (int i = 0; i <= 20; i++) {
            int percent = (i * 100) / 20;
            System.out.print("\r[");
            for (int j = 0; j < 20; j++) {
                if (j < i) {
                    System.out.print(loadChar);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + percent + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public void faL03() throws InterruptedException {
        System.out.println("Ingrese un caracter para la barra de desplazamiento:");
        char loadChar = scanner.next().charAt(0);

        for (int i = 0; i <= 20; i++) {
            int percent = (i * 100) / 20;
            System.out.print("\r[");
            for (int j = 0; j < 20; j++) {
                if (j == i) {
                    System.out.print(loadChar);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + percent + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public void faL04() throws InterruptedException {
        String[] waiting = {"o", "0", "o"};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + waiting[i % 3] + " " + i + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public void faL05() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
            int percent = (i * 100) / 20;
            System.out.print("\r[");
            for (int j = 0; j < 20; j++) {
                if (j < i) {
                    System.out.print("=");
                } else if (j == i) {
                    System.out.print(i % 2 == 0 ? ">" : "-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + percent + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public void faL06() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
            int percent = (i * 100) / 20;
            System.out.print("\r[");
            for (int j = 0; j < 20; j++) {
                if (j == i || j == i + 1 || j == i + 2) {
                    System.out.print("<=>".charAt(j - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + percent + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public void faL07() throws InterruptedException {
        String[] rotators = {"\\", "|", "/", "-"};
        for (int i = 0; i <= 20; i++) {
            int percent = (i * 100) / 20;
            System.out.print("\r[");
            for (int j = 0; j < 20; j++) {
                if (j < i) {
                    System.out.print("=");
                } else if (j == i) {
                    System.out.print(rotators[i % 4]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + percent + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public void faL08() throws InterruptedException {
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        for (int i = 0; i <= nombre.length(); i++) {
            int percent = (i * 100) / nombre.length();
            System.out.print("\r[");
            System.out.print(nombre.substring(0, i));
            for (int j = i; j < nombre.length(); j++) {
                System.out.print(" ");
            }
            System.out.print("] " + percent + "%");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        FarinangoAlegria programa = new FarinangoAlegria();
        programa.mostrarMenu();
    }
}

           


















