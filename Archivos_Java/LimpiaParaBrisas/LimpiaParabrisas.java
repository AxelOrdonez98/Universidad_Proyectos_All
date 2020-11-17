package LimpiaParabrisas;

public class LimpiaParabrisas {
    public static int VelocidadLimpiaParabrisas(int lever, int dial){
        if (lever == 0) {
            return 0;
        } else {
            if (lever == 1) {
                if (dial == 1) 
                    return 6;
                if (dial == 2) 
                    return 12;
                if (dial == 3) 
                    return 20;
            }
            if (lever == 2)
                return 30;
            if (lever == 3)
                return 60;
        }
        return 0;
    }
}
