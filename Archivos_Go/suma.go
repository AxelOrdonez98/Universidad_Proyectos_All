package main
import "fmt"
func main(){
	var a,c,b float32
	fmt.Print("Ingrese un numero: ")
	fmt.Scan(&a)
	fmt.Print("Ingrese un numero: ")
	fmt.Scan(&c)
	b = a+c
	fmt.Println("Suma: ",b)
	b = a-c
	fmt.Println("Resta: ",b)
	b = a*c
	fmt.Println("Multiplicacion: ",b)
	b = a/c
	fmt.Println("Division: ",b)
}