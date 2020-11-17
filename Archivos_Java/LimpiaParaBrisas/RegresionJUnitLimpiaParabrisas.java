package junitlaboratorios;
import LimpiaParabrisas.PruebaLimpiaParabrisas;

public class RegresionJUnitLimpiaParabrisas {
    public static void main(String[] args) {
      junit.textui.TestRunner.run(PruebaLimpiaParabrisas.suite());
    }
}
