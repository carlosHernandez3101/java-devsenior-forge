import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new java.util.Scanner(System.in);
        double temperaturaCelsius = 0.0d;
        
        System.out.println("Digite la temperatura en Celsius: ");
        temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        double temperaturaKelvin = temperaturaCelsius + 273.15;

        System.out.println("La temperatura en Fahrenheit es: " + temperaturaFahrenheit);
        System.out.println("La temperatura en Kelvin es: " + temperaturaKelvin);
    }
}
