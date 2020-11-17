ora = input("Ingrese una oracion: ")
letra = ""
aux = 0
while aux < len(ora) :
    letra += ora[aux] + ","
    aux += 1
print(letra)