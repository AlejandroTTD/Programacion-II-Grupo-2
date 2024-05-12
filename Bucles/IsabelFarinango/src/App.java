public class App {
    public static void main(String[] args) {
        // DECLARAR - INSTANCIAR

        // FOR
        ForNombreA inicialA = new ForNombreA();
        ForApellidoF inicialF = new ForApellidoF();
        ForNombreApellidoAF inicialFA = new ForNombreApellidoAF();

        // WHILE
        WhileNombreA inicialAWhile = new WhileNombreA();
        WhileApellidoF inicialFWhile = new WhileApellidoF();
        WhileNombreApellidoAF inicialFAWhile = new WhileNombreApellidoAF();

        // DO-WHILE
        // DoWhileNombreA inicialADoWhile = new DoWhileNombreA();
        // DoWhileApellidoF inicialFDoWhile = new DoWhileApellidoF();
        // DoWhileNombreApellidoAF inicialFADoWhile = new DoWhileNombreApellidoAF();

        // LLAMAR METODO

        // FOR
        inicialA.inicialA(5, '*');
        inicialF.inicialF(5, '*');
        inicialFA.inicialFA(6, '*');

        // WHILE
        inicialAWhile.inicialA(5, '*');
        inicialFWhile.inicialF(6, '*');
        inicialFAWhile.inicialFA(5, '*');

        // DO-WHILE
        // inicialADoWhile.inicialA(5, '*');
        // inicialFDoWhile.inicialF(5, '*');
        // inicialFADoWhile.inicialFA(5, '*');
    }
}
