ora = input("Ingrese una oracion: ")
conta = 0
letra = ora
aux = 0
vocal = ""
while aux < len(ora) :
    letra = ora[aux]
    aux += 1
    if letra == "a" or letra == "e" or letra == "i" or letra == "o" or letra == "u" :
        vocal += letra
        conta +=1
print("Oracion con vocales: ", str(vocal))
print("Numero de volcales en la oracion: ", str(conta))