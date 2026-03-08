import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numeroA = 0;
        int numeroB = 0;

        System.out.println("Digite el primer número:");
        numeroA = sc.nextInt();
        System.out.println("Digite el segundo número:");
        numeroB = sc.nextInt();

        int resultadoSuma = numeroA + numeroB;
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = numeroA - numeroB;
        System.out.println("La resta es: " + resultadoResta);

        int resultadoMultiplicacion = numeroA * numeroB;
        System.out.println("La multiplicación es: " + resultadoMultiplicacion);

        if (numeroB == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            double resultadoDivision = numeroA / numeroB;
            System.out.println("La división es: " + resultadoDivision);
        }
        
    }
}
