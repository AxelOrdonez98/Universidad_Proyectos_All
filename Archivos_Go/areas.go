package main
import "fmt"
func main(){
	var a,b float32
	var radio float32
	var hipo float32
	var perimT, periC float32
	var areaT, areaC float32
	const pi = 3.14159265358979
	fmt.Print("Ingrese base del triangulo: ")
	fmt.Scan(&a)
	fmt.Print("Ingrese altura del triangulo: ")
	fmt.Scan(&b)
	fmt.Print("Ingrese la hipotenusa del triangulo: ")
	fmt.Scan(&hipo)
	fmt.Print("Ingrese el radio del circulo: ")
	fmt.Scan(&radio)
	perimT = a+b+hipo
	areaT = (a*b)/2
	periC = 2*pi*radio
	areaC = pi*(radio*radio)
	fmt.Println("\tEl perimetro del triangulo es: ", perimT)
	fmt.Println("\tEl area del triangulo es: ", areaT)
	fmt.Println("\tEl perimetro del circulo es: ", periC)
	fmt.Println("\tEl area del circulo es: ", areaC)
}