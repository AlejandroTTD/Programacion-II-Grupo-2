public class App {
    public static void main(String[] args) throws Exception {
        
        // declarar
        BucleFor                   bf;
        ForNombreC                 fc;
        ForApellidoE               fe;
        ForNombreApellidoCE        fce;

        WhileNombreC               wc;
        WhileApellidoE             we;
        WhileNombreApellidoCE      wce;

        DoWhileNombreC             dc;
        DoWhileApellidoE           de;
        DoWhileNombreApellidoCE    dce;

        // instanciar
        fc = new ForNombreC();
        fe = new ForApellidoE();
        fce = new ForNombreApellidoCE();

        wc = new WhileNombreC();
        we = new WhileApellidoE();
        wce = new WhileNombreApellidoCE();

        dc = new DoWhileNombreC();
        de = new DoWhileApellidoE();
        dce = new DoWhileNombreApellidoCE();

        // llamar al método
        fc.nombreCFor();
        fe.apellidoEFor();
        fce.nombreApellidoCEFor();
        
        wc.nombreCWhile();
        we.apellidoEWhile();
        wce.nombreapellidoCEwhile();

        dc.nombreCDoWhile();
        de.apellidoEDoWhile();
        dce.nombreApellidoCEDoWhile();

        System.out.println(" ");
    }
}
