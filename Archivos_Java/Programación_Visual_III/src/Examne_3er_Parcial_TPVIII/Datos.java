package Examne_3er_Parcial_TPVIII;

/**
 *
 * @author Axel Ordoñez
 */
public class Datos {

    public void comparacion() {
        int[] elementos = {1, 12, 5, 111, 200, 1000, 10};
        int dinero = 50, result = 0, cantidad = 0;
        System.out.println("Cantidad de dinero: " + dinero);
        for (int i = 0; i < elementos.length; i++) {
            cantidad++;
        }
        System.out.println("Cantidad de precios: " + cantidad);
        System.out.println("Precios: ");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("\t-$" + elementos[i]);
        }
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] <= dinero) {
                result++;
            }
        }
        System.out.println("Cantidad de elementos que puede comprar: " + result);
    }
}
