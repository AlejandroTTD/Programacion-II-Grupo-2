
import java.util.Scanner;

public class FarinangoAlegria {

    public FarinangoAlegria() {
        scanner = new Scanner(System.in);
    }private Scanner scanner;
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
}


           


















