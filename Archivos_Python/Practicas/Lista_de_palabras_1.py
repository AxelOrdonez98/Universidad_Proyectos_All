numPal = int(input("Ingrese el numero de palabras en la lista: "))
pal = []
if numPal == 0:
    print("El arreglo esta vacio")
else:
    for i in range(numPal):
        aux = input("Ingrese una palabra: ")
        pal.append(aux)
    print(pal)