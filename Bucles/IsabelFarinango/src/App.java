public class App {
    public static void main(String[] args) {

        // Declarar / Instanciar :
        // FOR
        ForNombreA inicialNombreFor = new ForNombreA();
        ForApellidoF inicialApellidoFor = new ForApellidoF();
        ForNombreApellidoAF inicialNombreApellidoFor = new ForNombreApellidoAF();

        // WHILE
        WhileNombreA inicialNombreWhile = new WhileNombreA();
        WhileApellidoF inicialApellidoWhile = new WhileApellidoF();
        WhileNombreApellidoAF inicialNombreApellidoWhile = new WhileNombreApellidoAF();

        // DOWHILE
        DoWhileNombreA inicialNombreDoWhile = new DoWhileNombreA();
        DoWhileApellidoF inicialApellidoDoWhile = new DoWhileApellidoF();
        DoWhileNombreApellidoAF inicialNombreApellidoDoWhile = new DoWhileNombreApellidoAF();

        // Llamar al mEtodo :
        // FOR
        inicialNombreFor.inicialNombre(5, '*');
        inicialApellidoFor.inicialApellido(5, '*');
        inicialNombreApellidoFor.forNombreApellido(5, "*");

        // WHILE
        inicialNombreWhile.whileInicalNombre(5, '*');
        inicialApellidoWhile.whileApellido(5, '*');
        inicialNombreApellidoWhile.whileNombreApellidoLA(5, '*');

        // DOWHILE
        inicialNombreDoWhile.doWhileNombre(5, '*');
        inicialApellidoDoWhile.doWhileApellido(5, '*');
        inicialNombreApellidoDoWhile.doWhileNombreApellido(5, '*');

    }
}