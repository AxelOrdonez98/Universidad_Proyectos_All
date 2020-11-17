package main
import "fmt"
import "os"
func main(){
	var opc float32
	var num1,num2 float32
	for {
		fmt.Print("Ingrese el numero 1: ")
		fmt.Scan(&num1)
		fmt.Print("Ingrese el numero 2: ")
		fmt.Scan(&num2)
		fmt.Println("\t1) Suma\n" + 
				    "\t2) Resta\n" +
				    "\t3) Multiplicacion\n" +
				    "\t4) Division\n" +
				    "\t5) Salir")
		fmt.Print("Seleccione una opcion: ")
		fmt.Scan(&opc)
		switch opc {
		case 1 :
			suma(num1, num2)
		case 2 :
			resta(num1, num2)
		case 3 :
			multi(num1, num2)
		case 4 :
			div(num1, num2)
		case 5 :
			fmt.Println("\tAdios")
			os.Exit(0)
		default :
			fmt.Print("Ingrese una opcion valida")
		}
	}
}
func suma(num1, num2 float32){
	var respuesta = num1 + num2
	fmt.Println("El resultado de la suma es: ", respuesta)
}
func resta(num1, num2 float32){
	 var respuesta = num1 - num2
	fmt.Println("El resultado de la resta es: ", respuesta)
}
func multi(num1, num2 float32){
	var respuesta = num1 * num2
	fmt.Println("El resultado de la multiplicacion es: ", respuesta)
}
func div(num1, num2 float32){
	 var respuesta = num1 / num2
	fmt.Println("El resultado de la division es: ", respuesta)
}