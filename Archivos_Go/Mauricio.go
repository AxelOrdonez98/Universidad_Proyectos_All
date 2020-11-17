package main
import "fmt"
func main() {
	arreglo := [...]int {18, 28, 21, 96, 97}
	for i := 0; i < len(arreglo); i++ {
		fmt.Println(arreglo[i])
	}
}