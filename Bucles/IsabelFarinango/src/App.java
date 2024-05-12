public class App {
    public static void main(String[] args) {
        // Declaramos e instanciamos las variables en el orden de tipo for, while y do
        // while.
        ForNombreA inicialA = new ForNombreA();
        ForApellidoF inicialF = new ForApellidoF();
        ForNombreApellidoAF inicialFA = new ForNombreApellidoAF();

        // Invocamos cada método creado en las respectivas clases en el orden for, while
        // y do-while.
        inicialA.inicialA(5, '*');
        inicialF.inicialF(5, '*');
        inicialFA.inicialFA(6, '*');
    }
}
