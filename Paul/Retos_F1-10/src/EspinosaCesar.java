import java.util.Scanner;

public class EspinosaCesar {

    public void ceF1(int nivel) {

        System.out.println("figura 1:");
        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= nivel; j++) {
                if ((i == 1) || (j == 1) || (i == nivel) || (j == nivel)) {
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void ceF2(int nivel) {
        System.out.println("figura 2:");
        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= nivel; j++) {
                if ((i == 1) || (j == 1) || (i == nivel) || (j == nivel)) {
                    System.out.print((i % 2 == 0) || (j % 2 == 0) ? "+" : "*");
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public void ceF3(int nivel) {
        System.out.println("figura 3:");
        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void ceF4(int nivel) {
        System.out.println("figura 4:");
        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= nivel - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void ceF5(int nivel) {
        System.out.println("figura 5:");
        for (int i = nivel; i >= 1; i--) {
            for (int j = 1; j <= nivel - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void ceF6(int nivel) {
        System.out.println("figura 6:");
        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= nivel - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public void ceF7(int nivel) {
        System.out.println("figura 7:");
        String escalon = "   |___";
        for (int i = 1; i <= nivel; i++) {
            if (i == 1)
                System.out.println("___");

            for (int j = 2; j <= i; j++) {
                System.out.print("    ");
            }
            System.out.println(escalon);
        }
    }

    public void ceF8(int nivel) {
        System.out.println("figura 8:");
        String escalon = "___|";
        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= nivel - i; k++) {

                System.out.print("    ");
            }
            System.out.println(escalon);
        }
    }

    public void ceF9(int nivel) {
        System.out.println("figura 9:");
         // Imprime la parte superior de la figura
         for (int i=0;i<nivel;i++){
            System.out.print("   ");
        }
        System.out.println("___");

        // Imprime las capas de la figura descendente
        for (int i=0;i<nivel;i++){
            // Imprime espacios en blanco antes de la barra inicial
            for (int j=0;j<nivel-i-1;j++){
                System.out.print("   ");
            }
            
            // Imprime la barra inicial
            System.out.print("___| ");

            // Imprime espacios en blanco entre las barras
            for (int j=0;j<2*i;j++){
                System.out.print("   ");
            }
            // Imprime la barra final
            System.out.println(" |___");
        }
        System.out.println("\n");
    }

    public void ceF10(int nivel) {
        System.out.println("figura 10:");
        for (int i = 1; i <= nivel; i++) {
            if (i % 2 == 0)
                System.out.println("|_-_");
            else
                System.out.println("|_+_");

            for (int j = 1; j <= i; j++) {
                System.out.print("    ");
            }
        }
    }
}
