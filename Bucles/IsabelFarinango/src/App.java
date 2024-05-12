public class App {
    public static void main(String[] args) {

        // Declarar / Instanciar :

        // FOR
        ForNombreA inicialNombreFor = new ForNombreA();
        ForApellidoF inicialApellidoFor = new ForApellidoF();
        ForNombreApellidoAF inicialNombreApellidoFor = new ForNombreApellidoAF();

        // Llamar al método :
        // FOR
        inicialNombreFor.inicialNombre(5, '*'); // Debería imprimir la letra A con asteriscos
        inicialApellidoFor.inicialApellido(5, '*'); // Debería imprimir la letra F con asteriscos
        inicialNombreApellidoFor.forNombreApellido(5, "*"); // Debería imprimir ambas letras

    }
}
