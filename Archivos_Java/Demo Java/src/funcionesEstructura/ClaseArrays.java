package funcionesEstructura;
import java.util.Arrays;
public class ClaseArrays {
    public void cargar() {
        int ar [] = {4, 6, 1, 8, 3, 9, 7, 4, 2}; 
        System.out.print(Arrays.toString(ar));
    }
    public static void main(String args[]) {
        ClaseArrays pv = new ClaseArrays();
        pv.cargar();
    }
}
