public class App {
    public static void main(String[] args) throws Exception {
        int longitud = 0;
        int ancho = 0;

        System.out.println("Calculadora de área y perímetro de un rectángulo");
        System.out.print("Ingrese la longitud del rectángulo: ");
        longitud = Integer.parseInt(System.console().readLine());

        System.out.print("Ingrese el ancho del rectángulo: ");
        ancho = Integer.parseInt(System.console().readLine());

        int area = longitud * ancho;
        int perimetro = 2 * (longitud + ancho);
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
