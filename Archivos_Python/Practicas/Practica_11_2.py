def funcion():
    n1 = float(input("Ingrese un numero: "))
    n2 = float(input("Ingrese un numero: "))
    n3 = float(input("Ingrese un numero: "))
    if n1 > n2 and n1 > n3:
        return print("Numero mayor: ", str(n1))
    elif n2 > n1 and n2 > n3:
        return print("Numero mayor: ", str(n2))
    else:
        return print("Numero mayor: ", str(n3))
funcion()