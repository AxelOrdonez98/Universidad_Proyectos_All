x = 1
while x != 0:
    x = int(input("0) Salir\n1) Ingresar casos\nOpcion: "))
    if x == 1:
        opc = int(input("\tCuantos casos desea evaluar\nCasos: "))
        for i in range(opc):
            avellanas = int(input("\tAvellanas: "))
            biario = bin(avellanas)
            acum = 0
            for i, a in enumerate(biario) :
                if a == "1":
                    acum += 1
            print("-Numero de avellanas a dar: ", str(acum))