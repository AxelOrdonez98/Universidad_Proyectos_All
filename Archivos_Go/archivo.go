package main
import "fmt"
import "os"
func main(){
	emptyFile, err := os.Create("empty.txt")
	if err != nil{
		log.Fatal(err)
	}
	log.Print(emptyFile)
	emptyFile.Close
}