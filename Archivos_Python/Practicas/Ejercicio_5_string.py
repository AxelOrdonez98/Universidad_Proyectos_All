ora = input("Ingrese una oracion: ")
letra = ora
cont = 0
i = 0
aux = 0
auxle = ora[0]
print(ora[:2])
while cont < len(ora):
    letra = ora[cont]
    cont += 1
    if letra == " " :
        i = cont
        auxle += ora[i]
print(auxle)

