palabras = []

numero = input("ingrese un numero: ")

for x in range(numero):
    valor = raw_input("Ingrese palabra " + str(x+1) + ": ")
    palabras.append(valor)

print(palabras)
palabra1 = raw_input("ingrese otra palabra")
palabra2 = raw_input("ingrese otra palabra")
palabras[1] = palabra1
print(palabras)