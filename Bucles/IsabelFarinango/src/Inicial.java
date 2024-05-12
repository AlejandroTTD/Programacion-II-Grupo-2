import java.util.Scanner;

public class Inicial {

    // Almacena la longitud
    int longitud;
    String caracterAImprimir;

    // Metodo para ingresar los datos desde la entrada
    public void ingresoDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la palabra (más de 2): ");
        longitud = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el carácter para formar la palabra: ");
        // Se guarda el caracter ingresado
        caracterAImprimir = sc.nextLine();
    }

    // Metodo para imprimir la inicial nombre
    public void imprimirInicialNombre() {
        for (int i = 1; i <= longitud; i++) {
            if (i == longitud) {
                for (int j = 1; j <= longitud - 2; j++) {
                    System.out.print(caracterAImprimir + " ");
                }
            }
            System.out.println(caracterAImprimir);
        }
    }

    // Metodo para imprimir una forma para la inicial del apellido
    public void imprimirInicialApellido() {
        System.out.println("\n Inicial Apellido \n");

        for (int nivel = 1; nivel <= longitud; nivel++) {
            for (int columna = 1; columna <= longitud; columna++) {

                if ((nivel == 1 || nivel == longitud / 2 + 1) && columna <= longitud) {
                    System.out.print(" * ");
                } else {

                    if (columna == 1 || columna == longitud) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
