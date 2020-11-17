
package triangulo;

public class Triangulo {
    
    public static int tipoTriangulo(int l1, int l2, int l3){
        
       if(l1<=0 ||l2<0 ||l3<0){
           return 0;
       }
       if(l1>=(l2+l3)||l2>=(l1+l3)||l3>=(l1+l2)){
           return 0;
       }
        if(l1==l2 && l2==l3 && l1==l3){
            return 1;
        }
        if(l1==l2 || l1==l3 ||l2==l3){
            return 2;
        }
        return 3;
    }
    
}
