def nombre():
    print("\tOscar Axel Ortiz\n\t1er Parcial\n\tTurno Matutino\n\t5.-A\n\tIng. en Software")
nombre()
palabra = input("Ingrese una oracion: ")
letra = ""
aux = ""
i = 0
while i < len(palabra):
    letra = palabra[i]
    i += 1
    if letra == " ":
        aux += letra
print("Palabra final: ", str(aux))