public class DoWhileNombreM {
    public void DoWhileM(){
        System.out.println(" ");
        System.out.println("DoWhile: M");
        System.out.println(" ");
        String a = "*";
        String asterisco = "***";

        int i = 1;
        do {
            int r = 1;
            do {
                int k = 1;
                do {
                    System.out.print(asterisco);
                    k++;
                } while (k <= 1);
                System.out.print("       ");
                r++;
            } while (r <= 1);
            System.out.print(asterisco);
            i++;
        } while (i <= 1);
        System.out.println("");

        int k = 1;
        do {
            int l = 1;
            do {
                System.out.print(a);
                l++;
            } while (l <= 5);
            System.out.print("   ");
            k++;
        } while (k <= 2);
        System.out.println("");

        int j = 1;
        do {
            System.out.print(a);
            j++;
        } while (j <= 13);
        System.out.println("");

        int q = 1;
        do {
            int w = 1;
            do {
                System.out.print(a);
                w++;
            } while (w <= 3);
            System.out.print("  ");
            q++;
        } while (q <= 3);
        System.out.println("");

        int e = 1;
        do {
            int l = 1;
            do {
                int r = 1;
                do {
                    int t = 1;
                    do {
                        System.out.print(asterisco);
                        t++;
                    } while (t <= 1);
                    System.out.print("       ");
                    r++;
                } while (r <= 1);
                System.out.print(asterisco);
                l++;
            } while (l <= 1);
            System.out.println("  ");
            e++;
        } while (e <= 5);
        System.out.println(" ");
    }
}
