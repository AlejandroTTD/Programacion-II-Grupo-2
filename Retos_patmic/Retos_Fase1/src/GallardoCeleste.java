
import java.util.Random;
import java.util.Scanner;

public class GallardoCeleste {
    
    public void cgFormas(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Elija la forma o figura que desea generar:");
            System.out.println("1. F1");
            System.out.println("2. F2");
            System.out.println("3. F3");
            System.out.println("4. F4");
            System.out.println("5. F5");
            System.out.println("6. F6");
            System.out.println("7. F7");
            System.out.println("8. F8");
            System.out.println("9. F9");
            System.out.println("10. F10");
            System.out.println("11. F11");
            System.out.println("12. F12");
            System.out.println("13. F13");
            System.out.println("14. F14");
            System.out.println("15. F15");
            System.out.println("16. F16");
            System.out.println("17. F17");
            System.out.println("18. F18");
            System.out.println("19. F19");
        int forma = scanner.nextInt();
        switch (forma) {
            case 1:
                //La forma es un cuadrado con asteriscos
                Scanner scan = new Scanner(System.in);
                System.out.println(" ");
                System.out.println("F1");
                System.out.println(" ");
                String cga = "* ";
                String cgd = "  ";
                int cgancho;
                do {
                    System.out.print("Ingrese el número de ancho (mayor que 0): ");
                    cgancho = scan.nextInt();
                } while (cgancho <= 0);
                int cgalto;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgalto = scan.nextInt();
                } while (cgalto <= 0);

                for (int i = 0; i < cgancho; i++) { 
                    for (int j = 0; j < cgalto; j++) { 
                        if (i == 0 || i == cgancho - 1 || j == 0 || j == cgalto - 1) {
                            System.out.print(cga);
                        } else {
                            System.out.print(cgd); 
                        }
                    }
                    System.out.println();
                }
                break;
                
            case 2:
                //La forma es un cuadrado con asteriscos y signos
                System.out.println(" ");
                System.out.println("F2");
                System.out.println(" ");
                String cgc = "* ";
                String cgb = "+ ";
                String cge = "  ";

                int cganch;
                do {
                    System.out.print("Ingrese el número de ancho (mayor que 0): ");
                    cganch = scanner.nextInt();
                } while (cganch <= 0);

                int cgalt;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgalt = scanner.nextInt();
                } while (cgalt <= 0);

                for (int i = 0; i < cganch; i++) { 
                    for (int j = 0; j < cgalt; j++) { 
                        if (i == 0 || i == cganch - 1 || j == 0 || j == cgalt - 1) {
                            if ((i + j) % 2 == 0) {
                                System.out.print(cgc);
                            } else {
                                System.out.print(cgb);
                            }
                        } else {
                            System.out.print(cge); 
                        }
                    }
                    System.out.println();
                }
            
            break;

            case 3:
            //triangulo    
            System.out.println(" ");
                System.out.println("F3");
                System.out.println(" ");
                String cgf = "* ";

