palabras = []

numero = input("ingrese un numero: ")

for x in range(numero):
    valor = raw_input("Ingrese palabra " + str(x+1) + ": ")
    palabras.append(valor)

print(palabras)
palabra = raw_input("ingrese palabra para eliminar: ")
palabras.remove(palabra)
print(palabras)
