public class App {
    public static void main(String[] args) throws Exception {
        double valorPorcion = 5.95;  // Valor de una porción de 100 gramos
        double gramosPorcion = 100.0;  // Cantidad de gramos en una porción
        double gramosEnKilogramo = 1000.0;  // Cantidad de gramos en un kilogramo

        double porcionesEnKilogramo = gramosEnKilogramo / gramosPorcion;  // Calcula cuántas porciones hay en un kilogramo
        double precioKiloReal = valorPorcion * porcionesEnKilogramo;  // Calcula el precio de un kilogramo

        System.out.println("El precio real de un kilogramo del producto Pernil Iberic D'Engreix Llen. Azuaga es: " + precioKiloReal);
    }
}
