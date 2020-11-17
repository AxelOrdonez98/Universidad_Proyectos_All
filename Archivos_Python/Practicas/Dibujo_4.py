alto = int(input("Ingrese una altura: "))
ancho = int(input("Ingrese una anchura: "))
for x in range(1, alto+1):
    for y in range(1, ancho+1):
        print("*", end="")
    print("")