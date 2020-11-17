package main
import "fmt"
import "os"
func main(){
	var num int
	for {
		fmt.Print("Ingrese un numero: ")
		fmt.Scan(&num)
		switch num {
		case 0:
			fmt.Println("\tAdios")
			os.Exit(0)
		case 1 :
			fmt.Println("Lunes")
		case 2 :
			fmt.Println("Martes")
		case 3 :
			fmt.Println("MIercoles")
		case 4 :
			fmt.Println("Jueves")
		case 5 :
			fmt.Println("Viernes")
		case 6 :
			fmt.Println("Sabado")
		case 7 :
			fmt.Println("Domingo")
		default :
			fmt.Println("Numero: ", num)
		}
	}
}