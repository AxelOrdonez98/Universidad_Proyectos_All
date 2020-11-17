package productos;
import java.util.*;
public class TestHerenciaProducto {
	public static void main(String args[]) {
		Scanner teclado= new Scanner(System.in);
		Productos pro=null;
		Frescos fresco= new Frescos();
		Refrigerados refri= new Refrigerados();
		CongeladosAire cong=new CongeladosAire();
		CongeladosAgua conga=new CongeladosAgua();
		CongeladosNitrogeno congn=new CongeladosNitrogeno();
		int opc;
		System.out.println("que producto quieres ingresar los datos?");
		System.out.println("0- salir");
		System.out.println("1- producto fresco");
		System.out.println("2- producto refrigerado");
		System.out.println("3- producto congelado");
		System.out.println("4- imprimir producto");
		
		do {
			
			opc=teclado.nextInt();
			switch (opc) {
			case 1:
				System.out.println("ingresa los datos del producto fresco");
				System.out.println("numero de lote:");
				fresco.setLote(teclado.nextInt());
				System.out.println("pais: ");
				fresco.setPaisOrigen(teclado.nextLine());
				fresco.setPaisOrigen(teclado.nextLine());
				System.out.println("fecha de envasado: ");
				fresco.setFechaEnvasado(teclado.nextLine());
				System.out.println("fecha de caducidad: ");
				fresco.setFechaCaducidad(teclado.nextLine());
				
				
				break;
			case 2: 
				System.out.println("ingresa los datos del produto refrigerado");
				System.out.println("numero de lote:");
				refri.setLote(teclado.nextInt());
				System.out.println("pais: ");
				refri.setPaisOrigen(teclado.nextLine());
				
			
			}
			
		}while(opc!=5);
		
		
	}
}
