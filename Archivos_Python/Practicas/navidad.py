dia = int(input("Ingrese un dia (1-30): "))
mes = int(input("Ingrese un mes (1-12): "))
year = int(input("Ingrese un año: "))
if dia == 25 and mes == 12:
    print("La fache ingresada es navidad")
else :
    print("La fecha ingresada es: " + str(dia) + "/" + str(mes) + "/" + str(year))