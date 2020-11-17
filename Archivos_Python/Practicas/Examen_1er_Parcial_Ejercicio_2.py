def nombre():
    print("\tOscar Axel Ortiz\n\t1er Parcial\n\tTurno Matutino\n\t5.-A\n\tIng. en Software")
nombre()
palabra = input("Ingrese una palabra: ")
palindromo = palabra[::-1] #::-1 volte a la palabra
print("\t", palindromo)
aux = 0
if palabra == palindromo:
    print("La oracion ingresada es un palindromo")
else :
    print("La palabra ingresada no es un palindromo")