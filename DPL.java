import java.util.Scanner;

public class DPL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Consultar documentación de usuario");
            System.out.println("2. Consultar documentación técnica");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    consultarDocumentacionUsuario();
                    break;
                case 2:
                    consultarDocumentacionTecnica();
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void consultarDocumentacionUsuario() {
        // Código para mostrar la documentación de usuario en PDF
        System.out.println("Mostrar documentación de usuario en PDF...");
    }

    private static void consultarDocumentacionTecnica() {
        // Código para mostrar la documentación técnica con JavaDoc
        System.out.println("Mostrar documentación técnica con JavaDoc...");
    }
}