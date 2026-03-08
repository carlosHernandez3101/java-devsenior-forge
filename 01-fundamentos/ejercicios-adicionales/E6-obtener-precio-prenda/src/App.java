public class App {
    public static void main(String[] args) throws Exception {
        double descuentoPrenda = 0.15;
        int totalAPagarPrenda = 34;

        double precioPrenda = totalAPagarPrenda / (1 - descuentoPrenda);
        
        System.out.println("El precio original de la prenda es: " + precioPrenda);
    }
}
