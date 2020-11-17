ora = input("Ingrese una clave: ")
conta = 0
letra = ora
aux = 0
while aux < len(ora) :
    letra += ora[aux]
    aux += 1
if aux < 10 :
    print("\tError. La clave ingresada es menor a 10 caracteres")
elif aux > 20 :
    print("\tError. La clave ingresada es mayor a 20 caracteres")
else :
    print("\tLa calve ingresada es valida: " + str(letra))