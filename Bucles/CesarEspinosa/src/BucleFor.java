public class BucleFor {
    // metodo escalera
    public void escalera() {
        System.out.println("ESCALERA: ");
        int nivel = 10;
        String escalon = "|_";
        for (int i = 1; i < nivel; i++) {
            for (int s = 0; s < i; s++)
                System.out.print("  ");
            System.out.println(escalon);
        }
    }
}