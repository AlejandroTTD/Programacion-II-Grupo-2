public class ForApellidoG {
    public void forG(){
        System.out.println(" ");
        System.out.println("for: G");
        System.out.println(" ");
        String a = "*";
        String asterisco = "****";

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 14; j++) {
                System.out.print(a);
            }
            System.out.println("");
        }

        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++) {
                for (int k = 1; k <= 1; k++) {
                    System.out.print(asterisco);
                }
                System.out.print("      ");
            }
            System.out.print(asterisco);
        }
        System.out.println(" ");
        
        for (int j = 1; j <= 1; j++) {
            System.out.print(asterisco);
        }
        System.out.println(" ");
        
        for (int i = 4; i <= 6; i++) {
            if (i==4)
                for (int s = 1; s <= i; s++)
                    System.out.print(a);
            if (i==6)
                for (int s = 1; s <= i; s++)
                    System.out.print(a);
            if (i==5)
                for (int s = 1; s <= i; s++)
                    System.out.print("");
            else                    
                for (int sp = 1; sp <= i; sp++)
                        System.out.print(" ");
            System.out.print("");           
        }    
        System.out.println(" ");
        
        for (int m = 1; m <= 2; m++) {
            for (int i = 1; i <= 1; i++) {
                for (int j = 1; j <= 1; j++) {
                    for (int k = 1; k <= 1; k++) {
                        System.out.print(asterisco);
                    }
                    System.out.print("      ");
                }
                System.out.print(asterisco);
            }
            System.out.println(" ");
        }
        
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 14; j++) {
                System.out.print(a);
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
}
