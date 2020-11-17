import os
n = int(input("Ingrese un numero entero [1-10]: "))
archivo = open("n_tabla.txt", "w")
resultado = 0
for i in range(1, n+1):
    print(i)
    resultado = i * n
    archivo.write("{} x {} = {}\n".format(n, i, resultado))
archivo.close()