import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double primerNumero;
        double segundoNumero;
        double tercerNumero;

        System.out.println("Calcular el promedio de tres numeros");

        System.out.println("Ingrese el primer numero: ");
        primerNumero = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        segundoNumero = sc.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        tercerNumero = sc.nextDouble();

        double resultado = (primerNumero + segundoNumero + tercerNumero) / 3;

        System.out.println("El promedio de los tres numeros es: " + resultado);
    }
}
