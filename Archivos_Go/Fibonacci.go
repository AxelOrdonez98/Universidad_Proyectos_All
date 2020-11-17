package main
import "fmt"
var selec int
func Elacumo() func() int {
	uno := 0
	dos := 1
	return func() int {
		acum := uno + dos
		uno = dos
		dos = acum
		return uno
	}
}
func main() {
	fmt.Print("Digite hasta que iteracion quiere la serie: ")
	fmt.Scan(&selec)
	if selec <= 20 {
		llamar := Elacumo()
		for i := 0; i < selec; i++ {
			fmt.Println(llamar())
		}
		fmt.Println("\tAdios")
	} else {
		fmt.Println("Sobre pasa el rango maximo")
		fmt.Println("\tAdios")
	}
}