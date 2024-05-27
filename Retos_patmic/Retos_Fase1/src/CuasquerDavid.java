/* Copyright (C) 2k24, AlejandroTTD
 * davidcuasquer21@gmail.com
 * Version 1.0
 */
public class CuasquerDavid {
    public int dcNum;

    public int getdcNum() {
        return dcNum;
    }
    public void setdcNum(int dcNum) {
        this.dcNum = dcNum;
    }
    // SN1:  0 1 1 2 3 5 8 13 ...
    public void dcSN1(int dcNum){
        System.out.println();
        System.out.println("Ingrese el numero de cifras para la serie:");
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
        System.out.println("Ingrese el numero de cifras para la serie:");
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
        System.out.println("Ingrese el numero de cifras para la serie:");
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
        System.out.println("Ingrese el numero de cifras para la serie:");
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
        System.out.println("Ingrese el numero de cifras para la serie:");

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
        System.out.println("Ingrese el numero de cifras para la serie:");
        System.out.println("Sucesion Numerica 6:");
        for(int dcI = 1; dcI <= dcNum ; dcI++){
            System.out.print((dcI*dcI)+" ");
        }
    }
    // Sn7: 1 4 7 10 13 16 19 22 25  ...
    public void dcSN7(int dcNum){
        System.out.println();
        System.out.println("Ingrese el numero de cifras para la serie:");
        System.out.println("Sucesion Numerica 7:");
        for(int dcI = 0; dcI < dcNum ; dcI++){
            System.out.print((1+ (dcI*3))+" ");
        }
    }
    // Sn8: 3, 8, 13, 18, 23, 28, 33, 38, ...
    public void dcSN8(int dcNum){
        System.out.println();
        System.out.println("Ingrese el numero de cifras para la serie:");
        System.out.println("Sucesion Numerica 8:");
        for(int dcI = 0; dcI < dcNum ; dcI++){
            System.out.print((3+(dcI*5))+", ");
        }
    }
    // Sn9: 2, 4, 8, 16, 32, 64, 128, 256, ...
    public void dcSN9(int dcNum){
        System.out.println();
        System.out.println("Ingrese el numero de cifras para la serie:");
        System.out.println("Sucesion Numerica 9:");
        for(int dcI = 1; dcI <= dcNum; dcI++){
            System.out.print((int)Math.pow(2, dcI)+", ");
        }
    }
    // Sn10: 3, 9, 27, 81, 243, 729, 2187, ...
    public void dcSN10(int dcNum){
        System.out.println();
        System.out.println("Ingrese el numero de cifras para la serie:");
        System.out.println("Sucesion Numerica 10:");
        for(int dcI =1; dcI <= dcNum; dcI++){
            System.out.print((int)Math.pow(3, dcI)+", ");
        }
    }
}
