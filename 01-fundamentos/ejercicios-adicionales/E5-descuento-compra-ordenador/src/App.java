public class App {
    public static void main(String[] args) throws Exception {
        int precioBrutoOrdenador = 660;
        double precioNetoOrdenador = precioBrutoOrdenador - (precioBrutoOrdenador * 0.1);

        System.out.println("Precio neto del ordenador: " + precioNetoOrdenador);
    }
}
