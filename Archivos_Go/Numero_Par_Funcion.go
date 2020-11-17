package main
import "fmt"
var par string
var impar string
var num1 int64
var num2 int64

func main() {
	fmt.Println("ingresa dos numeros: ")
	fmt.Println("numero 1: ")
	fmt.Scan(&num1)
	fmt.Println("numero 2: ")
	fmt.Scan(&num2)
	fmt.Println(parImpar(num1, num2))
}

func parImpar(num1 int64, num2 int64) (string, string) {
	if num1%2 == 0 && num2%2 == 1 {
		par = "numero 1 es par"
		impar = "numero 2 es impar"
	}
	if num1%2 == 1 && num2%2 == 0 {
		par = "numero 1 es impar"
		impar = "numero 2 es par"
	}
	if num1%2 == 1 && num2%2 == 1 {
		par = ""
		impar = "ambos numeros son impares"
	}
	if num1%2 == 0 && num2%2 == 0 {
		par = "ambos numeros son pares"
		impar = ""
	}

	return par, impar
}