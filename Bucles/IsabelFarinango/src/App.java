public class App {
    public static void main(String[] args) {

        // Declarar / Instanciar :
        // FOR
        ForNombreA inicialNombreFor = new ForNombreA();
        ForApellidoA inicialApellidoFor = new ForApellidoA();
        ForNombreApellidoLA inicialNombreApellidoFor = new ForNombreApellidoLA();

        // WHILE
        WhileNombreL inicialNombreWhile = new WhileNombreL();
        WhileApellidoA inicialApellidoWhile = new WhileApellidoA();
        WhileNombreApellidoLA inicialNombreApellidoWhile = new WhileNombreApellidoLA();

        // DOWHILE
        DoWhileNombreL inicialNombreDoWhile = new DoWhileNombreL();
        DoWhileApellidoA inicialApellidoDoWhile = new DoWhileApellidoA();
        DoWhileNombreApellidoLA inicialNombreApellidoDoWhile = new DoWhileNombreApellidoLA();

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