
package triangulo;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import static triangulo.Triangulo.tipoTriangulo;

public class PruebaTriangulo {
    
    @Test public void TablaDeCondicionesTipoTriangulo(){
        assertEquals(tipoTriangulo(0,1,1),0);
        assertEquals(tipoTriangulo(1,-1,1),0);
        assertEquals(tipoTriangulo(0,1,0),0);
        assertEquals(tipoTriangulo(2,1,1),0);
        assertEquals(tipoTriangulo(1,3,1),0);
        assertEquals(tipoTriangulo(1,1,2),0);
        assertEquals(tipoTriangulo(0,1,1),0);
        assertEquals(tipoTriangulo(1,1,1),1);
        assertEquals(tipoTriangulo(2,2,3),2);
        assertEquals(tipoTriangulo(2,3,2),2);
        assertEquals(tipoTriangulo(2,3,3),2);
        assertEquals(tipoTriangulo(3,4,5),3);

    }
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(PruebaTriangulo.class);
    }
}
