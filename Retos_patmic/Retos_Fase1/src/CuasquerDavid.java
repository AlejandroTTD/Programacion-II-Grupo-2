
/* Copyright (C) 2k24, AlejandroTTD
 * davidcuasquer21@gmail.com
 * Version 1.0
 */
public class CuasquerDavid {
    // SN1:  0 1 1 2 3 5 8 13 ...
    public void dcSN1(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 1:");
        int dcA = 0;
        int dcB = 1;

        for(int dcI = 1; dcI <= dcNum ; dcI++){
            System.out.print(dcA+" ");
            int dcJ = dcA;
            dcA = dcB;
            dcB = dcJ + dcA;
        }
    }
    // Sn2:  1 0 3 0 5 0 7 0 9 ...
    public void dcSN2(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 2:");
        for(int dcI = 1; dcI <= dcNum ; dcI++){
            if(dcI % 2 == 0){
                System.out.print("0 ");
            }
            else{
                System.out.print(dcI+" ");
            }
        }
    }
    // Sn3:  0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
    public void dcSN3(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 3:");
        int dcA = 0;
        int dcB = 1;
        int dcK = 1;
        for(int dcI = 1; dcI <= dcNum ; dcI++){
            System.out.print(dcA+"/"+dcK+" ");
            int dcJ = dcA;
            dcA = dcB;
            dcB = dcJ + dcA;
            dcK += 2;
        }
    }
    // Sn4:  0/2 1/4 1/6 2/8 3/10 5/12 8/14 13/16 ...
    public void dcSN4(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 4:");
        int dcA = 0;
        int dcB = 1;
        int dcK = 2;
        for(int dcI = 1; dcI <= dcNum ; dcI++){
            System.out.print(dcA+"/"+dcK+" ");
            int dcJ = dcA;
            dcA = dcB;
            dcB = dcJ + dcA;
            dcK += 2;
        }
    }
    // Sn5:  2 3 5 7 11 13 17 19 23 29 31 ...
    public void dcSN5(int dcNum){
        System.out.println();


        System.out.println("Sucesion Numerica 5:");
        int dcI = 1;
        int dcK = 2;
        int dcDivisor = 2;
        while (dcI <= dcNum) {
            if (dcK % dcDivisor == 0) {
                if (dcK == dcDivisor) {
                    System.out.print(dcK + ", ");
                    dcI++;
                }
                dcDivisor = 2;
                dcK++;
            } else {
                dcDivisor++;
            }
        }
    }
    // Sn6:  1 4 9 16 25 36 49 64 ...
    public void dcSN6(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 6:");
        for(int dcI = 1; dcI <= dcNum ; dcI++){
            System.out.print((dcI*dcI)+" ");
        }
    }
    // Sn7: 1 4 7 10 13 16 19 22 25  ...
    public void dcSN7(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 7:");
        for(int dcI = 0; dcI < dcNum ; dcI++){
            System.out.print((1+ (dcI*3))+" ");
        }
    }
    // Sn8: 3, 8, 13, 18, 23, 28, 33, 38, ...
    public void dcSN8(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 8:");
        for(int dcI = 0; dcI < dcNum ; dcI++){
            System.out.print((3+(dcI*5))+", ");
        }
    }
    // Sn9: 2, 4, 8, 16, 32, 64, 128, 256, ...
    public void dcSN9(int dcNum){
        System.out.println();

        System.out.println("Sucesion Numerica 9:");
        for(int dcI = 1; dcI <= dcNum; dcI++){
            System.out.print((int)Math.pow(2, dcI)+", ");
        }
    }
    // Sn10: 3, 9, 27, 81, 243, 729, 2187, ...
    public void dcSN10(int dcNum){
        System.out.println();
        System.out.println("Sucesion Numerica 10:");
        for(int dcI = 1; dcI <= dcNum; dcI++){
            System.out.print((int)Math.pow(3, dcI)+", ");
        }
    }
    // C09)   Ingresa una frase y convertir una leta a mayusculas y otra a minisculas
    //         Ejemplo, frase : di mi nombre
    //                 salida : Di Mi NoMbRe
    public String dcC09(String dcFrase) {
        char[] dcCaracteres = dcFrase.toCharArray();
        boolean dcConvertirMayuscula = true; 
        for (int i = 0; i < dcCaracteres.length; i++) {
            if (Character.isLetter(dcCaracteres[i])) {
                if (dcConvertirMayuscula) {
                    dcCaracteres[i] = Character.toUpperCase(dcCaracteres[i]);
                } else {
                    dcCaracteres[i] = Character.toLowerCase(dcCaracteres[i]);
                }
                dcConvertirMayuscula = !dcConvertirMayuscula; 
            }
        }
        return new String(dcCaracteres);
    }

    // A01)    Crear una array para cada palabra de su nombre e ingrese el porcentaje de carga para cada palabra.
    // Ejemplo:    Pancracia Carmeliana Altamirano Perez 
    
    // Ingrese el porcentaje de carga: 100 75 50 25
    // Pancracia Carmeliana Altamirano Perez 

    // [==============>] 100% Pancracia
    // [==========>    ]  75% Carmeli
    // [=======>       ]  50% Altam
    // [===>           ]  25% Pe
    
    public void dcA01(String[] dcNombres, int[] dcPorcentajes) {
        // Iterar sobre los nombres y porcentajes
        for (int i = 0; i < dcNombres.length; i++) {
            String dcNombre = dcNombres[i];
            int dcPorcentaje = dcPorcentajes[i];

            // Calcular el número de caracteres a mostrar
            int lengthToShow = (int) Math.ceil(dcNombre.length() * dcPorcentaje / 100.0);

            // Subcadena con los caracteres a mostrar
            String dcSubcadena = dcNombre.substring(0, lengthToShow);

            // Crear la barra de progreso
            StringBuilder dcBarra = new StringBuilder("[");
            int numHashes = dcPorcentaje / 10;
            for (int j = 0; j < 10; j++) {
                if (j < numHashes) {
                    dcBarra.append("=");
                } else {
                    dcBarra.append(" ");
                }
            }
            dcBarra.append("] ");

            // Imprimir resultado
            System.out.printf("%s%3d%% %s\n", dcBarra, dcPorcentaje, dcSubcadena);
            }
        }
    
    // R01) crear un metodo recursivo para obtener factorial(n)
    public int dcR01(int dcN){
        if (dcN <= 1) {
            return 1;
        }
        return dcN * dcR01(dcN - 1);  
    }
    // R02) crear un metodo recursivo para obtener la suma(a,b)  
    public int dcR02(int dcA, int dcB){
        if (dcB==0){
            return dcA;
        }
        return dcR02(dcA+1, dcB-1);
    }
    // R03) crear un metodo recursivo para obtener la multiplicacion(a,b)
    public int dcR03(int dcA, int dcB){
        if (dcB==0){
            return 0;
        }
        return dcA + dcR03(dcA, dcB-1);
    }
    // R04) crear un metodo recursivo para obtener la potencia(a,b) 
    public int dcR04(int dcA, int dcB){
        if (dcB==0){
            return 1;
        }
        return dcA * dcR04(dcA, dcB-1);
    }
    // R05) crear un metodo recursivo para obtener la conteoProgregresivoHasta(n) / imprimir el avance
    public void dcR05(int dcN){
        if (dcN < 0){
            return;
        }
        dcR05(dcN-1);
        System.out.println(dcN);
    }
    // R06) crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0 / imprimir el avance
    public void dcR06(int dcN){
        if (dcN < 0){
            return;
        }
        System.out.println(dcN);
        dcR06(dcN-1);
    }
}
