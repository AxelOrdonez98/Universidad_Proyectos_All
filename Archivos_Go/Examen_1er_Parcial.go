package main
import "fmt"
func main() {
	var numCal int
	acum := 0
	fmt.Print("Ingrese el numero a comparar: ")
	fmt.Scan(&numCal)
	calificaciones := make([]int, 10)
	for i := 0; i < len(calificaciones); i++ {
		fmt.Print("\nIngrese un numero ", i, ": ")
		fmt.Scan(&calificaciones[i])
		if numCal == calificaciones[i] {
			acum = acum + 1
		}
		if calificaciones[i] <= 0 {
			fmt.Print("\n\tERROR: El numero debe ser mayor que cero")
		}
	}
	for i := 0; i < len(calificaciones); i++ {
		fmt.Print("\nNumero: ", calificaciones[i])
	}
	fmt.Print("\nNumero de veces que se ingreso el numero que se comparo: ", acum)
}
//Axel Ordoñez