public class DoWhileApellidoG {
    public void DoWhileG(){
        System.out.println(" ");
        System.out.println("DoWhile: G");
        System.out.println(" ");
        String a = "*";
        String asterisco = "****";

        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(a);
                j++;
            } while (j <= 14);
            System.out.println("");
            i++;
        } while (i <= 2);

        int q = 1;
        do {
            int j = 1;
            do {
                int k = 1;
                do {
                    System.out.print(asterisco);
                    k++;
                } while (k <= 1);
                System.out.print("      ");
                j++;
            } while (j <= 1);
            System.out.print(asterisco);
            q++;
        } while (q <= 1);
        System.out.println(" ");
        
        int j = 1;
        do {
            System.out.print(asterisco);
            j++;
        } while (j <= 1);
        System.out.println(" ");
        
        int x = 4;
        do {
            if (x==4||x==6){
                int s = 1;
                do {
                    System.out.print(a);
                    s++;
                } while (s <= x);
                System.out.print("");
            } if (x==5) {
                int c = 1;
                do {
                    System.out.print("");
                    c++;
                } while (c <= x);
            } else {
                int v = 1;
                do {
                    System.out.print(" ");
                    v++;
                } while (v <= x);
            }
            System.out.print("");
            x++;
        } while (x <= 6);
        System.out.println("");
        
        int m = 1;
        do {
            int e = 1;
            do {
                int r = 1;
                do {
                    int k = 1;
                    do {
                        System.out.print(asterisco);
                        k++;
                    } while (k <= 1);
                    System.out.print("      ");
                    r++;
                } while (r <= 1);
                System.out.print(asterisco);
                e++;
            } while (e <= 1);
            System.out.println(" ");
            m++;
        } while (m <= 2);

        int t = 1;
        do {
            int y = 1;
            do {
                System.out.print(a);
                y++;
            } while (y <= 14);
            System.out.println("");
            t++;
        } while (t <= 2);
        System.out.println(" ");
    }
}
