palabras = []
palabras2 = []

numero = input("ingrese un numero: ")

for x in range(numero):
    valor = raw_input("Ingrese palabra " + str(x+1) + ": ")
    palabras.append(valor)

for  x in reversed(palabras):
    palabras2.append(x)

print(palabras)
print(palabras2)    
