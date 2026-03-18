import java.util.Scanner;

public class App {
    static double nota1, nota2, nota3;
    static String nombre = "";

    public static boolean validarNota(double nota) {
        if (nota > 0 && nota <= 100) {
            return true;
        }
        return false;
    }

    public static boolean validarNombre(String nombre) {
        if (nombre.isEmpty() || nombre.equals(" ")) {
            return false;
        }
        return true;
    }

    public static double ingresarNota(Scanner scanner, String mensaje) {
        double nota = 0;
        boolean notaValida = false;

        while (notaValida == false) {
            System.out.println(mensaje);
            nota = scanner.nextDouble();

            notaValida = validarNota(nota);
            if (notaValida == false) {
                System.out.println("La nota ingresada no es válida. Por favor, ingrese una nota entre 0 y 100.\n");
            }
        }
        return nota;
    }

    public static String ingresarNombre(Scanner scanner) {
        boolean nombreValido = false;
        String n = "";
        while (nombreValido == false) {
            System.out.println("Ingrese el nombre del estudiante:");
            n = scanner.nextLine();

            nombreValido = validarNombre(n);
            if (nombreValido == false) {
                System.out.println("El nombre ingresado no es válido. Por favor, ingrese un nombre no vacío.\n");
            }
        }
        return n;
    }

    public static void registrarDatosEstudiante(Scanner scanner) {
        nombre = ingresarNombre(scanner);

        nota1 = ingresarNota(scanner, "Ingrese la nota 1 del estudiante:");
        nota2 = ingresarNota(scanner, "Ingrese la nota 2 del estudiante:");
        nota3 = ingresarNota(scanner, "Ingrese la nota 3 del estudiante:");

        // Limpiar el buffer del scanner después de leer números
        scanner.nextLine();
        System.out.println("Datos del estudiante registrados exitosamente.\n");
    }

    public static void mostrarDatosEstudiante() {
        if (nombre.isEmpty()) {
            System.out.println("No se han registrado datos de ningún estudiante.\n");
        } else {
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3 + "\n");
        }
    }

    public static double calcularPromedio() {
        double promedio = 0;
        if (nombre.isEmpty()) {
            return 0;
        } else {
            promedio = (nota1 + nota2 + nota3) / 3;
            return promedio;
        }
    }

    public static void mostrarMenu() {
        System.out.println("1. Registrar datos de un estudiante");
        System.out.println("2. Mostrar datos del estudiante actual");
        System.out.println("3. Calcular promedio de notas del estudiante actual");
        System.out.println("0. Salir");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        double promedio = 0;

        System.out.println("--- Sistema de Registro de Estudiantes ---");
        do {
            mostrarMenu();
            System.out.println("Ingrese su opción:");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    registrarDatosEstudiante(scanner);
                    break;
                case "2":
                    mostrarDatosEstudiante();
                    break;
                case "3":
                    promedio = calcularPromedio();
                    System.out.printf("El promedio de notas del estudiante es: %.2f\n\n", promedio);
                    break;
                case "0":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (!opcion.equals("0"));
    }
}
