numero = [1, 5, 5, 7, 8]
iguales = 0
mayor = 0
for i in range(5) :
    iguales = numero[i]
    mayor = numero[i]
    if iguales == numero[i] :
        print("Numero que se repite: ", str(iguales))
    if mayor >= 7 :
        print("Numero igual oh mayor a 7: ", str(mayor))
