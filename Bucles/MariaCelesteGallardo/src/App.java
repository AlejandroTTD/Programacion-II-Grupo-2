public class App {
    public static void main(String[] args) throws Exception {
        ForNombreM fM;
        ForApellidoG fG;
        ForNombreApellidoMG fMg;

        WhileNombreM wM;
        WhileApellidoG wG;
        WhileNombreApellidoMG wMg;

        DoWhileNombreM dM;
        DoWhileApellidoG dG;
        DoWhileNombreApellidoMG dMg;



        fM = new ForNombreM();
        fG = new ForApellidoG();
        fMg = new ForNombreApellidoMG();

        wM = new WhileNombreM();
        wG = new WhileApellidoG();
        wMg = new WhileNombreApellidoMG();

        dM = new DoWhileNombreM();
        dG = new DoWhileApellidoG();
        dMg = new DoWhileNombreApellidoMG();
        


        fM.forM();
        fG.forG();
        fMg.forMG();

        wM.WhileM();
        wG.WhileG();
        wMg.WhileMG();

        dM.DoWhileM();
        dG.DoWhileG();
        dMg.DoWhileMG();
    }
}
