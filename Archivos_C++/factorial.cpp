#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]){
    long int Resultado=0;
    long int Factorial;
    printf("Introduzca el nuemro para calcular el factorial: ");
    scanf(" %ld", &Factorial);
    Resultado = 1;
    while(Factorial > 1) {
       Resultado *= Factorial;
       printf(" %ld x",Factorial);
       Factorial--;
    }
    printf(" 1 = %ld\n\n",Resultado);
  system("PAUSE");
}