def palabra():
    mux = input("Ingrese una palabra: ")
    pal = mux
    cont = 0
    for i in range(len(mux)):
        pal = mux[i]
        if pal == "a" or pal == "A":
            cont += 1
    return print("Palabra: ", str(mux), "\n-Numero de vocales: ", str(cont))
palabra()