                int cgaltura;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgaltura = scanner.nextInt();
                } while (cgaltura <= 0);
                
                for (int i = 1; i <= cgaltura; i++) { 
                    for (int j = 0; j < i; j++) { 
                        System.out.print(cgf); 
                    }
                    System.out.println();
                }
                
                break;
                
            case 4:
            //triangulo alreves 
                System.out.println(" ");
                System.out.println("F4");
                System.out.println(" ");
                
                String cgg = "* ";
                String cgh = "  ";

                int cgaltur;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgaltur = scanner.nextInt();
                } while (cgaltur <= 0);

                for (int i = 1; i <= cgaltur; i++) { 
                    for (int j = 0; j < cgaltur - i; j++) { 
                        System.out.print(cgh);
                    }
                    for (int j = 0; j < i; j++) { 
                        System.out.print(cgg);
                    }
                    System.out.println();
                }

            break;
            case 5:
            //triangulo de cabeza centrado
                System.out.println(" ");
                System.out.println("F5");
                System.out.println(" ");

                String cgi = "* ";
                String cgj = " ";

                int cgaltu;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgaltu = scanner.nextInt();
                } while (cgaltu <= 0);

                for (int i = cgaltu; i > 0; i--) { 
                    for (int j = 0; j < cgaltu - i; j++) { 
                        System.out.print(cgj);
                    }
                    for (int j = 0; j < i; j++) { 
                        System.out.print(cgi);
                    }
                    System.out.println(); 
                }
                
            break;

            case 6:
            //triangulo centrado
                System.out.println(" ");
                System.out.println("F6");
                System.out.println(" ");
                
                String cgk = "* ";
                String cgl = " ";

                int cgal;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgal = scanner.nextInt();
                } while (cgal <= 0);
                
                for (int i = 1; i <= cgal; i++) { 
                    for (int j = 0; j < cgal - i; j++) { 
                        System.out.print(cgl);
                    }
                    for (int j = 0; j < i; j++) { 
                        System.out.print(cgk);
                    }
                    System.out.println(); 
                }

            break;
            case 7:
            //escalera
                System.out.println(" ");
                System.out.println("F7");
                System.out.println(" ");
                String cgescalon= "|_ _ _";

                int cgnivel;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgnivel = scanner.nextInt();
                } while (cgnivel <= 0);
                
                for (int i = 1; i < cgnivel; i++){
                    for (int e = 1; e < i; e++)
                    System.out.print("      ");
                    System.out.println(cgescalon);
                }
                System.out.println(" ");

            break;
            case 8:
                System.out.println(" ");
                System.out.println("F8");
                System.out.println(" ");

                String cgescalo= "_ _ _|";

                int cgnive;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgnive = scanner.nextInt();
                } while (cgnive <= 0);
                
                for (int i = 1; i <= cgnive; i++){
                    for (int e = 0; e < cgnive - i; e++){
                        System.out.print("      ");
                    }
                    System.out.print(cgescalo);

                    for (int e = 0; e <= i - 1; e++){
                        System.out.print("       ");
                    }
                    System.out.println();
                }
                System.out.println(" ");

            break;
            case 9:
                System.out.println(" ");
                System.out.println("F9");
                System.out.println(" ");
                String cgespacio = "      ";
                String cgizquierda = "_ _ _|  ";
                String cgmedio = " ";
                String cgderecha =" |_ _ _";
                int cgtamano;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgtamano = scanner.nextInt();
                } while (cgtamano <= 0);

                for (int i = 0; i < cgtamano; i++) {
            
                    for (int j = cgtamano - i; j > 0; j--) {
                        System.out.print(cgespacio);
                    }
                    System.out.print(cgizquierda);
                    
                    if (i != 0) {
                        for (int j = 0; j < 12 + 12 * (i - 1); j++) {
                            System.out.print(cgmedio);
                        }
                    }
                    System.out.println(cgderecha);
                }
                System.out.println(" ");                

            break;
            case 10:
                System.out.println(" ");
                System.out.println("F10");
                System.out.println(" ");
                String cgprimerescalon= "|_ + _";
                String cgsegescalon= "|_ - _";

                int cgpiso;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgpiso = scanner.nextInt();
                } while (cgpiso <= 0);
                
                for (int i = 1; i < cgpiso; i++){
                    if (i%2==0){
                        for (int e = 1; e < i; e++)
                        System.out.print("      ");
                        System.out.println(cgprimerescalon);
                    } else {
                        for (int e = 1; e < i; e++)
                        System.out.print("      ");
                        System.out.println(cgsegescalon);

                    }
                }
                System.out.println(" ");

            break;
            case 11:
                System.out.println(" ");
                System.out.println("F11");
                System.out.println(" ");
                String cgbase= "|";
                String cggrada= "_ ";

                int cgbasegrada;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgbasegrada = scanner.nextInt();
                } while (cgbasegrada <= 0);
                
                for (int i = 1; i < cgbasegrada; i++){
                    System.out.println(cgbase);
                    for (int e = 1; e < i; e++) 
                    System.out.print("      ");
                        if (i%2==0) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(cggrada);
                            }
                        } else {
                            for (int j = 0; j < i; j++) {
                                System.out.print(cggrada);
                            }
                        }
                    System.out.println(" ");
                }
    
            break;
            case 12:
                System.out.println(" ");
                System.out.println("F12");
                System.out.println(" ");

                int cgnume;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgnume = scanner.nextInt();
                } while (cgnume <= 0);
                
                for (int i = cgnume; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            break;
            case 13:
                System.out.println(" ");
                System.out.println("F13");
                System.out.println(" ");

                int cgnum;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgnum = scanner.nextInt();
                } while (cgnum <= 0);
                
                for (int i = 1; i <= cgnum; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                
                break;
            case 14:
                System.out.println(" ");
                System.out.println("F14");
                System.out.println(" ");
                int cgfila;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgfila = scanner.nextInt();
                } while (cgfila <= 0);
                
                int[][] cgpascal = new int[cgfila][cgfila];

                for (int i = 0; i < cgfila; i++) {
                    for (int j = 0; j <= i; j++) {
                        if (j == 0 || j == i) {
                            cgpascal[i][j] = 1;
                        } else {
                            cgpascal[i][j] = cgpascal[i-1][j-1] + cgpascal[i-1][j];
                        }
                    }
                }
                for (int i = 0; i < cgfila; i++) {
                    
                    for (int j = 0; j < cgfila - i; j++) {
                        System.out.print("   ");
                    }
                    
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%6d", cgpascal[i][j]);
                    }
                    System.out.println();
                }

            break;
            case 15:
                System.out.println(" ");
                System.out.println("F15");
                System.out.println(" ");

                int cgfila2;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgfila2 = scanner.nextInt();
                } while (cgfila2 <= 0);
                int[][] cgpascal2 = new int[cgfila2][cgfila2];

                for (int i = 0; i < cgfila2; i++) {
                    cgpascal2[i][0] = 1;
                    for (int j = 1; j <= i; j++) {
                        if (i == j) {
                            cgpascal2[i][j] = 1;
                        } else {
                            cgpascal2[i][j] = cgpascal2[i-1][j-1] + cgpascal2[i-1][j];
                        }
                    }
                }

                for (int i = 0; i < cgfila2; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(cgpascal2[i][j] + " ");
                    }
                    System.out.println();
                }
            break;
            case 16:
                System.out.println(" ");
                System.out.println("F16");
                System.out.println(" ");
                String cgmas = "+";
                String cgmenos = "-";
                int cgfil;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgfil = scanner.nextInt();
                } while (cgfil <= 0);

                for (int i = 0; i < cgfil; i++) {
                    
                    for (int j = 0; j < i; j++) {
                        System.out.print("    ");
                    }
                    
                    if (i == 0 || i % 2 == 1) {
                        System.out.print(cgmas);
                    } else {
                        System.out.print(cgmenos);
                    }
                    
                    for (int j = i + 1; j < cgfil; j++) {
                        System.out.print("    "); 
                    }
                    
                    if (i % 2 == 0 && i != 0) {
                        System.out.print(cgmenos);
                    } else {
                        System.out.print(cgmas);
                    }
                    System.out.println(); 
                }

            break;

            case 17:
                System.out.println(" ");
                System.out.println("F17");
                System.out.println(" ");
                String cgcero = "0";
                String cguno = "1";
                int cgcol;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgcol = scanner.nextInt();
                } while (cgcol <= 0);

                for (int i = 0; i < cgcol; i++) {
                    
                    for (int j = 0; j < i; j++) {
                        System.out.print("    ");
                    }
                    
                    if (i == 0 || i % 2 == 1) {
                        System.out.print(cgcero);
                    } else {
                        System.out.print(cguno);
                    }
                    
                    for (int j = i + 1; j < cgcol; j++) {
                        System.out.print("    "); 
                    }
                    
                    if (i % 2 == 0 && i != 0) {
                        System.out.print(cguno);
                    } else {
                        System.out.print(cgcero);
                    }
                    System.out.println(); 
                }
            break;
            case 18:
                System.out.println(" ");
                System.out.println("F18");
                System.out.println(" ");            

                int cgcnumeros;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgcnumeros = scanner.nextInt();
                } while (cgcnumeros <= 0);

                int[][] cgtriangulo = new int[cgcnumeros][cgcnumeros];

                for (int i = 0; i < cgcnumeros; i++) {
                    cgtriangulo[i][0] = 1; 
                    for (int j = 1; j <= i; j++) {
                        cgtriangulo[i][j] = cgtriangulo[i-1][j-1] + cgtriangulo[i-1][j];
                    }
                    cgtriangulo[i][i] = 2; 

        
                    for (int h = 0; h < cgcnumeros; h++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(cgtriangulo[i][j] + " ");
                        }
                        System.out.println();
                    }
                }

            break;
            case 19:
                System.out.println(" ");
                System.out.println("F19");
                System.out.println(" ");            

                int cgcn;
                do {
                    System.out.print("Ingrese el número de altura (mayor que 0): ");
                    cgcn = scanner.nextInt();
                } while (cgcn <= 0);


                int[][] cgtriangul = new int[cgcn][cgcn];

                for (int i = 0; i < cgcn; i++) {
                    cgtriangul[i][0] = 1; 
                    for (int j = 1; j <= i; j++) {
                        cgtriangul[i][j] = cgtriangul[i-1][j-1] + cgtriangul[i-1][j];
                    }
                    cgtriangul[i][i] = 2; 
                }

                for (int i = 0; i < cgcn; i++) {
                    for (int j = 0; j <= i; j++) {
                        if (j % 2 == 0) {
                            System.out.print("* ");
                        } else {
                            System.out.print(cgtriangul[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

            break;
            default:
            System.out.println("Opción no válida");
                break;
        }
        scanner.close();
    }
    public void cgA02(){    
        
    System.out.print("Ingrese el tamaño de las letras: ");
    int size = App.g2Sc.nextInt();
        
        
    System.out.print("Ingrese el carácter para formar las iniciales: ");
    char ch = App.g2Sc.next().charAt(0);
        
        
    char[][] matrix = new char[size][2 * size + 1]; 
        
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < 2 * size + 1; j++) {
            matrix[i][j] = ' ';
            }
        }
                
    for (int i = 0; i < size; i++) {
        matrix[i][0] = ch; 
        matrix[i][size - 1] = ch; 
        if (i <= size / 2) {
            matrix[i][i] = ch; 
            matrix[i][size - 1 - i] = ch; 
        }
    }
                        
    int offset = size + 1; 
    for (int i = 0; i < size; i++) {
        matrix[0][offset + i] = ch; 
        matrix[size - 1][offset + i] = ch; 
        matrix[i][offset] = ch; 
        if (i >= size / 2) {
            matrix[size / 2][offset + i] = ch; 
            if (i > size / 2) {
                matrix[i][offset + size - 1] = ch; 
            }
        }
    }
                    
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < 2 * size + 1; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    App.g2Sc.close();
}
    public void cgA03(){
        
        String name = "Celeste";
        int nameLength = name.length();
        
        int width = 20; 
        int height = 15; 
                
        for (int y = height; y >= 0; y--) {
            if (y == 0) {
                System.out.print("0 |");
                for (int x = 1; x <= width; x++) {
                    System.out.print("_");
                }
                    System.out.println();
            } else {
                System.out.print(y + " |");
                for (int x = 1; x <= width; x++) {
                    if (2 * x == y) {
                        System.out.print(name.charAt((x - 1) % nameLength));
            } else {
                    System.out.print(" ");
            }
            }
            System.out.println();
            }
        }
    }
    public void cgA04(){
            String name = "Celeste Gallardo";
            int length = name.length();
            char[][] matrix = new char[length][length];
    
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = ' ';
                }
            }
    
            for (int i = 0; i < length; i++) {
                matrix[i][i] = name.charAt(i);
                matrix[i][length - 1 - i] = name.charAt(i);
            }
    
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
    public void cgA05(){
        String fullName = "Celeste Gallardo";
        int length = fullName.length();
        char[][] matrix = new char[length][length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = ' ';
            }
        }

        for (int i = 0; i < length; i++) {
            int row, col;
            do {
                row = random.nextInt(length);
                col = random.nextInt(length);
            } while (matrix[row][col] != ' ');

            char currentChar = fullName.charAt(i);
            if (matrix[row][col] == ' ') {
                matrix[row][col] = currentChar;
            } else {
                matrix[row][col] = '*';
            }

            printMatrixWithDelay(matrix, length);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
    private static void printMatrixWithDelay(char[][] matrix, int length) {
        System.out.println();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void cgL09() {
        String nombreCompleto = "Celeste Gallardo";
        int totalLength = nombreCompleto.length();

        for (int i = 0; i <= totalLength; i++) {
            // Calcular porcentaje actual
            int porcentaje = (int) ((i / (double) totalLength) * 100);

            // Crear la representación progresiva del nombre
            StringBuilder nombreProgresivo = new StringBuilder();
            for (int j = 0; j < totalLength; j++) {
                if (j < i) {
                    nombreProgresivo.append(" ");
                } else if (j == i) {
                    nombreProgresivo.append(nombreCompleto.charAt(j));
                }
            }

            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Imprimir resultado
            System.out.printf("%s%4d%%%n", nombreProgresivo.toString(), porcentaje);

            // Pausar para la animación
            try {
                Thread.sleep(500); // Pausar por 500 milisegundos (0.5 segundos)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void cgL10(){
        Random random = new Random();
        int fileSize = random.nextInt(91) + 10;

        System.out.printf("Downloading ArchivoYarl-win_amd64.whl (%d kB)\n", fileSize);

        for (int i = 0; i <= fileSize; i++) {
            System.out.print("\r[");
            int progress = (int) ((i / (float) fileSize) * 30); 

            for (int j = 0; j < 30; j++) {
                if (j < progress) {
                    System.out.print("\u001B[32m━\u001B[0m"); 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.printf("] %d / %d kB", i, fileSize);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            } 
        }
        System.out.println();
    }
    public void cgL11(){
        Random random = new Random();
        int levels = 10; 

        for (int i = 0; i < levels; i++) {
            int signalLength = random.nextInt(11);
            printSignal(signalLength, i + 1);
        }
    }
    private static void printSignal(int length, int level) {
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("-");
            }
            System.out.print("|");
            for (int j = 0; j < length; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public void cgL12(){

        String[] figure = {
            "   \\|||/   ",
            "    (> <)   ",
            " ooO-(_)-Ooo"
                };
        
                int width = 30; 
                for (int i = 0; i <= width; i++) {
                    printFigure(figure, i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } 
                }
        
                for (int i = width; i >= 0; i--) {
                    printFigure(figure, i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } 
                }
            } 
    private static void printFigure(String[] figure, int offset) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
            for (String line : figure) {
                for (int i = 0; i < offset; i++) {
                    System.out.print(" ");
                }
                System.out.println(line);
            }
    }   
 
}
