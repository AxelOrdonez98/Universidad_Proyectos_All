package Persona;
import Persona.Persona;
import Persona.Jugador;
import Persona.Delantero;
import Persona.Defensa;
import Persona.Portero;
import Persona.Arbitro;
import Persona.Entrenador;
import java.util.Scanner;
public class TestJugadorPolimorfismo2 {
    private Scanner in = new Scanner(System.in);
    Persona persona;
    public static void main(String args[]) {
        TestJugadorPolimorfismo2 phi = new TestJugadorPolimorfismo2();
        phi.menu();
    }
    public void capturarDatosPersona() {
        System.out.print("-Introdusca el nombre del jugador: ");
        persona.setNombre(in.nextLine());
        System.out.print("-Introdusca la edad del jugador: ");
        persona.setEdad(in.nextInt());
    }
    public void capturarDatosJugador() {
        if (persona instanceof Jugador) {
            Jugador jugador = (Jugador) persona;
            System.out.print("-Ingrese el nombre del equipo: ");
            jugador.setNombreDelEquipo(in.next());
            System.out.print("-Ingrese el numero del jugdor: ");
            jugador.setNumeroDeJugador(in.nextInt());
        }
    }
    public void capturarDatosDelanter() {
        if (persona instanceof Delantero) {
            Delantero delantero = (Delantero) persona;
            System.out.print("-Ingrese los numeros de goles: ");
            delantero.setNumeroDeGoles(in.nextInt());
            System.out.print("-Ingrese si el delantero hace fintas ( TRUE / FALSE): ");
            delantero.setFintas(in.nextBoolean());
        }
    }
    public void capturarDatosDefensa() {
        if(persona instanceof Defensa) {
            Defensa defensa = (Defensa) persona;
            System.out.print("-Ingrese si el jugador es resistente a golpes ( TRUE / FALSE): ");
            defensa.setResistenciaAGolpes(in.nextBoolean());
            System.out.print("-Ingrese si el defensa titular ( TRUE / FALSE): ");
            defensa.setTitular(in.nextBoolean());
        }
    }
    public void capturaDatosPortero() {
        if (persona instanceof Portero) {
            Portero portero = (Portero) persona;
            System.out.print("-Ingrese si el portero es elastico ( TRUE / FALSE): ");
            portero.setElastico(in.nextBoolean());
            System.out.print("-Ingrese el numero de atajados del portero: ");
            portero.setNumeroDeAtajadas(in.nextInt());
        }
    }
    public void capturarDatosArbitro() {
        if (persona instanceof Arbitro) {
            Arbitro arbitro = (Arbitro) persona;
            System.out.print("-Ingrese la nacionalidad del arbitro: ");
            arbitro.setNacionalidad(in.next());
            System.out.print("-Ingrese el numero de años trabajando: ");
            arbitro.setYearsDeArbitro(in.nextInt());
        }
    }
    public void capturarDatosEntrenador() {
        if (persona instanceof Entrenador) {
            Entrenador entrenador = (Entrenador) persona;
            System.out.print("-Ingrese el conocimiento del entrenador (Diplomas, reconocimiento, etc.): ");
            entrenador.setConocimiento(in.next());
            System.out.print("-Ingrese si el entrenador es motivacional ( TRUE / FALSE): ");
            entrenador.setMotivacion(in.nextBoolean());
        }
    }
    public void imprimir() {
        System.out.print(""+persona);
    }
    public void menu() {
        TestJugadorPolimorfismo2 xi = new TestJugadorPolimorfismo2();
        int opc = 0, opc2 = 0, opc3 = 0, opc4 = 0, opc5 = 0, opc6 = 0;
        do {
            System.out.print("0)Salir"
                    + "\n1)Entrenador"
                    + "\n2)Arbitro"
                    + "\n3)Jugadores"
                    + "\nOpciones: ");
            opc = in.nextInt();
            switch (opc) {
                case 1 :
                    persona = new Entrenador();
                    xi.capturarDatosPersona();
                    xi.capturarDatosEntrenador();
                    xi.imprimir();
                    break;
                case 2 :
                    persona = new Arbitro();
                    xi.capturarDatosPersona();
                    xi.capturaDatosPortero();
                    xi.imprimir();
                    break;
                case 3 :
                    
                    break;
            }
        } while (opc != 0);
        System.out.println("\tAdios");
    }
}