def palabra(mux):
    pal = mux
    cont = 0
    for i in range(len(mux)):
        pal = mux[i]
        if pal == "a" or pal == "e" or pal =="i" or pal == "o" or pal == "u":
            cont += 1
    return print("Palabra: ", str(mux), "\n-Numero de vocales: ", str(cont))
palabra("muchos")
palabra("hola")
palabra("adios")