package main
import "fmt"
func main() {
	var numCal int
	acum := 0
	fmt.Print("Ingrese el numero de calificaciones: ")
	fmt.Scan(&numCal)
	calificaciones := make([]int, numCal)
	for i := 0; i<len(calificaciones); i++{
		fmt.Print("Ingrese la calificacion " , i ,": ")
		fmt.Scan(&calificaciones[i])
		acum += calificaciones[i]
	}
	promedio := acum / len(calificaciones)
	fmt.Println("El promedio es:", promedio)
}