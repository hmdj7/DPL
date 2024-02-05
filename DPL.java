import java.util.Scanner;

public class DPL {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Imprimir un saludo con el nombre ingresado
        System.out.println("¡Hola, " + nombre + "! Bienvenido a tu aplicación sencilla en Java.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
