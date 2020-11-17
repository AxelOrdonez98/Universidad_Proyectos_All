x = 2
pal = ""
acum = 0
while x != 0:
    x = int(input("0) Salir\n1) Ingresar casos\nOpcion: "))
    if x == 1:
        opc = int(input("\tCunatos casos desea evaluar\n-1\n-2\n-3\nOpcion: "))
        if opc == 1:
            caso1 = int(input("Ingrese las avellanas: "))
            bin1 = bin(caso1)
            for i, a in enumerate(bin1):
                if a == "1":
                    acum += 1
            print("Numero de avellanas a dar: ", str(acum))
            acum = 0

        elif opc == 2:
            caso1 = int(input("Ingrese las avellanas: "))
            bin1 = bin(caso1)
            caso2 = int(input("Ingrese las avellanas: "))
            bin2 = bin(caso2)
            for i, a in enumerate(bin1):
                if a == "1":
                    acum += 1
            print("Numero de avellanas en el caso 1: ", str(acum))
            acum = 0
            for i, a in enumerate(bin2):
                if a == "1":
                    acum += 1
            print("Numero de avellanas en el caso 2: ", str(acum))
            acum = 0
        elif opc == 3:
            caso1 = int(input("Ingrese las avellanas: "))
            bin1 = bin(caso1)
            caso2 = int(input("Ingrese las avellanas: "))
            bin2 = bin(caso2)
            caso3 = int(input("Ingrese las avellanas: "))
            bin3 = bin(caso3)
            for i, a in enumerate(bin1):
                if a == "1":
                    acum += 1
            print("Numero de avellanas en el caso 1: ", str(acum))
            acum = 0
            for i, a in enumerate(bin2):
                if a == "1":
                    acum += 1
            print("Numero de avellanas en el caso 2: ", str(acum))
            acum = 0
            for i, a in enumerate(bin3):
                if a == "1":
                    acum += 1
            print("Numero de avellanas en el caso 3: ", str(acum))
            acum = 0