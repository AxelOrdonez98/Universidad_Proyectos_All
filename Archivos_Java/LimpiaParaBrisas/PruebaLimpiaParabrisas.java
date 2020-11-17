package LimpiaParabrisas;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import static LimpiaParabrisas.LimpiaParabrisas.VelocidadLimpiaParabrisas;

public class PruebaLimpiaParabrisas {
    @Test public void TablaDeCondicionesVelocidadLimpiaParabrisas(){
        assertEquals(VelocidadLimpiaParabrisas(0, 0), 0);
        assertEquals(VelocidadLimpiaParabrisas(1, 1), 0);
        assertEquals(VelocidadLimpiaParabrisas(1, 2), 0);
        assertEquals(VelocidadLimpiaParabrisas(1, 3), 0);
        assertEquals(VelocidadLimpiaParabrisas(2, 0), 0);
        assertEquals(VelocidadLimpiaParabrisas(3, 0), 0);
        
    }
    
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(PruebaLimpiaParabrisas.class);
    }
}
