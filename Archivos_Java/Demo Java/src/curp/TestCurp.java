package curp;
import java.util.*;
public class TestCurp {
    public static void main(String args[]) {
        Curp curp = new Curp();
        Scanner in = new Scanner(System.in);
        String respuesta = "";
        System.out.println("\t\tGenerador de [CLAVE UNICA DE REGISTO DE POBLACION]");
        System.out.print("Ingrese el nombre: ");
        curp.setnombre(in.nextLine());
        System.out.print("Ingrese el apellido paterno: ");
        curp.setapellidoPaterno(in.nextLine());
        System.out.print("¿Es de nacionalidad extranjera? (Si / No): ");
        respuesta = in.nextLine();
        if (respuesta.equals("no") || respuesta.equals("NO") || respuesta.equals("nO") || respuesta.equals("No")) {
            System.out.print("Ingrese el apellido materno: ");
            curp.setapellidoMaterno(in.nextLine());
            System.out.print("Ingrese el sexo (hombre / mujer): ");
            curp.setsexo(in.nextLine());
            System.out.print("Ingrese el estado: ");
            curp.setestado(in.nextLine());
            System.out.print("Ingrese el dia de nacimiento (DD): ");
            curp.setdiaDeNacimiento(in.nextInt());
            System.out.print("Ingrese el mes de nacimiento (MM): ");
            curp.setmesDeNacimiento(in.nextInt());
            System.out.print("Ingrese el año de naciemto (AAAA): ");
            curp.setyearDeNacimiento(in.nextInt());
            System.out.println(curp.generarCurp());
            } else {
            System.out.print("Ingrese el sexo (hombre / mujer): ");
            curp.setsexo(in.nextLine());
            System.out.print("Ingrese el dia de nacimiento (DD): ");
            curp.setdiaDeNacimiento(in.nextInt());
            System.out.print("Ingrese el mes de nacimiento (MM): ");
            curp.setmesDeNacimiento(in.nextInt());
            System.out.print("Ingrese el año de naciemto (AAAA): ");
            curp.setyearDeNacimiento(in.nextInt());
            System.out.println(curp.generarCurpSinSegundoApellido());
        }
    }
}