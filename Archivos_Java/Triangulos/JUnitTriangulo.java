
package junittriangulo;
import Triangulo.*;
public class JUnitTriangulo {
    
    public static void main(String[] args) {
        if(triangulo.Triangulo.tipoTriangulo(3, 4, 5)==3){
            System.out.println("El triangulo es escaleno");
        }
        else if(triangulo.Triangulo.tipoTriangulo(1, 1, 1)==1){
            System.out.println("El triangulo es equilatero");
        }
        else if(triangulo.Triangulo.tipoTriangulo(2, 2, 3)==2){
            System.out.println("El triangulo es isoceles  ");
        }
    }
}
