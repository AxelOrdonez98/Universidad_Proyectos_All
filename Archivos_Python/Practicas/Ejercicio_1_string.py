ora = input("Ingrese una oracion: ")
conta = 0
letra = ora
aux = 0
while aux < len(ora) :
    letra = ora[aux]
    if letra == "" or letra == " " :
        conta +=1
    aux += 1
print("Numero de espacios en la oracion: ", str(conta))