def suma(*lista):
    mayor = 0
    for i in range(len(lista)):
        if lista[i] >= 18:
            mayor += 1
    return print("Mayor oh igual a 18: ", str(mayor))
suma(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)